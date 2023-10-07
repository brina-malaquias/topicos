package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.ClienteResponseDTO;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import br.unitins.topicos1.dto.ClienteDTO;

public interface ClienteService 
{
    public ClienteResponseDTO insertC(@Valid ClienteDTO dto) throws ConstraintViolationException;

    public ClienteResponseDTO updateC(ClienteDTO dto, Long id);

    public void deleteC(Long id);

    public ClienteResponseDTO findById(Long id);

    public List<ClienteResponseDTO> findByNome (String nome);

    public List<ClienteResponseDTO> findByAll();

}
