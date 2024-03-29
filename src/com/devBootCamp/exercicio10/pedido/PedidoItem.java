package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.item.Item;
import com.devBootCamp.exercicio10.vendedor.Vendedor;

import java.math.BigDecimal;

public class PedidoItem {
    private Integer id;
    private Pedido pedido;
    private Item item;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal desconto;

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return quantidade.multiply(valorUnitario).subtract(desconto);
    }

    public BigDecimal getValorTotalSemDesconto() {
        return valorUnitario.multiply(quantidade);
    }

}
