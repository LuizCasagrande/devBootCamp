package com.devBootCamp.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String  cpf;
    private String email;
    private LocalDate nascimento;
    private List<Endereco> enderecos = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void populaDados() {

        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Cpf: " + cpf);
        System.out.println("E-Mail: " + email);
        System.out.println("Data de nascimento: " + nascimento);

        for (Telefone t : telefones) {
            System.out.println("Número de telefone: " + t.getNumero());
            System.out.println("Tipo de telefone: " + t.getTipo());
        }
        for (Endereco e : enderecos) {
            System.out.println("Rua: " + e.getEndereco());
            System.out.println("Número: " + e.getNumero());
            System.out.println("Bairro: " + e.getBairro());
        }
    }
}
