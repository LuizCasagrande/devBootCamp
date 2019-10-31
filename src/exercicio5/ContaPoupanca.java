package exercicio5;

public class ContaPoupanca extends ContaBancaria {
    private Double limite;

    public ContaPoupanca(Integer numeroDaConta, Double saldo, Double limite) {
        super(numeroDaConta, saldo);
        this.limite = limite;
    }

    @Override
    protected void sacar(Double valor) {
        if (saldo + limite >= valor) {
            saldo = saldo - valor;
            System.out.println("O valor sacado foi de: " + valor);
            System.out.println("O saldo negativo pode chegar até: -" + limite);
            System.out.println("O saldo atual é de: " + saldo);
        } else {
            System.out.println("Saldo indisponivel");
        }

    }

    @Override
    protected void depositar(Double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("O valor depositado foi de: " + valor);
            System.out.println("O saldo atual é de: " + saldo);
        } else {
            System.out.println("Impossivel depositar esse valor");
        }

    }
}
