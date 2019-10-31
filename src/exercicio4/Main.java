package exercicio4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Voo voo1 = new Voo(1,LocalDateTime.now(), 10 );
        System.out.println(voo1.getData());
        voo1.assentoslivres();
        voo1.ocupa(4);
        voo1.assentoslivres();
        voo1.ocupa(4);
        voo1.vagas();

    }
}
