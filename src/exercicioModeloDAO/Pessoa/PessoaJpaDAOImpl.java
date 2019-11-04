package exercicioModeloDAO.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Filter;

public class PessoaJpaDAOImpl implements PessoaCrudDAO{
    private List<Pessoa> pessoaList = new ArrayList<>();

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Jpa - Registro incluido com sucesso");
        pessoaList.add(pessoa);
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("");
        return new ArrayList<>();
    }

    @Override
    public void delete(Integer id) {
        pessoaList.removeIf(pessoa -> pessoa.getId().equals(id));
        System.out.println("Jpa delete");
    }

    @Override
    public Pessoa findById(Integer id) {
        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getId().equals(id)) {
                return pessoa;
            }

        }
        return new Pessoa();

//        return pessoaList.stream()
//                - Filter(pessoa -> pessoa.getId().equals(id))
//                - findAny()
//                - orElse(new Pessoa());



    }
}

