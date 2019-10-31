package exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vendedor extends Empregado {
    private BigDecimal valorDosProdutosVendidos;
    private BigDecimal comissao;

    public Vendedor(String nome, String cpf, BigDecimal salarioBase,
                   BigDecimal imposto, BigDecimal valorDosProdutosVendidos, BigDecimal comissao) {
        super(nome, cpf, salarioBase, imposto);
        this.valorDosProdutosVendidos = valorDosProdutosVendidos;
        this.comissao = comissao;
    }

    public BigDecimal getValorDosProdutosVendidos() {
        return valorDosProdutosVendidos;
    }

    @Override
    public BigDecimal calculaSalario() {
        BigDecimal salarioBase = super.calculaSalario();

        BigDecimal valorComissao = valorDosProdutosVendidos.multiply(comissao)
                .divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);

        return salarioBase.add(valorComissao);
    }
}
