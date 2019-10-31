package exercicio6;

import java.math.BigDecimal;

public class Empregado extends Pessoa {
    private BigDecimal salarioBase;
    private BigDecimal imposto;

    public Empregado(String nome, String cpf, BigDecimal salarioBase, BigDecimal imposto) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public BigDecimal getSalarioBase() {
        return salarioBase;
    }

    public BigDecimal getImposto() {
        return imposto;
    }

    public BigDecimal calculaSalario() {
        salarioBase = salarioBase.subtract(imposto);
        return salarioBase;
    }

}
