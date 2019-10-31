package exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado {
    private BigDecimal ajudaDeCusto;
    private BigDecimal comissao;
    private List<Vendedor> vendedores = new ArrayList<>();

    public Gerente(String nome, String cpf, BigDecimal salarioBase,
                   BigDecimal imposto, BigDecimal ajudaDeCusto, BigDecimal comissao) {
        super(nome, cpf, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
        this.comissao = comissao;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public BigDecimal calculaSalario() {
        BigDecimal salarioBase = super.calculaSalario();
        BigDecimal valorComissao = BigDecimal.valueOf(0);
        for (Vendedor vendedor : vendedores) {
           valorComissao = vendedor.getValorDosProdutosVendidos().multiply(comissao)
                    .divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        }
        return salarioBase.add(valorComissao).add(ajudaDeCusto);
    }
}
