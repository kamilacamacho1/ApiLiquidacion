package com.api.crud.models;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name ="Asegurados")
public class AseguradosModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long TipoIdentificacion;
    private Long NumeroIdentificacion;
    private  String Apellidos;
    private  String Nombre;
    private Integer Sexo;
    private LocalDate FechaNaciemiento;

    public Long getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(Long tipoIdentificacion) {
        TipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getSexo() {
        return Sexo;
    }

    public void setSexo(Integer sexo) {
        Sexo = sexo;
    }

    public LocalDate getFechaNaciemiento() {
        return FechaNaciemiento;
    }

    public void setFechaNaciemiento(LocalDate fechaNaciemiento) {
        FechaNaciemiento = fechaNaciemiento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


}
