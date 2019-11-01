package exercicioModeloInterface;

public class Cavalo implements Animal {
    @Override
    public String somDoAnimal() {
        return "irinho";
    }

    @Override
    public String corDoAnimal() {
        return "marrom";
    }
}
