package exercicioModeloHeranca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<ProfessorCurso> professorCursoList = new ArrayList<>();

    public List<ProfessorCurso> getProfessorCursoList() {
        return professorCursoList;
    }

    public void setProfessorCursoList(List<ProfessorCurso> professorCursoList) {
        this.professorCursoList = professorCursoList;
    }
}
