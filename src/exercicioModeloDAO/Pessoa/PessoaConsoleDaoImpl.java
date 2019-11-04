package exercicioModeloDAO.Pessoa;

import java.util.Random;

public class PessoaConsoleDaoImpl implements PessoaCrudDAO {

    @Override
    public Pessoa save(Pessoa pessoa) {
        pessoa.setId(new Random().nextInt());
        System.out.println("Console - Registro incluido com sucesso");
        return pessoa;
    }
}
