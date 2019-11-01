package exercicioModeloInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Gato();
//
//        System.out.println(animal.somDoAnimal());
//        System.out.println(animal.corDoAnimal());

        Zoologico zoologico = new Zoologico();

        zoologico.caracteristicasDosAnimais(new Gato());
        zoologico.caracteristicasDosAnimais(new Cachorro());
        zoologico.caracteristicasDosAnimais(new Cavalo());

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cavalo());
        animais.add(new Cachorro());
        animais.add(new Gato());
        zoologico.caracteristicasDosAnimais(animais);


    }
}
