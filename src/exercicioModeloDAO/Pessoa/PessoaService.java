package exercicioModeloDAO.Pessoa;

import java.util.List;

public interface PessoaService {

    Pessoa save(Pessoa pessoa);
    List<Pessoa> findAll();
    void delete(Integer id);
    Pessoa FindById(Integer id);

}
