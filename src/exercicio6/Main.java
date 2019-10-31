package exercicio6;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Empregado", "321321321",
                BigDecimal.valueOf(1450), BigDecimal.valueOf(200));

        System.out.println("Empregados:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Salario: " + empregado.calculaSalario());
        System.out.println();

        Gerente gerente = new Gerente("Gerente", "1425364758",
                BigDecimal.valueOf(2000), BigDecimal.valueOf(250), BigDecimal.valueOf(300), BigDecimal.valueOf(20));

        Vendedor vendedor = new Vendedor("Vendedor", "789789789",
                BigDecimal.valueOf(1500),BigDecimal.valueOf(150),BigDecimal.valueOf(50),BigDecimal.valueOf(10));
        Vendedor vendedor2 = new Vendedor("Vendedor2", "123123321",
                BigDecimal.valueOf(1750),BigDecimal.valueOf(240),BigDecimal.valueOf(70),BigDecimal.valueOf(20));
        Vendedor vendedor3 = new Vendedor("Vendedor3", "456654456",
                BigDecimal.valueOf(1100),BigDecimal.valueOf(90),BigDecimal.valueOf(35),BigDecimal.valueOf(10));

        System.out.println("Vendedores:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salario: " + vendedor.calculaSalario());
        System.out.println("Nome: " + vendedor2.getNome());
        System.out.println("Salario: " + vendedor2.calculaSalario());
        System.out.println("Nome: " + vendedor3.getNome());
        System.out.println("Salario: " + vendedor3.calculaSalario());
        System.out.println();

        gerente.getVendedores().add(vendedor);
        gerente.getVendedores().add(vendedor2);
        gerente.getVendedores().add(vendedor3);

        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario: " + gerente.calculaSalario());
    }
}
