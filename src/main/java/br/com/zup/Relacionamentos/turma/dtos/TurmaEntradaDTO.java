package br.com.zup.Relacionamentos.turma.dtos;

import br.com.zup.Relacionamentos.curso.dtos.CursoIdDTO;
import br.com.zup.Relacionamentos.turma.enuns.Periodo;

public class TurmaEntradaDTO {
    private Periodo periodo;
    private CursoIdDTO curso;

    public TurmaEntradaDTO() {
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public CursoIdDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoIdDTO curso) {
        this.curso = curso;
    }
}