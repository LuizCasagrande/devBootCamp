package exercicioModeloDAO.Item;

import java.util.List;

public interface ItemService {

    Item save(Item item);
    List<Item> findAll();
    void delete(Integer id);
    Item findById(Integer id);

}
