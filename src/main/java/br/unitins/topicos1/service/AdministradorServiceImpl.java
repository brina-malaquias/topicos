package br.unitins.topicos1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.AdministradorDTO;
import br.unitins.topicos1.dto.AdministradorResponseDTO;
//import br.unitins.topicos1.dto.AdministradorDTO;
//import br.unitins.topicos1.dto.AdministradorResponseDTO;
import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.model.Telefone;
import br.unitins.topicos1.model.Administrador;
import br.unitins.topicos1.model.Endereco;
import br.unitins.topicos1.repository.AdministradorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.inject.Inject;

@ApplicationScoped
public class AdministradorServiceImpl implements AdministradorService
{ 
    @Inject
    AdministradorRepository repository;

    @Inject
    Validator validator;

    private void validar(AdministradorDTO usuarioDTO) throws ConstraintViolationException {
        Set<ConstraintViolation<AdministradorDTO>> violations = validator.validate(usuarioDTO);

        if (!violations.isEmpty())
            throw new ConstraintViolationException(violations);
    }


    @Override
    @Transactional
    public AdministradorResponseDTO insertA(@Valid AdministradorDTO dto) throws ConstraintViolationException {
        
        validar(dto);

        Administrador novoAdministrador = new Administrador();
        novoAdministrador.setNome(dto.getNome());
        novoAdministrador.setIdade(dto.getIdade());
        novoAdministrador.setCpf(dto.getCpf());

        novoAdministrador.setLogin(dto.getLogin());
        novoAdministrador.setSenha(dto.getSenha());

        if (dto.getListaTelefone() != null && 
                    !dto.getListaTelefone().isEmpty()){
            novoAdministrador.setListaTelefone(new ArrayList<Telefone>());
            for (TelefoneDTO tel : dto.getListaTelefone()) {
                Telefone telefone = new Telefone();
                telefone.setCodigoArea(tel.codigoArea());
                telefone.setNumero(tel.numero());
                novoAdministrador.getListaTelefone().add(telefone);
            }
        }
        
        if (dto.getListaEndereco() != null && 
                    !dto.getListaEndereco().isEmpty()){
            novoAdministrador.setListaEndereco(new ArrayList<Endereco>());
            for (EnderecoDTO end : dto.getListaEndereco()) {
                Endereco endereco = new Endereco();
                endereco.setBairro(end.bairro());
                endereco.setQuadra(end.quadra());
                endereco.setComplemento(end.complemento());
                endereco.setN(end.n());
                novoAdministrador.getListaEndereco().add(endereco);
            }
        }

        repository.persist(novoAdministrador);

        return AdministradorResponseDTO.valueOf(novoAdministrador);
    }

    @Override
    @Transactional
    public AdministradorResponseDTO updateA(AdministradorDTO dto, Long id) {
        return null;

    }

    @Override
    @Transactional
    public void deleteA(Long id) {
    }

    @Override
    public AdministradorResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<AdministradorResponseDTO> findByNome(String nome) {
            return null;
    }

    @Override
    public List<AdministradorResponseDTO> findByAll() {
        return repository.listAll().stream()
            .map(e -> AdministradorResponseDTO.valueOf(e)).toList();
    }
}
