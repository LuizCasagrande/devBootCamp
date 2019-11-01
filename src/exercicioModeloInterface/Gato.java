package exercicioModeloInterface;

public class Gato implements Animal {
    @Override
    public String somDoAnimal() {
        return "miau";
    }

    @Override
    public String corDoAnimal() {
        return "preto";
    }
}
