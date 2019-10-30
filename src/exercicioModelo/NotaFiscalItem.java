package exercicioModelo;

public class NotaFiscalItem {
    private Long id;
    private NotaFiscal notafiscal;
    private Produto produto;
    private Double quantidade;
    private Double valorunitario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NotaFiscal getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(NotaFiscal notafiscal) {
        this.notafiscal = notafiscal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Double getValorTotal() {
        return valorunitario * quantidade;
    }
}
