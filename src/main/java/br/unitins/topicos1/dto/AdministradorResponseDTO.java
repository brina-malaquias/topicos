package br.unitins.topicos1.dto;

import java.util.List;

import br.unitins.topicos1.model.Administrador;

public record AdministradorResponseDTO
(
    Long id,
    String nome,
    String idade,
    String cpf,
    String endereco,
    String login,
    String senha,
    List<TelefoneDTO> listaTelefone
) 
{ 

public static AdministradorResponseDTO valueOf(Administrador administrador)
{

    return new AdministradorResponseDTO(
        administrador.getId(), 
        administrador.getNome(),
        administrador.getIdade(),
        administrador.getCpf(),
        administrador.getLogin(),
        administrador.getSenha(),
        administrador.getListaTelefone()
            .stream()
            .map(t -> TelefoneDTO.valueOf(t)).toList(),
        administrador.getListaEndereco()
            .stream()
            .map(t -> EnderecoDTO.valueOf(t)).toList()
    );
}
    
}
