package exercicioModelo;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Long id;
    private Long numeronota;
    private Cliente cliente;
    private Endereco endereco;
    private List<NotaFiscalItem> notaitens = new ArrayList<>();

    public List<NotaFiscalItem> getNotaitens() {
        return notaitens;
    }

    public void setNotaitens(List<NotaFiscalItem> notaitens) {
        this.notaitens = notaitens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeronota() {
        return numeronota;
    }

    public void setNumeronota(Long numeronota) {
        this.numeronota = numeronota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void populaDados() {
        System.out.println("Id da Nota Fiscal: " + id);
        System.out.println("Número da Nota Fiscal: " + numeronota);
        cliente.populaDados();

        for (NotaFiscalItem notaiten  : notaitens) {
            System.out.println("Quantidade: " + notaiten.getQuantidade());
            System.out.println("Valor Unitário: " + notaiten.getValorunitario());
            System.out.println("Valor Total: "+ notaiten.getValorTotal());
            System.out.println(""+ notaiten.getProduto().toString());
        }
    }
}
