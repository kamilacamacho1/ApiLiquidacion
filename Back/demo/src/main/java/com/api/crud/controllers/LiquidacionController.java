package com.api.crud.controllers;

import com.api.crud.entity.LiquidacionEntity;
import com.api.crud.entity.LiquidacionTotalResponse;
import com.api.crud.entity.PolizaEntity;
import com.api.crud.models.AmparosModels;
import com.api.crud.models.AseguradosModels;
import com.api.crud.models.PrimasModels;
import com.api.crud.repositories.IAmparoRepository;
import com.api.crud.repositories.IAseguradoRepository;
import com.api.crud.repositories.IPrimaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class LiquidacionController {

    @Autowired
    private IAseguradoRepository aseguradoRepository;

    @Autowired
    private IAmparoRepository amparoRepository;

    @Autowired
    private IPrimaRepository primaRepository;

    @PostMapping
    public ResponseEntity<?> calcularLiquidacion(@RequestBody PolizaEntity poliza) {
        try {
            // Verifica que los datos de entrada sean válidos
            if (poliza.getTipoIdentificacion() <= 0 || poliza.getNumeroIdentificacion() == null ||
                    poliza.getValorAsegurado().compareTo(BigDecimal.ZERO) <= 0 ) {
                return ResponseEntity.status(500).body("Error: Datos de entrada inválidos");
            }
            // Busca el asegurado en la base de datos
            AseguradosModels asegurado = aseguradoRepository.findByTipoIdentificacionAndNroIdentificacion(
                    poliza.getTipoIdentificacion(), poliza.getNumeroIdentificacion());


            // Obtiene la edad del asegurado
            int edad = calcularEdad(asegurado.getFechaNaciemiento());

            // Consulta las primas aplicables a la edad del asegurado
            List<PrimasModels> primas = primaRepository.findByEdad(edad);

            // Verifica si existen primas aplicables
            if (primas.isEmpty()) {
                return ResponseEntity.ok("No se aplican amparos");
            }

            // Calcula la liquidación para cada prima aplicable
            BigDecimal valorTotal = BigDecimal.ZERO;
            for (PrimasModels prima : primas) {
                // Consulta el amparo correspondiente a la prima
                AmparosModels amparo = amparoRepository.findById(prima.getCodigo()).orElse(null);

                // Verifica que el amparo exista
                if (amparo != null) {
                    // Calcula el valor de la prima
                    BigDecimal valorPrima = poliza.getValorAsegurado().multiply(prima.getPorcentajePrima());

                    // Construye la respuesta JSON
                    LiquidacionEntity liquidacionResponse = new LiquidacionEntity(
                            asegurado.getTipoIdentificacion(),
                            asegurado.getNumeroIdentificacion(),
                            poliza.getValorAsegurado(),
                            amparo.getCodigo(),
                            amparo.getNombre(),
                            valorPrima
                    );

                    // Agrega la liquidación al valor total
                    valorTotal = valorTotal.add(valorPrima);

                }
            }

            // Retorna la respuesta JSON con la liquidación total
            return ResponseEntity.ok(new LiquidacionTotalResponse(
                    asegurado.getTipoIdentificacion(),
                    asegurado.getNumeroIdentificacion(),
                    poliza.getValorAsegurado(),
                    valorTotal
            ));
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error interno: " + e.getMessage());
        }
    }

    // Método para calcular la edad a partir de la fecha de nacimiento
    private int calcularEdad(LocalDate fechaNacimiento) {
        // Lógica para calcular la edad
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
}
