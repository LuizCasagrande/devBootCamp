package exercicioModeloHeranca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<AlunoCurso> cursoList = new ArrayList<>();

    public List<AlunoCurso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<AlunoCurso> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer matricularAluno(Curso curso) {

        for (AlunoCurso alunoCurso : cursoList) {
            Boolean estaMatriculaNoCurso = false;
            if (alunoCurso.getCurso().getId().equals(curso.getId()));
            estaMatriculaNoCurso = true;
            System.out.println("Aluno já está cadastrado no curso " + curso.getNome());
        }

        AlunoCurso alunoCurso = new AlunoCurso(curso, LocalDate.now());
        cursoList.add(alunoCurso);
        System.out.println("Aluno matriculado no curso " + curso.getNome());
        return alunoCurso.getMatricula();
    }

}
