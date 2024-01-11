package com.api.crud.entity;

import com.api.crud.models.AmparosModels;

import java.math.BigDecimal;

public class LiquidacionEntity {
    private Long tipoIdentificacion;
    private Long NumeroIdentificacion;
    private BigDecimal ValorAsegurado;
    private Integer ValorTotal;
    private AmparosModels LiquidacionAmparo;

    public LiquidacionEntity(Long tipoIndentificacion, Long numeroIdentificacion, BigDecimal valorAsegurado, String codigo, String nombre, BigDecimal valorPrima) {
    }

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

    public Integer getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        ValorTotal = valorTotal;
    }

    public AmparosModels getLiquidacionAmparo() {
        return LiquidacionAmparo;
    }

    public void setLiquidacionAmparo(AmparosModels liquidacionAmparo) {
        LiquidacionAmparo = liquidacionAmparo;
    }
}
