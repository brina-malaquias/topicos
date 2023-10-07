package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.PodRecarregavel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PodRecarregavelRepository implements PanacheRepository<PodRecarregavel>
{
    public List<PodRecarregavel> findByMarca(String marca) 
    {
        return null;
    }
}
