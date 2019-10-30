package exercicioModelo;

public enum TipoEndereco {
    COBRANCA ("Endereco de Cobranca"),
    ENTREGA ("Endereco de Entrega"),
    RESIDENCIAL ("Endereco Residencial");



    private String label;

    TipoEndereco(String label){
        this.label = label;
    }

    public String getLabel() {

        return label;

    }
}
