package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.crud.BaseObject;
import com.devBootCamp.exercicio10.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends BaseObject {

    private Cliente cliente;
    private List<PedidoItem> pedidoItemList = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoItem> getPedidoItemList() {
        return pedidoItemList;
    }

    public void setPedidoItemList(List<PedidoItem> pedidoItemList) {
        this.pedidoItemList = pedidoItemList;
    }

}
