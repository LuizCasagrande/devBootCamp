package exercicio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    private Integer numerovoo;
    private LocalDateTime data;
    private Integer maximoassentos;
    private List<Integer> assentoslivres = new ArrayList<>();
    private List<Integer> assentosocupados = new ArrayList<>();

    public Voo(Integer numerovoo, LocalDateTime data, Integer maximoassentos) {
        this.numerovoo = numerovoo;
        this.data = data;
        this.maximoassentos = maximoassentos;

        for (Integer i = 1; i <= maximoassentos; i++) {
            assentoslivres.add(i);
        }
    }

    public Integer getNumerovoo() {
        return numerovoo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Integer getMaximoassentos() {
        return maximoassentos;
    }

    public void getvoo(){
        System.out.println(numerovoo);
    }

    public void primeirolivre() {
        if (!assentoslivres.isEmpty()) {
            System.out.println("Primeiro assento livre: "+ assentoslivres.get(0));
        } else System.out.println("Nao tem mais assentos livres");
    }

    public void proximolivre(Integer assento) {

        for (Integer proximoassento : assentoslivres) {
            if (proximoassento > assento) {
                System.out.println("Proximo livre: "+ proximoassento);
                return;
            }
        }

    }

    public void verifica(Integer verificar) {
        if (assentoslivres.contains(verificar)) {
            System.out.println("este assento está disponivel");
        } else System.out.println("este assento esta ocupado");
    }

    public void ocupa(Integer assento) {
        if (assentoslivres.contains(assento)) {
            assentosocupados.add(assento);
            assentoslivres.remove(assento);
            System.out.println("voce ocupou o assento: "+ assento);
        } else System.out.println("este assento ja esta ocupado");
    }

    public void assentoslivres() {
        if (!assentoslivres.isEmpty()) {
            System.out.println("Assentos livres: ");
            for (Integer assentoslivre : assentoslivres) {
                System.out.print(assentoslivre + " ");
            }
            System.out.println("");
        } else {
            System.out.println("nenhum assento livre");
        }
    }

    public void vagas() {
        System.out.println("Vagas: "+ assentoslivres.size());
    }

}
