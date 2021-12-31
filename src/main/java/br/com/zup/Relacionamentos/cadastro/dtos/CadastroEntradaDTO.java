package br.com.zup.Relacionamentos.cadastro.dtos;


import br.com.zup.Relacionamentos.curso.dtos.CursoIdDTO;
import br.com.zup.Relacionamentos.endereco.dtos.EnderecoEntradaDTO;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

public class CadastroEntradaDTO {
    @CPF
    @NotNull
    private String cpf;
    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;
    private List<CursoIdDTO> cursos;

    //TEMOS VALIDAÇÕES PARA SEREM FEITAS NA ENDERECOENTRADADTO, PORTANTO, COLOCAREMOS UM @VALID
    //PARA QUE O SPRING FAÇA ESTA VALIDAÇÃO, POIS ESTAMOS TENDO UMA COMPOSIÇÃO
    //DE ENDERECO E O SPRING NÃO VAO FAZER A VALIDAÇÃO
    @Valid
    private List<EnderecoEntradaDTO> enderecos;

    public CadastroEntradaDTO() {
    }

    public List<EnderecoEntradaDTO> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoEntradaDTO> enderecos) {
        this.enderecos = enderecos;
    }

    public List<CursoIdDTO> getCursos() {
        return cursos;
    }

    public void setCursos(List<CursoIdDTO> cursos) {
        this.cursos = cursos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
