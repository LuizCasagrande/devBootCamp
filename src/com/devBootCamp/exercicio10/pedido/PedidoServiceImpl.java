package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.Email;
import com.devBootCamp.exercicio10.EmailService;
import com.devBootCamp.exercicio10.EmailServiceImpl;
import com.devBootCamp.exercicio10.crud.CrudServiceImpl;

import java.math.BigDecimal;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido>
        implements PedidoService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(Pedido entity) {
        BigDecimal totalDescontos = BigDecimal.ZERO;
        BigDecimal totalPedido = BigDecimal.ZERO;
        for (PedidoItem pedidoItem : entity.getPedidoItemList()) {
            if (pedidoItem.getQuantidade().compareTo(pedidoItem.getItem().getQuantidade()) > 0) {
                throw new RuntimeException("Quantidade não disponivel, estão disponiveis apenas: "
                        + pedidoItem.getItem().getQuantidade());
            }
            if (entity.getCliente() == null ) {
                throw new RuntimeException("Cliente não informado");
            }
            if (entity.getVendedor() == null ) {
                throw new RuntimeException("Vendedor não informado");
            }
            if (entity.getDataDeCadastro() == null ) {
                throw new RuntimeException("Data de cadastro não informado");
            }
            if (pedidoItem.getValorUnitario().compareTo(BigDecimal.ZERO) < 1) {
                throw new RuntimeException("Valor inválido");
            }

            totalDescontos = totalDescontos.add(pedidoItem.getDesconto());
            totalPedido = totalPedido.add(pedidoItem.getValorTotalSemDesconto());
        }

        BigDecimal diferenca = (totalDescontos.divide(totalPedido)).multiply(BigDecimal.valueOf(100));

        if (diferenca.compareTo(entity.getVendedor().getPercentualDeComissao()) == 1) {
            throw new RuntimeException("Valor de desconto excede limite");
        }

    }

    @Override
    protected void postSave(Pedido entity) {
        Email email = new Email();
        email.setDe("remetente");
        email.setPara("destinatario");
        emailService.enviarEmail(email);
    }

}
