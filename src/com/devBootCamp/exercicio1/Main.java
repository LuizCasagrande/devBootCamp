package com.devBootCamp.exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz");
        pessoa.setSobrenome("Casagrande");
        pessoa.setCpf("12312312345");
        pessoa.setEmail("Luiz@gmail.com");

        LocalDate localDate = LocalDate.of(2001,10,26);
        pessoa.setNascimento(localDate);
        Endereco endereco = new Endereco("Av Tupi", 4321, "Centro");
        pessoa.getEnderecos().add(endereco);
        Telefone telefone = new Telefone();
        telefone.setNumero("99881234");
        telefone.setTipo(TipoTelefone.CELULAR);
        pessoa.getTelefones().add(telefone);

        pessoa.populaDados();
    }
}
