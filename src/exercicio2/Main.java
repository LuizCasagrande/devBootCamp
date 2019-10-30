package exercicio2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Avenida");
        endereco1.setNumero("1234");
        endereco1.setBairro("Centro");

        Proprietario proprietario1 = new Proprietario("Luiz", "123321123321", "456654456654");
        LocalDate localDate = LocalDate.of(2001, 10, 26);
        proprietario1.setNascimento(localDate);
        proprietario1.setEndereco(endereco1);

        Carro carro1 = new Carro(proprietario1, (double) 10);
        carro1.setModelo("Gol");
        carro1.setCor("Vermelho");
        carro1.setAno("2000");
        carro1.setMarca("Volkswagen");
        carro1.setChassi("123456654321");
        carro1.setVelocidademaxima((double) 100);
        carro1.setVelocidadeatual((double) 0);
        carro1.setNumeromarchas((double) 5);

        carro1.acelerar();
        carro1.acelerar();
        carro1.freiar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.trocarmarcha();
        carro1.trocarmarcha();
        carro1.reduzirmarcha();
        carro1.freiar();
        carro1.marchare();
        carro1.autonomia(12D);




    }
}
