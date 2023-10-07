package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.NicDTO;
import br.unitins.topicos1.dto.NicResponseDTO;
//import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface NicService {
    public NicResponseDTO insertN(NicDTO dto);

    public NicResponseDTO updateN(NicDTO dto, Long id);

    public void deleteN(Long id);

    public NicResponseDTO findById(Long id);

    public List<NicResponseDTO> findByMarca (String marca);

    public List<NicResponseDTO> findByAll();

}
