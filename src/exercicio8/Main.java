package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Quadrado(12.5);
        Figura figura2 = new Retangulo(7.5, 10D);
        Figura figura3 = new Triangulo(16D, 22D);
        Figura figura4 = new Circulo(10D);

        List<Figura> figuras = List.of(figura, figura2, figura3, figura4);

        FiguraGeometrica figurageometrica = new FiguraGeometrica();
        figurageometrica.mostar(figuras);



    }
}
