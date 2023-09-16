package br.unitins.topicos1.resource;

import java.util.List;

import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.model.Pod;
import br.unitins.topicos1.service.PodService;
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


@Path("/pod")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class podsResource 
{

    @Inject
    PodService service;

    @POST 
    @Transactional
    public Pod insert(PodDTO dto)
    {
        return service.insert(dto);
    }

    @GET
    public List<Pod> findAll() 
    {
        return service.findByAll();
    }

    @GET
    @Path("/{id}")
    public Pod findById(@PathParam("id") Long id)
    {
        return service.findById(id);
    }

    @GET
    @Path("//search/nome/{nome}")
    public List<Pod> findByMarca(@PathParam("marca") String marca)
    {
        return service.findByMarca(marca);
    }
    
    @PUT
    @Transactional
    @Path("/{id}")
    public Pod update(@PathParam("id") Long id, PodDTO dto) 
    {
        return service.update(dto, id);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id)
    {
        service.delete(id);
    }


}
