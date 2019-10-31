package exercicioModeloHeranca;

import java.time.LocalDate;
import java.util.Random;

public class AlunoCurso {
    private Integer matricula;
    private Curso curso;
    private LocalDate dataDeInicio;

    public AlunoCurso(Curso curso, LocalDate dataDeInicio) {
        this.curso = curso;
        this.dataDeInicio = dataDeInicio;
        this.matricula = new Random().nextInt();
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public void setDataDeInicio(LocalDate dataDeInicio) {
        this.dataDeInicio = dataDeInicio;
    }
}
