package br.unitins.topicos1.resource;

import java.util.List;
import br.unitins.topicos1.model.Pod;
import br.unitins.topicos1.repository.PodRepository;
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


@Path("/pod")

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class podsResource 
{

@Inject
PodRepository repository;

    @GET
    public List<Pod> findAll() 
    {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    public Pod findById(@PathParam("id") Long id)
    {
        return repository.findById(id);
    }

    @GET
    @Path("//search/nome/{nome}")
    public List<Pod> findByNome(@PathParam("marca") String marca)
    {
        return repository.findByNome(marca);
    }

    @POST 
    @Transactional
    public Pod insert(Pod pod)
    {
        Pod novoPod = new Pod();
        novoPod.setMarca(pod.getMarca());
        novoPod.setPuffs(pod.getPuffs());
        novoPod.setSabor(pod.getSabor());
        novoPod.setValor(pod.getValor());

        repository.persist(novoPod);

        return novoPod;
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public Response update(@PathParam("id") Long id, Pod pod) 
    {
        Pod entity = repository.findById(id);
        if (entity == null) 
        {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        entity.setMarca(pod.getMarca());
        entity.setPuffs(pod.getPuffs());
        entity.setSabor(pod.getSabor());
        entity.setValor(pod.getValor());

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
