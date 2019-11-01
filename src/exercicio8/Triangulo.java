package exercicio8;

public class Triangulo implements Figura {

    private Double base;
    private Double altura;
    private String nome;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getArea() {
        return (base * altura) / 2;

    }

    @Override
    public String getNome() {
        return ("Triângulo");

    }
}
