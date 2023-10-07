package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.PodDescartavelDTO;
import br.unitins.topicos1.dto.PodDescartavelResponseDTO;
//import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface PodDescartavelService {
    public PodDescartavelResponseDTO insertD(PodDescartavelDTO dto);

    public PodDescartavelResponseDTO updateD(PodDescartavelDTO dto, Long id);

    public void deleteD(Long id);

    public PodDescartavelResponseDTO findById(Long id);

    public List<PodDescartavelResponseDTO> findByMarca (String marca);

    public List<PodDescartavelResponseDTO> findByAll();

}

// Charles
