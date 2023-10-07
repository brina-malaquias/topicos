package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.ClienteDTO;
import br.unitins.topicos1.dto.ClienteResponseDTO;
import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.service.ClienteService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class ClienteResourceTest {

    @Inject
    ClienteService ClienteService;

    @Test
    public void testFindAll() {
        given()
          .when().get("/Clientes")
          .then()
             .statusCode(200);
    }

    @Test
    public void testInsert() {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "5555-5555"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "0612 sul", "Alameda 31", "19"));

        ClienteDTO dto = new ClienteDTO(
            "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );

        given()
            .contentType(ContentType.JSON)
            .body(dto)
            .when().post("/Clientes")
            .then()
            .statusCode(201)
            .body(
                "id", notNullValue(),
                "nome", is("Sabrina Malaquias Insert"),
                "idade", is("19"),
                "cpf", is("123.456.789-00"),
                "login", is("sabrinamalaquias01@gmail.com"),
                "senha", is("654321")
            );
    }

    @Test
    public void testUpdate() throws Exception {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "5555-5555"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "0612 sul", "Alameda 31", "19"));

        ClienteDTO dto = new ClienteDTO(
        "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );

        // inserindo um Cliente
        ClienteResponseDTO ClienteTest = ClienteService.insertC(dto);
        Long id = ClienteTest.id();

        ClienteDTO dtoUpdate = new ClienteDTO(
        "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );

        given()
            .contentType(ContentType.JSON)
            .body(dtoUpdate)
            .when().put("/Clientes/"+ id)
            .then()
            .statusCode(204);

        

        // verificando a alteracao

        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        ClienteResponseDTO usu = ClienteService.findById(4l);
        assertThat(usu.nome(), is("Sabrina Malaquias"));
        assertThat(usu.login(), is("654321"));

    }

    @Test
    public void testDelete() {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "5555-5555"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "0612 sul", "Alameda 31", "19"));

        ClienteDTO dto = new ClienteDTO(
        "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );

        ClienteResponseDTO clienteTest = ClienteService.insertC(dto);
        Long id = clienteTest.id();

        given()
                .when().delete("/clientes/" + id )
                .then()
                .statusCode(204);
    }

    @Test
    public void testeFindById() {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "5555-5555"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "0612 sul", "Alameda 31", "19"));

        ClienteDTO dto = new ClienteDTO(
        "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );
        ClienteResponseDTO clienteTest = ClienteService.insertC(dto);
        Long id = clienteTest.id();

        given()
                .when().get("/clientes/" + id)
                .then()
                .statusCode(200);
    }

    @Test
    public void testeFindByNome(){
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "5555-5555"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "0612 sul", "Alameda 31", "19"));

        ClienteDTO dto = new ClienteDTO(
        "Sabrina Malaquias Insert",
            "19",
            "123.456.789-00",
            telefones, enderecos, 
            "sabrinamalaquias01@gmail.com",
                "654321"
        );

        ClienteResponseDTO clienteTest = ClienteService.insertC(dto);
        String nome = clienteTest.nome();

         given()
                .when().get("/clientes/search/nome/" + nome)
                .then()
                .statusCode(200);
    }

}