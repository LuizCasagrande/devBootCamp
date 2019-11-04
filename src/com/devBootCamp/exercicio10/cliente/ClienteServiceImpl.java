package com.devBootCamp.exercicio10.cliente;

import com.devBootCamp.exercicio10.Email;
import com.devBootCamp.exercicio10.EmailService;
import com.devBootCamp.exercicio10.EmailServiceImpl;
import com.devBootCamp.exercicio10.crud.CrudServiceImpl;

public class ClienteServiceImpl extends CrudServiceImpl<Cliente> implements ClienteService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(Cliente entity) {
        if (entity.getCpf() == null) {
            throw new RuntimeException("CPF Invalido: " + entity.getNome());
        }

        if (entity.getEmail() == null) {
            throw new RuntimeException("Email nao informado: " + entity.getNome());
        }
    }

    @Override
    protected void postSave(Cliente entity) {
        Email email = new Email();
        email.setDe("emresa@fdasicjdsia.com");
        email.setPara(entity.getEmail());
        emailService.enviarEmail(email);
    }

    @Override
    public void atualizarEndereco(String rua, String numero) {

    }
}