package com.devBootCamp.exercicio10;

public class EmailServiceImpl implements EmailService {

    @Override
    public void enviarEmail(Email email) {
        if (email.getDe() == null && email.getPara() == null) {
            throw new RuntimeException("Remetente ou destinatario não informado");
        }
        System.out.println("Email enviado de: " + email.getDe() + " para: " + email.getPara());
    }

}
