package br.unitins.topicos1.dto;

import java.util.List;

public record UsuarioDTO
(
    String nome,
    String idade,
    String cpf,
    List<TelefoneDTO> listaTelefones,
    String endereco,

    String login,
    String senha
) 
{

}