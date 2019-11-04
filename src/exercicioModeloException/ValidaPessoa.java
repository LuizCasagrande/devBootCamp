package exercicioModeloException;

public class ValidaPessoa {
    public void validarPessoa (Pessoa pessoa) {
        if (pessoa.getCpf() == null || pessoa.getCpf().length() < 11) {
            throw new RuntimeException("CPF não é valido, caracteres insuficientes.");
        }
    }
}
