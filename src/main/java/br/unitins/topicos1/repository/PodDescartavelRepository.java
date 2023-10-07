package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.PodDescartavel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PodDescartavelRepository implements PanacheRepository<PodDescartavel>
{
    /*public List<Pod> findByNome(String nome)
    {
        return find("UPPER(nome) LIKE UPPER (?1)", "%"+nome+"%").list();
        
    }
    */

    public List<PodDescartavel> findByMarca(String marca) 
    {
        return null;
    }
}

// Charles
