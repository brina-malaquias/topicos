package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.JuiceDTO;
import br.unitins.topicos1.dto.JuiceResponseDTO;
//import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface JuiceService {
    public JuiceResponseDTO insertJ(JuiceDTO dto);

    public JuiceResponseDTO updateJ(JuiceDTO dto, Long id);

    public void deleteJ(Long id);

    public JuiceResponseDTO findById(Long id);

    public List<JuiceResponseDTO> findByMarca (String marca);

    public List<JuiceResponseDTO> findByAll();

}
