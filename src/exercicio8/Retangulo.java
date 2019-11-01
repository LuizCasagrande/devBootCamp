package exercicio8;

public class Retangulo implements Figura {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return base * altura;

    }

    @Override
    public String getNome() {
        return ("Retângulo");
    }
}
