package br.unitins.topicos1;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import br.unitins.topicos1.dto.TelefoneDTO;
import br.unitins.topicos1.dto.AdministradorDTO;
import br.unitins.topicos1.dto.AdministradorResponseDTO;
import br.unitins.topicos1.dto.EnderecoDTO;
import br.unitins.topicos1.service.AdministradorService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class AdministradorResourceTest {

    @Inject
    AdministradorService AdministradorService;

    @Test
    public void testFindAll() {
        given()
          .when().get("/Administradors")
          .then()
             .statusCode(200);
    }

    @Test
    public void testInsert() {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "6253-7839"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "1502 sul", "Alameda 21", "24"));

        AdministradorDTO dto = new AdministradorDTO(
            "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
                "123456"
        );

        given()
            .contentType(ContentType.JSON)
            .body(dto)
            .when().post("/Administradors")
            .then()
            .statusCode(201)
            .body(
                "id", notNullValue(),
                "nome", is("Charles Pantoja Insert"),
                "idade", is("20"),
                "cpf", is("563.726.326-84"),
                "login", is("charlespantoja09@gmail.com"),
                "senha", is("123456")
            );
    }

    @Test
    public void testUpdate() throws Exception {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "6253-7839"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "1502 sul", "Alameda 21", "24"));

        AdministradorDTO dto = new AdministradorDTO(
        "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
            "123456"
        );

        // inserindo um Administrador
        AdministradorResponseDTO AdministradorTest = AdministradorService.insertA(dto);
        Long id = AdministradorTest.id();

        AdministradorDTO dtoUpdate = new AdministradorDTO(
        "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
            "123456"
        );

        given()
            .contentType(ContentType.JSON)
            .body(dtoUpdate)
            .when().put("/Administradors/"+ id)
            .then()
            .statusCode(204);

        

        // verificando a alteracao

        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        System.out.println(id);
        AdministradorResponseDTO usu = AdministradorService.findById(4l);
        assertThat(usu.nome(), is("Charles pantoja"));
        assertThat(usu.login(), is("123456"));

    }

    @Test
    public void testDelete() throws Exception {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "6253-7839"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "1502 sul", "Alameda 21", "24"));

        AdministradorDTO dto = new AdministradorDTO(
        "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
                "123456"
        );

        AdministradorResponseDTO AdministradorTest = AdministradorService.insertA(dto);
        Long id = AdministradorTest.id();

        given()
                .when().delete("/Administradors/" + id )
                .then()
                .statusCode(204);
    }

    @Test
    public void testeFindById() throws Exception {
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "6253-7839"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "1502 sul", "Alameda 21", "24"));

        AdministradorDTO dto = new AdministradorDTO(
        "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
                "123456"
        );
        AdministradorResponseDTO AdministradorTest = AdministradorService.insertA(dto);
        Long id = AdministradorTest.id();

        given()
                .when().get("/Administradors/" + id)
                .then()
                .statusCode(200);
    }

    @Test
    public void testeFindByNome() throws Exception{
        List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
        telefones.add(new TelefoneDTO("63", "6253-7839"));

        List<EnderecoDTO> enderecos = new ArrayList<EnderecoDTO>();
        enderecos.add(new EnderecoDTO("Plano Diretor sul", "1502 sul", "Alameda 21", "24"));

        AdministradorDTO dto = new AdministradorDTO(
        "Charles Pantoja Insert",
            "20",
            "563.726.326-84",
            telefones, enderecos, 
            "charlespantoja09@gmail.com",
                "123456"
        );

        AdministradorResponseDTO AdministradorTest = AdministradorService.insertA(dto);
        String nome = AdministradorTest.nome();

         given()
                .when().get("/Administradors/search/nome/" + nome)
                .then()
                .statusCode(200);
    }

}