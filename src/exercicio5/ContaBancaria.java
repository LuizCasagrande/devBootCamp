package exercicio5;

public abstract class ContaBancaria {
    private Integer numeroDaConta;
    protected Double saldo;

    public ContaBancaria(Integer numeroDaConta, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    protected abstract void sacar(Double valor);

    protected abstract void depositar(Double valor);
}
