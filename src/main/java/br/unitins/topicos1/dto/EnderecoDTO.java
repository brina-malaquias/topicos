package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Endereco;

public record EnderecoDTO (

String bairro,
    String quadra,
    String complemento,
    String n

    ) 
{
    public static EnderecoDTO valueOf(Endereco endereco)
    {
        return new EnderecoDTO(
            endereco.getBairro(),
            endereco.getQuadra(),
            endereco.getComplemento(),
            endereco.getN());
    }
    
}