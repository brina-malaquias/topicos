package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.AdministradorResponseDTO;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
//import jakarta.validation.Valid;
import br.unitins.topicos1.dto.AdministradorDTO;

public interface AdministradorService 
{
    public AdministradorResponseDTO insertA( AdministradorDTO dto) throws ConstraintViolationException;

    public AdministradorResponseDTO updateA(AdministradorDTO dto, Long id);

    public void deleteA(Long id);

    public AdministradorResponseDTO findById(Long id);

    public List<AdministradorResponseDTO> findByNome (String nome);

    public List<AdministradorResponseDTO> findByAll();

}

//sabrina