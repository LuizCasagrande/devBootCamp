package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Quadrado(12.5);
        Figura figura2 = new Retangulo(7.5, 10D);
        Figura figura3 = new Triangulo(16D, 22D);
        Figura figura4 = new Circulo(10D);

        System.out.println("Calculadora de Área: ");
        System.out.println("Área: " + figura.getArea());
        System.out.println("Área 2: " + figura2.getArea());
        System.out.println("Área 3: " + figura3.getArea());
        System.out.println("Área 4: " + figura4.getArea());

    }
}
