package exercicioModeloDAO.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaJpaServiceImpl implements PessoaService {

    private PessoaCrudDAO pessoaCrudDAO = new PessoaJpaDAOImpl();

    @Override
    public Pessoa save(Pessoa pessoa) {
        return pessoaCrudDAO.save(pessoa);
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("");
        return pessoaCrudDAO.findAll();
    }

    @Override
    public void delete(Integer id) {
        pessoaCrudDAO.delete(id);
    }
}
