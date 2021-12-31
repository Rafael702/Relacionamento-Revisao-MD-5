package br.com.zup.Relacionamentos.turma.dtos;

import br.com.zup.Relacionamentos.cadastro.dtos.CadastroResumoDTO;
import br.com.zup.Relacionamentos.curso.Curso;
import br.com.zup.Relacionamentos.turma.enums.Periodo;

import java.util.List;

public class TurmaDetailsDTO {
    private int id;
    private Periodo periodo;
    private Curso curso;
    private List<CadastroResumoDTO> alunos;

    public TurmaDetailsDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<CadastroResumoDTO> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<CadastroResumoDTO> alunos) {
        this.alunos = alunos;
    }
}
