package com.devBootCamp.exercicio1;

public class Telefone {
    private String numero;
    private TipoTelefone tipo;

    public String getNumero() {
        return numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }
}
