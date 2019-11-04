package com.devBootCamp.exercicio10.pedido;

import com.devBootCamp.exercicio10.Email;
import com.devBootCamp.exercicio10.EmailService;
import com.devBootCamp.exercicio10.EmailServiceImpl;
import com.devBootCamp.exercicio10.crud.CrudServiceImpl;

public class PedidoServiceImpl extends CrudServiceImpl<Pedido>
        implements PedidoService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(Pedido entity) {
        for (PedidoItem pedidoItem : entity.getPedidoItemList()) {
            if (pedidoItem.getQuantidade().compareTo(pedidoItem.getItem().getQuantidade()) > 0) {
                throw new RuntimeException("Quantidade não disponivel: " + "Solicitado: "
                        + pedidoItem.getQuantidade() + ". Disponivel: "
                        + pedidoItem.getItem().getQuantidade());
            }
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
