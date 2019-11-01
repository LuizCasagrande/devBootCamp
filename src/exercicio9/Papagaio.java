package exercicio9;

public class Papagaio implements Animal {
    @Override
    public EspecieAnimal getEspecie() {
        return EspecieAnimal.AVES;
    }

    @Override
    public String getNomeAnimal() {
        return ("Papagaio");
    }
}
