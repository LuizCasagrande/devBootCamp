package com.devBootCamp.exercicio10.vendedor;

import com.devBootCamp.exercicio10.crud.BaseObject;

import java.math.BigDecimal;

public class Vendedor extends BaseObject {

    private String nome;
    private BigDecimal percentualDeComissao;
    private BigDecimal percentualDeDescontoMaximo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(BigDecimal percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public BigDecimal getPercentualDeDescontoMaximo() {
        return percentualDeDescontoMaximo;
    }

    public void setPercentualDeDescontoMaximo(BigDecimal percentualDeDescontoMaximo) {
        this.percentualDeDescontoMaximo = percentualDeDescontoMaximo;
    }
}
