package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Vape;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VapeRepository implements PanacheRepository<Vape>
{
    public List<Vape> findByMarca(String marca) 
    {
        return null;
    }
}