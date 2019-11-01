package exercicio8;

import java.util.List;

public class FiguraGeometrica {

    public void mostar(List<Figura> figuras) {
        for (Figura fig : figuras) {
            fig.getArea();
            System.out.println("Figura: " + fig.getNome());
            System.out.println("Área: " + fig.getArea());
            System.out.println();

        }

    }
}
