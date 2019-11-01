package exercicio9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var animais = new ArrayList<Animal>();
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Jacare());
        animais.add(new Jacare());
        animais.add(new Papagaio());
        animais.add(new Lambari());
        animais.add(new Lambari());
        animais.add(new Lambari());

        var contabiliza = (new ContabilizarEspecies());

    }
}
