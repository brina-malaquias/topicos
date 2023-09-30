package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.dto.PodResponseDTO;
import br.unitins.topicos1.model.Pod;
import br.unitins.topicos1.repository.PodRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class PodServiceImpl implements PodService
{
    
    @Inject
    PodRepository repository;

    @Override
    @Transactional
    public PodResponseDTO insert (PodDTO dto)
{
    Pod novoPod = new Pod();
    novoPod.setMarca(dto.getMarca());
    novoPod.setPuffs(dto.getPuffs());
    novoPod.setValor(dto.getValor());
    novoPod.setSabor(dto.getSabor());

    repository.persist(novoPod);


    return PodResponseDTO.valueOf(novoPod);
}

    @Override
    public PodResponseDTO update(PodDTO dto, Long id) 
    {
        Pod pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setMarca(dto.getMarca());
            pod.setPuffs(dto.getPuffs());
            pod.setValor(dto.getValor());
            pod.setSabor(dto.getSabor());
        }
        return PodResponseDTO.valueOf(pod);
    }

    @Override
    public void delete(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public PodResponseDTO findById(Long id) 
    {
        return PodResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<PodResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> PodResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<PodResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> PodResponseDTO.valueOf(e)).toList();
    }
    }

