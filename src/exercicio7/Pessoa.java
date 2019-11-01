package exercicio7;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Pessoa(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void printpessoa() {
        System.out.println("Nome: "+ getNome());
        System.out.println("Cpf: "+ getCpf());
        System.out.println("Email: "+ getEmail());
        System.out.println("Idade: "+ getIdade());
        System.out.println();
    }

}
