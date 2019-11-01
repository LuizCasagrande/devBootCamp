package exercicioModeloInterface;

public class Cachorro implements Animal {
    @Override
    public String somDoAnimal() {
        return "au au";
    }

    @Override
    public String corDoAnimal() {
        return "branco";
    }
}
