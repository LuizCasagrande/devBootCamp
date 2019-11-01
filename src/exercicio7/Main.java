package exercicio7;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa ("Luiz", "123123123", "luiz@gmail.com", 18);
        Pessoa pessoa2 = new Pessoa ("Henrique", "321321321", "henrique@gmail.com", 20);
        Pessoa pessoa3 = new Pessoa ("Leonardo", "456456456", "leonardo@gmail.com", 17);
        Pessoa pessoa4 = new Pessoa ("Matheus", "654654654", "matheus@gmail.com", 11);
        Pessoa pessoa5 = new Pessoa ("Gabriel", "789789789", "gabriel@gmail.com", 15);

        GrupoDePessoas grupo = new GrupoDePessoas();
        grupo.adicionar(pessoa);
        grupo.adicionar(pessoa2);
        grupo.adicionar(pessoa3);
        grupo.adicionar(pessoa4);
        grupo.adicionar(pessoa5);

        grupo.pessoasmaiores();
        System.out.println();
        grupo.pessoasmenores();

    }
}
