package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.VapeDTO;
import br.unitins.topicos1.dto.VapeResponseDTO;
//import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface VapeService {
    public VapeResponseDTO insertV(VapeDTO dto);

    public VapeResponseDTO updateV(VapeDTO dto, Long id);

    public void deleteV(Long id);

    public VapeResponseDTO findById(Long id);

    public List<VapeResponseDTO> findByMarca (String marca);

    public List<VapeResponseDTO> findByAll();

}