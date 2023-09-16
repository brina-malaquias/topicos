package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.model.Pod;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface PodService {
    public Pod insert(PodDTO dto);

    public Pod update(PodDTO dto, Long id);

    public void delete(Long id);

    public Pod findById(Long id);

    public List<Pod> findByMarca (String marca);

    public List<Pod> findByAll();

}
