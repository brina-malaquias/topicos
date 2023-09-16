package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.model.Pod;
import br.unitins.topicos1.repository.PodRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.inject.Inject;

@ApplicationScoped
public class PodServiceImpl implements PodService
{
    
    @Inject
    PodRepository repository;

    @Override
    @Transactional
    public Pod insert (PodDTO dto)
{
    Pod novoPod = new Pod();
    novoPod.setMarca(dto.getMarca());
    novoPod.setPuffs(dto.getPuffs());
    novoPod.setValor(dto.getValor());
    novoPod.setSabor(dto.getSabor());

    repository.persist(novoPod);


    return novoPod;
}

    @Override
    public Pod update(PodDTO dto, Long id) 
    {
        Pod podExistente = repository.findById(id);
        if (podExistente != null) 
        {
            podExistente.setMarca(dto.getMarca());
            podExistente.setMarca(dto.getMarca());
            podExistente.setPuffs(dto.getPuffs());
            podExistente.setValor(dto.getValor());
            podExistente.setSabor(dto.getSabor());
        }
        return podExistente;
    }

    @Override
    public void delete(Long id) {
        Pod pod = repository.findById(id);
        if (pod != null) {
            repository.delete(pod);
        }
    }

    @Override
    public Pod findById(Long id) 
    {
        return repository.findById(id);
    }

    @Override
    public List<Pod> findByMarca(String marca) 
    {
        
        return repository.findByMarca(marca);
    }

    @Override
    public List<Pod> findByAll() 
    {
        return repository.listAll();
    }
    }

