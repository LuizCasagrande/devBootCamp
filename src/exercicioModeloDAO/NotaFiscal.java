package exercicioModeloDAO;

import exercicioModeloDAO.Pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private Integer id;
    private Pessoa pessoa;
    private List<NotaFiscal> notaFiscalList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<NotaFiscal> getNotaFiscalList() {
        return notaFiscalList;
    }

    public void setNotaFiscalList(List<NotaFiscal> notaFiscalList) {
        this.notaFiscalList = notaFiscalList;
    }
}
