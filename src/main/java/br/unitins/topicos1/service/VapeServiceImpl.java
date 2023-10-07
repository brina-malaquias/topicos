package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.VapeDTO;
import br.unitins.topicos1.dto.VapeResponseDTO;
import br.unitins.topicos1.model.Vape;
import br.unitins.topicos1.repository.VapeRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class VapeServiceImpl implements VapeService
{
    
    @Inject
    VapeRepository repository;

    @Override
    @Transactional
    public VapeResponseDTO insertV (VapeDTO dto)
{
    Vape novoPod = new Vape();
    novoPod.setMarca(dto.getMarca());
    novoPod.setModelo(dto.getModelo());
    novoPod.setCor(dto.getCor());
    novoPod.setValor(dto.getValor());

    repository.persist(novoPod);


    return VapeResponseDTO.valueOf(novoPod);
}

    @Override
    public VapeResponseDTO updateV(VapeDTO dto, Long id) 
    {
        Vape pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setModelo(dto.getModelo());
            pod.setCor(dto.getCor());
            pod.setValor(dto.getValor());
        }
        return VapeResponseDTO.valueOf(pod);
    }

    @Override
    public void deleteV(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public VapeResponseDTO findById(Long id) 
    {
        return VapeResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<VapeResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> VapeResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<VapeResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> VapeResponseDTO.valueOf(e)).toList();
    }
    }
