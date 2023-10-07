package br.unitins.topicos1.service;

import java.util.ArrayList;
import java.util.List;

import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.ClienteDTO;
import br.unitins.topicos1.dto.ClienteResponseDTO;
import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.model.Telefone;
import br.unitins.topicos1.model.Cliente;
import br.unitins.topicos1.model.Endereco;
import br.unitins.topicos1.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteServiceImpl implements ClienteService
{ 
    @Inject
    ClienteRepository repository;

    @Override
    @Transactional
    public ClienteResponseDTO insertC(ClienteDTO dto) 
    {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(dto.nome());
        novoCliente.setIdade(dto.idade());
        novoCliente.setCpf(dto.cpf());

        novoCliente.setLogin(dto.login());
        novoCliente.setSenha(dto.senha());

        if (dto.listaTelefone() != null && 
                    !dto.listaTelefone().isEmpty()){
            novoCliente.setListaTelefone(new ArrayList<Telefone>());
            for (TelefoneDTO tel : dto.listaTelefone()) {
                Telefone telefone = new Telefone();
                telefone.setCodigoArea(tel.codigoArea());
                telefone.setNumero(tel.numero());
                novoCliente.getListaTelefone().add(telefone);
            }
        }

        if (dto.listaEndereco() != null && 
                    !dto.listaEndereco().isEmpty()){
            novoCliente.setListaEndereco(new ArrayList<Endereco>());
            for (EnderecoDTO end : dto.listaEndereco()) {
                Endereco endereco = new Endereco();
                endereco.setBairro(end.bairro());
                endereco.setQuadra(end.quadra());
                endereco.setComplemento(end.complemento());
                endereco.setN(end.n());
                novoCliente.getListaEndereco().add(endereco);
            }
        }

        repository.persist(novoCliente);

        return ClienteResponseDTO.valueOf(novoCliente);
    }

    @Override
    @Transactional
    public ClienteResponseDTO updateC(ClienteDTO dto, Long id) {
        return null;

    }

    @Override
    @Transactional
    public void deleteC(Long id) {
    }

    @Override
    public ClienteResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<ClienteResponseDTO> findByNome(String nome) {
            return null;
    }

    @Override
    public List<ClienteResponseDTO> findByAll() {
        return repository.listAll().stream()
            .map(e -> ClienteResponseDTO.valueOf(e)).toList();
    }
}
