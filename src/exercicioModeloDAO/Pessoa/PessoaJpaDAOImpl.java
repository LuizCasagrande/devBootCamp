package exercicioModeloDAO.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaJpaDAOImpl implements PessoaCrudDAO{
    private List<Pessoa> pessoaList = new ArrayList<>();

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Jpa - Registro incluido com sucesso");
        pessoaList.add(pessoa);
        return pessoa;
    }
}

