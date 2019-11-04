package exercicioModeloDAO.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario save(Usuario usuario);
    List<Usuario> findAll();
    void delete(Integer id);
    Usuario findById (Integer id);


}
