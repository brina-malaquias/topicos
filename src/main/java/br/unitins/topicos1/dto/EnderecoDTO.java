package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Endereco;
import jakarta.validation.constraints.NotBlank;

public record EnderecoDTO 
(
    @NotBlank(message = "O campo marca não pode ser nulo.")
    String bairro,
    @NotBlank(message = "O campo marca não pode ser nulo.")
    String quadra,
    @NotBlank(message = "O campo marca não pode ser nulo.")
    String complemento,
    @NotBlank(message = "O campo marca não pode ser nulo.")
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