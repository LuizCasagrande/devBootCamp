package com.devBootCamp.exercicio1;

public enum TipoTelefone {
    COMERCIAL ("Telefone Comercial"),
    RESIDENCIAL ("Telefone Residencial"),
    CELULAR ("Telefone Cecular");

    private String label;

    TipoTelefone(String label){
        this.label = label;
    }

    public String getLabel() {

        return label;

    }
}
