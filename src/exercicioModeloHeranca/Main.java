package exercicioModeloHeranca;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luiz");
        pessoa.setCpf("123123123");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Cpf: " + pessoa.getCpf());
        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("123123123");
        funcionario.setNome("Funcionario");
        funcionario.setSalario(BigDecimal.valueOf(1000));
        funcionario.setDataDeAdmissao(LocalDate.now().minusYears(1));

        System.out.println("Funcionario");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cpf: " + funcionario.getCpf());
        System.out.println("Admissao: " + funcionario.getDataDeAdmissao());
        System.out.println("Salário: " + funcionario.calculaSalario());

        System.out.println("Aluno: ");
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        aluno.setCpf("456456456");

        Curso ads = new Curso (1,"ADS", 5);
        Curso adm = new Curso (2, "ADM", 4);

        Integer matricula = aluno.matricularAluno(ads);
        System.out.println(matricula);

        Integer matriculaADM = aluno.matricularAluno(adm);
        System.out.println(matriculaADM);

        System.out.println("Curso de Aluno: ");
        for (AlunoCurso alunoCurso : aluno.getCursoList()) {
            System.out.println(alunoCurso.getMatricula());
            System.out.println(alunoCurso.getCurso().getNome());
            System.out.println(alunoCurso.getDataDeInicio());
            System.out.println();
        }
    }
}
