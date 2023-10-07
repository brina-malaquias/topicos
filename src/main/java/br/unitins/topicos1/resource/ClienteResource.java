package br.unitins.topicos1.resource;

import java.util.List;

//import br.unitins.topicos1.dto.PodDTO;
import br.unitins.topicos1.dto.ClienteDTO;
import br.unitins.topicos1.dto.ClienteResponseDTO;
//import br.unitins.topicos1.model.Pod;
//import br.unitins.topicos1.model.Usuario;
import br.unitins.topicos1.service.ClienteService;
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


@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClienteResource 
{

    @Inject
    ClienteService service;

    @POST
    public ClienteResponseDTO insert(ClienteDTO dto) {
        return service.insertC(dto);
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public ClienteResponseDTO update(ClienteDTO dto, @PathParam("id") Long id) {
        return service.updateC(dto, id);
    }

    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        service.deleteC(id);
    }

    @GET
    public List<ClienteResponseDTO> findAll() {
        return service.findByAll();
    }

    @GET
    @Path("/{id}")
    public ClienteResponseDTO findById(@PathParam("id") Long id) {
        return service.findById(id);
    }
    
    @GET
    @Path("/search/nome/{nome}")
    public List<ClienteResponseDTO> findByNome(@PathParam("nome") String nome) {
        return service.findByNome(nome);
    }
}
