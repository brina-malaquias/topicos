package br.unitins.topicos1.resource;

import java.util.List;
import br.unitins.topicos1.model.Filme;
import br.unitins.topicos1.repository.FilmeRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/filme")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FilmesResource 
{

@Inject
FilmeRepository repository;

    @GET
    public List<Filme> findAll() 
    {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    public Filme findById(@PathParam("id") Long id)
    {
        return repository.findById(id);
    }

    @GET
    @Path("//search/nome/{nome}")
    public List<Filme> findByNome(@PathParam("nome") String nome)
    {
        return repository.findByNome(nome);
    }

    @POST 
    @Transactional
    public Filme insert(Filme filme)
    {
        Filme novoFilme = new Filme();
        novoFilme.setNome(filme.getNome());
        novoFilme.setGenero(filme.getGenero());
        novoFilme.setAtor(filme.getAtor());
        novoFilme.setIdioma(filme.getIdioma());
        novoFilme.setLegenda(filme.getLegenda());
        novoFilme.setDuracao(filme.getDuracao());
        novoFilme.setIdade(filme.getIdade());

        repository.persist(novoFilme);

        return novoFilme;
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Filme filme) 
    {
        Filme entity = repository.findById(id);
        if (entity == null) 
        {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        entity.setNome(filme.getNome());
        entity.setGenero(filme.getGenero());
        entity.setAtor(filme.getAtor());
        entity.setIdioma(filme.getIdioma());
        entity.setLegenda(filme.getLegenda());
        entity.setDuracao(filme.getDuracao());
        entity.setIdade(filme.getIdade());

        repository.persist(entity);
        return Response.ok(entity).build();
    }


    @DELETE
    @Transactional
    public void deleteById(Long id)
    {
        repository.deleteById(id);
    }

}
