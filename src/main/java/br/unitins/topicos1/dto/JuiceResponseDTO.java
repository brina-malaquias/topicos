package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Juice;

public record JuiceResponseDTO
(
    Long id,
    String marca,
    String tipo,
    String valor,
    String sabor
) 
{
    public static JuiceResponseDTO valueOf (Juice juice)
    {
        return new JuiceResponseDTO
        (
            juice.getId(),
            juice.getMarca(),
            juice.getTipo(),
            juice.getValor(),
            juice.getSabor()
            );
    }
}