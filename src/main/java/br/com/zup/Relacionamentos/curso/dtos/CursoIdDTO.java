package br.com.zup.Relacionamentos.curso.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CursoIdDTO {

    @NotNull
    private Integer id;

    public CursoIdDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
