package exercicioModeloDAO;

import exercicioModeloDAO.Item.Item;
import exercicioModeloDAO.Item.ItemJpaServiceImpl;
import exercicioModeloDAO.Item.ItemService;
import exercicioModeloDAO.Pessoa.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ItemService itemService = new ItemJpaServiceImpl();
        Item item = new Item();
        item.setDescricao("Item");
        item.setQuantidade(BigDecimal.valueOf(1));
        item.setValorUnitario(BigDecimal.valueOf(12));
        item = itemService.save(item);
        System.out.println("Item ID: " + item.getId());

        Item item2 = new Item();
        item2.setDescricao("Item 2");
        item2.setQuantidade(BigDecimal.valueOf(1));
        item2.setValorUnitario(BigDecimal.valueOf(10));
        item2 = itemService.save(item);
        System.out.println("Item ID: " + item.getId());

        Item item3 = new Item();
        item3.setDescricao("Item 3");
        item3.setQuantidade(BigDecimal.valueOf(1));
        item3.setValorUnitario(BigDecimal.valueOf(15));
        item3 = itemService.save(item);
        System.out.println("Item ID: " + item.getId());

        Item item4 = new Item();
        item4.setDescricao("Item 4");
        item4.setQuantidade(BigDecimal.valueOf(2));
        item4.setValorUnitario(BigDecimal.valueOf(8));
        item4 = itemService.save(item);
        System.out.println("Item ID: " + item.getId());

        itemService.delete(item4.getId());
        List<Item> itemList = itemService.findAll();
        for (Item i : itemList) {
            System.out.println("Descricao: " + i.getDescricao());
        }

//        PessoaService pessoaService = new PessoaJpaServiceImpl();
//        Pessoa pessoa = new Pessoa();
//        pessoa.setCpf("123123123");
//        pessoa.setNome("Luiz");
//        pessoa = pessoaService.save(pessoa);
//        System.out.println("Pessoa ID: " + pessoa.getId());
//
//        Pessoa pessoa2 = new Pessoa();
//        pessoa.setCpf("456456456");
//        pessoa.setNome("Leonardo");
//        pessoa = pessoaService.save(pessoa2);
//        System.out.println("Pessoa ID: " + pessoa.getId());
//
//        Pessoa pessoa3 = new Pessoa();
//        pessoa.setCpf("789789789");
//        pessoa.setNome("Gabriel");
//        pessoa = pessoaService.save(pessoa3);
//        System.out.println("Pessoa ID: " + pessoa.getId());
//
//        pessoaService.delete(pessoa2.getId());
//
//        List<Pessoa> pessoaList = pessoaService.findAll();
//        for (Pessoa p : pessoaList) {
//            System.out.println("Nome: " + p.getNome());
//        }


    }
}
