package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.PodRecarregavelDTO;
import br.unitins.topicos1.dto.PodRecarregavelResponseDTO;
import br.unitins.topicos1.model.PodRecarregavel;
import br.unitins.topicos1.repository.PodRecarregavelRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class PodRecarregavelServiceImpl implements PodRecarregavelService
{
    
    @Inject
    PodRecarregavelRepository repository;

    @Override
    @Transactional
    public PodRecarregavelResponseDTO insertR (PodRecarregavelDTO dto)
{
    PodRecarregavel novoPod = new PodRecarregavel();
    novoPod.setMarca(dto.getMarca());
    novoPod.setModelo(dto.getModelo());
    novoPod.setCor(dto.getCor());
    novoPod.setValor(dto.getValor());

    repository.persist(novoPod);


    return PodRecarregavelResponseDTO.valueOf(novoPod);
}

    @Override
    public PodRecarregavelResponseDTO updateR(PodRecarregavelDTO dto, Long id) 
    {
        PodRecarregavel pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setModelo(dto.getModelo());
            pod.setCor(dto.getCor());
            pod.setValor(dto.getValor());
        }
        return PodRecarregavelResponseDTO.valueOf(pod);
    }

    @Override
    public void deleteR(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public PodRecarregavelResponseDTO findById(Long id) 
    {
        return PodRecarregavelResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<PodRecarregavelResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> PodRecarregavelResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<PodRecarregavelResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> PodRecarregavelResponseDTO.valueOf(e)).toList();
    }
    }

