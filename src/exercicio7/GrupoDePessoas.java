package exercicio7;

import java.util.ArrayList;
import java.util.List;

public class GrupoDePessoas {
    private List<Pessoa> maiores = new ArrayList<>();
    private List<Pessoa> menores = new ArrayList<>();

    public List<Pessoa> getMaiores() {
        return maiores;
    }

    public void setMaiores(List<Pessoa> maiores) {
        this.maiores = maiores;
    }

    public List<Pessoa> getMenores() {
        return menores;
    }

    public void setMenores(List<Pessoa> menores) {
        this.menores = menores;
    }

    public void pessoasmaiores() {
        System.out.println("Pessoas maiores de idade: ");
        for (Pessoa maior : maiores) {
            maior.printpessoa();
        }
    }

    public void pessoasmenores() {
        System.out.println("Pessoas menores de idade: ");
        for (Pessoa menor : menores) {
        menor.printpessoa();
        }
    }

    public void adicionar(Pessoa pessoa) {
        if (pessoa.getIdade() >= 18 && pessoa.getIdade() > 0) {
            maiores.add(pessoa);
        } else if(pessoa.getIdade() > 0 ) {
            menores.add(pessoa);
        } else {
            System.out.println("Idade invalida");
        }
    }

}

