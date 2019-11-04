package exercicioModeloDAO.Usuario;

import java.util.List;

public interface UsuarioCrudDao {

    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    void delete(Integer id);
    Usuario findById (Integer id);

}
