package exercicioModeloDAO.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemJpaDaoImpl implements ItemCrudDao {
    private List<Item> itemList = new ArrayList<>();

    @Override
    public Item save(Item item) {
        item.setId(new Random().nextInt());
        System.out.println("Registro incluido com sucesso");
        itemList.add(item);
        return item;
    }

    @Override
    public List<Item> findAll() {
        System.out.println("Find All");
        return itemList;
    }

    @Override
    public void delete(Integer id) {
        itemList.removeIf(item -> item.getId().equals(id));
        System.out.println("Delete");
    }

    @Override
    public Item findById(Integer id) {
        for (Item item : itemList) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return new Item();

    }
}
