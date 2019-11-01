package exercicio8;

public class Circulo implements Figura {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 3.14 * (raio * raio);
    }
}
