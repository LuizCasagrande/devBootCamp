package exercicio5;

public class ContaCorrente extends ContaBancaria {
    private Double taxaDeOperacao;

    public ContaCorrente(Integer numeroDaConta, Double saldo, Double taxaDeOperacao) {
        super(numeroDaConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    protected void sacar(Double valor) {
        if (valor <= saldo) {
            valor = valor - taxaDeOperacao;
            saldo = saldo - valor;
            System.out.println("O valor sacado foi de: " + valor);
            System.out.println("A taxa de operacao foi de: "+ taxaDeOperacao);
            System.out.println("O saldo atual é de: " + valor);
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
