package com.api.crud.models;


import jakarta.persistence.*;
import org.hibernate.persister.collection.mutation.UpdateRowsCoordinatorNoOp;

import java.math.BigDecimal;

@Entity
@Table(name ="Primas")
public class PrimasModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long Codigo;
    private Integer EdadMin;
    private Integer EdadMax;
    private BigDecimal PorcentajePrima;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return Codigo;
    }

    public void setCodigo(Long codigo) {
        Codigo = codigo;
    }

    public Integer getEdadMin() {
        return EdadMin;
    }

    public void setEdadMin(Integer edadMin) {
        EdadMin = edadMin;
    }

    public Integer getEdadMax() {
        return EdadMax;
    }

    public void setEdadMax(Integer edadMax) {
        EdadMax = edadMax;
    }

    public BigDecimal getPorcentajePrima() {
        return PorcentajePrima;
    }

    public void setPorcentajePrima(BigDecimal porcentajePrima) {
        PorcentajePrima = porcentajePrima;
    }
}
