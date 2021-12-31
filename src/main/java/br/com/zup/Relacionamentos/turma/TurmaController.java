package br.com.zup.Relacionamentos.turma;

import br.com.zup.Relacionamentos.turma.dtos.MatriculaDTO;
import br.com.zup.Relacionamentos.turma.dtos.TurmaDetailsDTO;
import br.com.zup.Relacionamentos.turma.dtos.TurmaEntradaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    TurmaService turmaService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TurmaDetailsDTO cadastrarNovaTurma(@RequestBody TurmaEntradaDTO turmaNova) {
        Turma turma = modelMapper.map(turmaNova, Turma.class);
        turma = turmaService.salvarTurma(turma);
        return modelMapper.map(turma, TurmaDetailsDTO.class);
    }

    @PutMapping
    public TurmaDetailsDTO matricularAluno(@RequestBody @Valid MatriculaDTO matriculaDTO) {
        Turma turma = turmaService.vincularAlunoNaTurma(matriculaDTO.getAlunoId(), matriculaDTO.getTurmaId());
        return modelMapper.map(turma, TurmaDetailsDTO.class);
    }
}
