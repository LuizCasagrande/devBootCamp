package exercicio3;

public class Elevador {
    private Integer andares;
    private Integer capacidade;
    private Integer pessoas =0;
    private Integer andaratual = 0;

    public Elevador(Integer andares, Integer capacidade) {
        this.andares = andares;
        this.capacidade = capacidade;
    }

    public Integer getPessoas() {
        return pessoas;
    }

    public void setPessoas(Integer pessoas) {
        this.pessoas = pessoas;
    }

    public void entra() {
        if (pessoas >= capacidade) {
            System.out.println("O Elevador esta Lotado, total de pessoas: "+ pessoas);
        } else {
            pessoas++;
            System.out.println("Uma pessoa entrou, total de pessoas: "+ pessoas);
        }

    }

    public void sai() {
        if (pessoas == 0) {
            System.out.println("O Elevador esta Vazio");
        } else {
            pessoas--;
            System.out.println("Uma pessoa saiu, total de pessoas: "+ pessoas);
        }

    }

    public void sobe() {
        if (andaratual.equals(andares)) {
            System.out.println("Chegamos ao último andar, andar atual: "+ andaratual);
        } else {
            andaratual++;
            System.out.println("O elevador subiu um andar, andar atual: "+ andaratual);
        }

    }

    public void desce() {
        if (andaratual == 0) {
            System.out.println("Chegamos ao Térreo");
        } else {
            andaratual--;
            System.out.println("O elevador desceu um andar, andar atual: "+ andaratual);
        }
    }
}
