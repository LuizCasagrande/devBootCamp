package exercicioModelo;

public class Produto {
    private Long id;
    private String descricao;
    private Double quantidade;
    private Double valorunitario;


    public Produto(Long id, String descricao, Double quantidade, Double valorunitario) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorunitario = valorunitario;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Double getValorunitario() {
        return valorunitario;
    }
}
