package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.PodDescartavelDTO;
import br.unitins.topicos1.dto.PodDescartavelResponseDTO;
import br.unitins.topicos1.model.PodDescartavel;
import br.unitins.topicos1.repository.PodDescartavelRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class PodDescartavelServiceImpl implements PodDescartavelService
{
    
    @Inject
    PodDescartavelRepository repository;

    @Override
    @Transactional
    public PodDescartavelResponseDTO insertD (PodDescartavelDTO dto)
{
    PodDescartavel novoPod = new PodDescartavel();
    novoPod.setMarca(dto.getMarca());
    novoPod.setPuffs(dto.getPuffs());
    novoPod.setValor(dto.getValor());
    novoPod.setSabor(dto.getSabor());

    repository.persist(novoPod);


    return PodDescartavelResponseDTO.valueOf(novoPod);
}

    @Override
    public PodDescartavelResponseDTO updateD(PodDescartavelDTO dto, Long id) 
    {
        PodDescartavel pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setPuffs(dto.getPuffs());
            pod.setValor(dto.getValor());
            pod.setSabor(dto.getSabor());
        }
        return PodDescartavelResponseDTO.valueOf(pod);
    }

    @Override
    public void deleteD(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public PodDescartavelResponseDTO findById(Long id) 
    {
        return PodDescartavelResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<PodDescartavelResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> PodDescartavelResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<PodDescartavelResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> PodDescartavelResponseDTO.valueOf(e)).toList();
    }
}

