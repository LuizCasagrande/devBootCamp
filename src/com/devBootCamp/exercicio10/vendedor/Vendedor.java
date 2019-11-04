package com.devBootCamp.exercicio10.vendedor;

import com.devBootCamp.exercicio10.crud.BaseObject;

public class Vendedor extends BaseObject {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
