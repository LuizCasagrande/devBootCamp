package exercicioModeloDAO.Item;

import java.util.List;

public class ItemJpaServiceImpl implements ItemService {

    private ItemCrudDao itemCrudDAO = new ItemJpaDaoImpl();

    @Override
    public Item save(Item item) {
        return itemCrudDAO.save(item);
    }

    @Override
    public List<Item> findAll() {
        return itemCrudDAO.findAll();
    }

    @Override
    public void delete(Integer id) {
        itemCrudDAO.delete(id);
    }

    @Override
    public Item FindById(Integer id) {
        return itemCrudDAO.findById(id);
    }
}
