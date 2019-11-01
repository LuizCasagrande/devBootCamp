package exercicioModeloInterface;

import java.util.List;

public class Zoologico {

    public void caracteristicasDosAnimais(Animal animal) {
        System.out.println("Som do animal: " +animal.somDoAnimal());
        System.out.println("Cor do animal: " +animal.corDoAnimal());

    }

    public void  caracteristicasDosAnimais(List<Animal> animais) {
        for (Animal animal1 : animais) {
            caracteristicasDosAnimais(animal1);
            System.out.println();
        }
    }
}
