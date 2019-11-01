package exercicio9;

import java.util.List;

public class Resultado {
    private EspecieAnimal especie;
    private Integer quantidade;

    public Resultado(EspecieAnimal especie, Integer quantidade) {
        this.especie = especie;
        this.quantidade = quantidade;
    }

    public void mostrar (List<Animal> animais) {
        for (Animal ani : animais) {
            System.out.println("Animal: " + ani.getNomeAnimal());
            System.out.println("Animal: " + ani.getEspecie());
        }

    }

}
