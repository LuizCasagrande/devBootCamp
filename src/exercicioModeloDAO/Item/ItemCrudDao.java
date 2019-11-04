package exercicioModeloDAO.Item;

import java.util.List;

public interface ItemCrudDao {

    Item save(Item item);
    List<Item> findAll();
    void delete(Integer id);
    Item findById (Integer id);

}
