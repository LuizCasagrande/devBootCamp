package exercicioModeloException;

public class Main {

    public static void main(String[] args) {

        ValidaPessoa validaPessoa = new ValidaPessoa();
        Pessoa pessoa = new Pessoa();

        validaPessoa.validarPessoa(pessoa);

//        try {
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

    }
}
