package com.api.crud.entity;

import java.math.BigDecimal;

public class PolizaEntity {
    private Long tipoIdentificacion;
    private Long NumeroIdentificacion;
    private BigDecimal ValorAsegurado;

    public Long getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Long tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

    public BigDecimal getValorAsegurado() {
        return ValorAsegurado;
    }

    public void setValorAsegurado(BigDecimal valorAsegurado) {
        ValorAsegurado = valorAsegurado;
    }
}
