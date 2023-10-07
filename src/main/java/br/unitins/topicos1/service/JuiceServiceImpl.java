package br.unitins.topicos1.service;

import java.util.List;
import br.unitins.topicos1.dto.JuiceDTO;
import br.unitins.topicos1.dto.JuiceResponseDTO;
import br.unitins.topicos1.model.Juice;
import br.unitins.topicos1.repository.JuiceRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import jakarta.inject.Inject;

@ApplicationScoped
public class JuiceServiceImpl implements JuiceService
{
    
    @Inject
    JuiceRepository repository;

    @Override
    @Transactional
    public JuiceResponseDTO insertJ (JuiceDTO dto)
{
    Juice novoPod = new Juice();
    novoPod.setMarca(dto.getMarca());
    novoPod.setTipo(dto.getTipo());
    novoPod.setValor(dto.getValor());
    novoPod.setSabor(dto.getSabor());

    repository.persist(novoPod);


    return JuiceResponseDTO.valueOf(novoPod);
}

    @Override
    public JuiceResponseDTO updateJ(JuiceDTO dto, Long id) 
    {
        Juice pod = repository.findById(id);
        if (pod != null) 
        {
            pod.setMarca(dto.getMarca());
            pod.setTipo(dto.getTipo());
            pod.setValor(dto.getValor());
            pod.setSabor(dto.getSabor());
        }
        return JuiceResponseDTO.valueOf(pod);
    }

    @Override
    public void deleteJ(Long id) {
        //Pod pod = repository.findById(id);
        if (repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public JuiceResponseDTO findById(Long id) 
    {
        return JuiceResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<JuiceResponseDTO> findByMarca(String marca) 
    {
        return repository.findByMarca(marca).stream()
            .map(e -> JuiceResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<JuiceResponseDTO> findByAll() 
    {
        return repository.listAll().stream()
            .map(e -> JuiceResponseDTO.valueOf(e)).toList();
    }
}