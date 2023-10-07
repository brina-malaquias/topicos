package br.unitins.topicos1.resource;

//import java.util.List;

import br.unitins.topicos1.dto.PodDescartavelDTO;
import br.unitins.topicos1.dto.PodDescartavelResponseDTO;
//import br.unitins.topicos1.model.Pod;
import br.unitins.topicos1.service.PodDescartavelService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
//import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;


@Path("/pod Descartavel")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PodDescartavelResource 
{

    @Inject
    PodDescartavelService service;

    @POST 
    @Transactional
    public Response insert(@Valid PodDescartavelDTO dto)
    {
        PodDescartavelResponseDTO retorno = service.insertD(dto);
        return Response.status(201).entity(retorno).build();
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public Response update(PodDescartavelDTO dto, @PathParam("id") Long id) 
    {
        service.updateD(dto, id);
        return Response.status(Status.NO_CONTENT).build();
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id)
    {
        service.deleteD(id);
        return Response.status(Status.NO_CONTENT).build();
    }

    @GET
    public Response findAll() 
    {
        return Response.ok(service.findByAll()).build();
    }

    @GET
    @Path("/{id}")
    public Response findById(@PathParam("id") Long id)
    {
        return Response.ok(service.findById(id)).build();
    }

    @GET
    @Path("//search/nome/{nome}")
    public Response findByMarca(@PathParam("marca") String marca)
    {
        return Response.ok(service.findByMarca(marca)).build();
    }
    





}
