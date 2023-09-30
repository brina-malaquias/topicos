package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.dto.PodResponseDTO;
import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface PodService {
    public PodResponseDTO insert(PodDTO dto);

    public PodResponseDTO update(PodDTO dto, Long id);

    public void delete(Long id);

    public PodResponseDTO findById(Long id);

    public List<PodResponseDTO> findByMarca (String marca);

    public List<PodResponseDTO> findByAll();

}
