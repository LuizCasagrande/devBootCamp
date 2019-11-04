package exercicioModeloDAO.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PessoaConsoleDaoImpl implements PessoaCrudDAO {

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Console - Registro incluido com sucesso");
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        System.out.println("");
        return new ArrayList<>();
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Pessoa findById(Integer id) {
        return new Pessoa();
    }
}
