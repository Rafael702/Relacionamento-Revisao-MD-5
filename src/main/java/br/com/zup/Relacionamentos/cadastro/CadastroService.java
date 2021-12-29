package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.cadastro.custom_exceptions.CadastroNaoEncontradoException;
import br.com.zup.Relacionamentos.endereco.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroService {
    private CadastroRepository cadastroRepository;
    private EnderecoService enderecoService;

    @Autowired
    public CadastroService(CadastroRepository cadastroRepository, EnderecoService enderecoService) {
        this.cadastroRepository = cadastroRepository;
        this.enderecoService = enderecoService;
    }


    public Cadastro salvarCadastro(Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }

    public Cadastro salvarNovoCadastroComEndereco(Cadastro cadastro) {
        enderecoService.salvarTodosEnderecos(cadastro.getEnderecos());
        return salvarCadastro(cadastro);
    }

    public Cadastro buscarPorId(String id) {
        Optional<Cadastro> optionalCadastro = cadastroRepository.findById(id);
        if (optionalCadastro.isEmpty()) {
            throw new CadastroNaoEncontradoException();
        }

        return optionalCadastro.get();
    }

}
