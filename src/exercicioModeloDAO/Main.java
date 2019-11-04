package exercicioModeloDAO;

import exercicioModeloDAO.Pessoa.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        PessoaService pessoaService = new PessoaJpaServiceImpl();
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123123");
        pessoa.setNome("Luiz");
        pessoa = pessoaService.save(pessoa);
        System.out.println("Pessoa ID: " + pessoa.getId());

        Pessoa pessoa2 = new Pessoa();
        pessoa.setCpf("456456456");
        pessoa.setNome("Leonardo");
        pessoa = pessoaService.save(pessoa2);
        System.out.println("Pessoa ID: " + pessoa.getId());

        Pessoa pessoa3 = new Pessoa();
        pessoa.setCpf("789789789");
        pessoa.setNome("Gabriel");
        pessoa = pessoaService.save(pessoa3);
        System.out.println("Pessoa ID: " + pessoa.getId());

        pessoaService.delete(pessoa2.getId());

        List<Pessoa> pessoaList = pessoaService.findAll();
        for (Pessoa p : pessoaList) {
            System.out.println("Nome: " + p.getNome());
        }


    }
}
