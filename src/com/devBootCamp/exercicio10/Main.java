package com.devBootCamp.exercicio10;

import com.devBootCamp.exercicio10.item.Item;
import com.devBootCamp.exercicio10.item.ItemService;
import com.devBootCamp.exercicio10.item.ItemServiceImpl;
import com.devBootCamp.exercicio10.pedido.Pedido;
import com.devBootCamp.exercicio10.pedido.PedidoItem;
import com.devBootCamp.exercicio10.pedido.PedidoService;
import com.devBootCamp.exercicio10.pedido.PedidoServiceImpl;
import com.devBootCamp.exercicio10.cliente.Cliente;
import com.devBootCamp.exercicio10.cliente.ClienteService;
import com.devBootCamp.exercicio10.cliente.ClienteServiceImpl;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        PedidoService pedidoService = new PedidoServiceImpl();
        ClienteService clienteService = new ClienteServiceImpl();

        Cliente cliente = new Cliente();
        cliente.setCpf("123123123");
        cliente.setNome("Luiz");
        cliente.setEmail("luiz@gmail.com");
        cliente = clienteService.save(cliente);

        Integer idCliente = cliente.getId();

        ItemService itemService = new ItemServiceImpl();

        Pedido pedido = new Pedido();

        Cliente clientePedido = clienteService.findById(idCliente);
        pedido.setCliente(clientePedido);

        Item item = new Item();
        item.setDescricao("item");
        item.setQuantidade(BigDecimal.valueOf(5));
        itemService.save(item);

        Item item2 = new Item();
        item2.setDescricao("item 2");
        item2.setQuantidade(BigDecimal.TEN);
        itemService.save(item2);

        try {
            PedidoItem pedidoItem = new PedidoItem();
            pedidoItem.setId(1);
            pedidoItem.setPedido(pedido);
            pedidoItem.setItem(item);
            pedidoItem.setQuantidade(BigDecimal.valueOf(1));

            PedidoItem pedidoItem2 = new PedidoItem();
            pedidoItem2.setId(2);
            pedidoItem2.setPedido(pedido);
            pedidoItem2.setItem(item2);
            pedidoItem2.setQuantidade(BigDecimal.valueOf(1));

            pedido.getPedidoItemList().add(pedidoItem);
            pedido.getPedidoItemList().add(pedidoItem2);

            pedido = pedidoService.save(pedido);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(pedido.getId());

        var list = pedidoService.findAll();

        for (Pedido pd : list) {
            System.out.println(pd.getId());
            for (PedidoItem ped : pd.getPedidoItemList()) {
                System.out.println(ped.getItem().getDescricao());
                System.out.println(ped.getQuantidade());
            }
        }
    }

}