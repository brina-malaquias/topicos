package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.NicDTO;
import br.unitins.topicos1.dto.NicResponseDTO;
import br.unitins.topicos1.model.Nic;
import br.unitins.topicos1.repository.NicRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class NicServiceImpl implements NicService
{
    
    @Inject
    NicRepository repository;

    @Override
    @Transactional
    public NicResponseDTO insertN (NicDTO dto)
{
    Nic novoPod = new Nic();
    novoPod.setMarca(dto.getMarca());
    novoPod.setTipo(dto.getTipo());
    novoPod.setValor(dto.getValor());
    novoPod.setSabor(dto.getSabor());

    repository.persist(novoPod);


    return NicResponseDTO.valueOf(novoPod);
}

    @Override
    public NicResponseDTO updateN(NicDTO dto, Long id) 
    {
        Nic pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setTipo(dto.getTipo());
            pod.setValor(dto.getValor());
            pod.setSabor(dto.getSabor());
        }
        return NicResponseDTO.valueOf(pod);
    }

    @Override
    public void deleteN(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public NicResponseDTO findById(Long id) 
    {
        return NicResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<NicResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> NicResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<NicResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> NicResponseDTO.valueOf(e)).toList();
    }
}