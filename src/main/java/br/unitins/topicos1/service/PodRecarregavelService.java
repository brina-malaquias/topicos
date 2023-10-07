package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.PodRecarregavelDTO;
import br.unitins.topicos1.dto.PodRecarregavelResponseDTO;
//import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface PodRecarregavelService {
    public PodRecarregavelResponseDTO insertR(PodRecarregavelDTO dto);

    public PodRecarregavelResponseDTO updateR(PodRecarregavelDTO dto, Long id);

    public void deleteR(Long id);

    public PodRecarregavelResponseDTO findById(Long id);

    public List<PodRecarregavelResponseDTO> findByMarca (String marca);

    public List<PodRecarregavelResponseDTO> findByAll();

}

// Sabrina
