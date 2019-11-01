package exercicio8;

public class Quadrado implements Figura {

    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;

    }
}
