package exercicio5;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(1234, 500D, 50D);
        ContaCorrente contaCorrente = new ContaCorrente(4321, 340D, 12.50);

        System.out.println("Conta poupanca: ");
        contaPoupanca.sacar(520D);
        contaPoupanca.depositar(1000D);
        System.out.println();

        System.out.println("Conta corrente: ");
        contaCorrente.sacar(120D);
        contaCorrente.depositar(-100D);
    }
}
