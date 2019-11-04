package exercicioModeloDAO;

import exercicioModeloDAO.Pessoa.Pessoa;
import exercicioModeloDAO.Pessoa.PessoaCrudDAO;
import exercicioModeloDAO.Pessoa.PessoaJpaDAOImpl;

public class Main {

    public static void main(String[] args) {

        PessoaCrudDAO pessoaDAO = new PessoaJpaDAOImpl();
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123123");
        pessoa.setNome("Luiz");
        pessoa = pessoaDAO.save(pessoa);
        System.out.println("Pessoa ID: " + pessoa.getId());

    }
}
