package exercicioModelo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setId((long) 1);
        cliente1.setNome("Luiz");
        cliente1.setCpf("98765432121");
        Endereco endereco1 = new Endereco();
        endereco1.setId((long) 1);
        endereco1.setRua("Itacolomi");
        endereco1.setNumero("1234");
        endereco1.setBairro("Centro");
        endereco1.setTipo(TipoEndereco.ENTREGA);
        cliente1.getEnderecos().add(endereco1);
        Produto produto1 = new Produto((long) 1, "Produto 1", (double) 32, 12.50);
        NotaFiscal nota1 = new NotaFiscal();
        nota1.setId((long) 1);
        nota1.setNumeronota((long) 4444);
        nota1.setCliente(cliente1);
        nota1.setEndereco(endereco1);
        NotaFiscalItem notaitem = new NotaFiscalItem();
        notaitem.setId((long) 1);
        notaitem.setNotafiscal(nota1);
        notaitem.setProduto(produto1);
        notaitem.setQuantidade((double) 4);
        notaitem.setValorunitario(12.50);
        nota1.getNotaitens().add(notaitem);

        nota1.populaDados();

    }
}
