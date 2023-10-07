package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Nic;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NicRepository implements PanacheRepository<Nic>
{
    /*public List<Pod> findByNome(String nome)
    {
        return find("UPPER(nome) LIKE UPPER (?1)", "%"+nome+"%").list();
        
    }
    */

    public List<Nic> findByMarca(String marca) 
    {
        return null;
    }
}