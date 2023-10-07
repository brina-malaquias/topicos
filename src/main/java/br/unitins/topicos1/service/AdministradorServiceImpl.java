package br.unitins.topicos1.service;

import java.util.ArrayList;
import java.util.List;

import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.AdministradorDTO;
import br.unitins.topicos1.dto.AdministradorResponseDTO;
import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.model.Telefone;
import br.unitins.topicos1.model.Administrador;
import br.unitins.topicos1.model.Endereco;
import br.unitins.topicos1.repository.AdministradorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;

@ApplicationScoped
public class AdministradorServiceImpl implements AdministradorService
{ 
    @Inject
    AdministradorRepository repository;

    @Override
    @Transactional
    public AdministradorResponseDTO insertA(AdministradorDTO dto) 
    {
        Administrador novoAdministrador = new Administrador();
        novoAdministrador.setNome(dto.nome());
        novoAdministrador.setIdade(dto.idade());
        novoAdministrador.setCpf(dto.cpf());

        novoAdministrador.setLogin(dto.login());
        novoAdministrador.setSenha(dto.senha());

        if (dto.listaTelefone() != null && 
                    !dto.listaTelefone().isEmpty()){
            novoAdministrador.setListaTelefone(new ArrayList<Telefone>());
            for (TelefoneDTO tel : dto.listaTelefone()) {
                Telefone telefone = new Telefone();
                telefone.setCodigoArea(tel.codigoArea());
                telefone.setNumero(tel.numero());
                novoAdministrador.getListaTelefone().add(telefone);
            }
        }
        
        if (dto.listaEndereco() != null && 
                    !dto.listaEndereco().isEmpty()){
            novoAdministrador.setListaEndereco(new ArrayList<Endereco>());
            for (EnderecoDTO end : dto.listaEndereco()) {
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
