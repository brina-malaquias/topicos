package br.unitins.topicos1.dto;

import java.util.List;

public record ClienteDTO
(
    String nome,
    String idade,
    String cpf,
    List<TelefoneDTO> listaTelefone,
    List<EnderecoDTO> listaEndereco,

    String login,
    String senha
) 
{

}