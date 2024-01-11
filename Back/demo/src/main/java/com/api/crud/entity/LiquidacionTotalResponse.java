package com.api.crud.entity;

import java.math.BigDecimal;

public class LiquidacionTotalResponse {
    private Long tipoIdentificacion;
    private Long nroIdentificacion;
    private BigDecimal valorAsegurado;
    private BigDecimal valorTotal;


    public LiquidacionTotalResponse(Long tipoIndentificacion, Long numeroIdentificacion, BigDecimal valorAsegurado, BigDecimal valorTotal) {
    }

    public Long getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(Long tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(Long nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public BigDecimal getValorAsegurado() {
        return valorAsegurado;
    }

    public void setValorAsegurado(BigDecimal valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
