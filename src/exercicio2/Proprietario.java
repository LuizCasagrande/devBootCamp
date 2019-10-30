package exercicio2;

import java.time.LocalDate;

public class Proprietario {
    private String nome;
    private String cpf;
    private String rg;
    private LocalDate nascimento;
    private Endereco endereco;

    public Proprietario(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
