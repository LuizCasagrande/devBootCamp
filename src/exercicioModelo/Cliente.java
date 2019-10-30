package exercicioModelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf;
    private List<Endereco> enderecos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void populaDados() {

        System.out.println("Id do Cliente: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);

        for (Endereco e : enderecos) {
            System.out.println("Rua: " + e.getRua());
            System.out.println("Número: " + e.getNumero());
            System.out.println("Bairro: " + e.getBairro());
            System.out.println("Tipo de Endereco: "+ e.getTipo().getLabel());
        }
    }
}