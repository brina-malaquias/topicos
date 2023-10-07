package br.unitins.topicos1.resource;

import java.util.List;

//import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.dto.AdministradorDTO;
import br.unitins.topicos1.dto.AdministradorResponseDTO;
//import br.unitins.topicos1.dto.AdministradorDTO;
//import br.unitins.topicos1.dto.AdministradorResponseDTO;
//import br.unitins.topicos1.model.Pod;
//import br.unitins.topicos1.model.Usuario;
import br.unitins.topicos1.service.AdministradorService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
//import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/administradores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdministradorResource 
{

    @Inject
    AdministradorService service;

    @POST
    public AdministradorResponseDTO insert(AdministradorDTO dto) {
        return service.insertA(dto);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public AdministradorResponseDTO update(AdministradorDTO dto, @PathParam("id") Long id) {
        return service.updateA(dto, id);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        service.deleteA(id);
    }

    @GET
    public List<AdministradorResponseDTO> findAll() {
        return service.findByAll();
    }

    @GET
    @Path("/{id}")
    public AdministradorResponseDTO findById(@PathParam("id") Long id) {
        return service.findById(id);
    }
    
    @GET
    @Path("/search/nome/{nome}")
    public List<AdministradorResponseDTO> findByNome(@PathParam("nome") String nome) {
        return service.findByNome(nome);
    }
}

// Sabrina