package com.devBootCamp.exercicio10.item;

import com.devBootCamp.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Item extends BaseObject {

    private String descricao;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
