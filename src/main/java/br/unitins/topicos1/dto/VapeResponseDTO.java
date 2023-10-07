package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Vape;

public record VapeResponseDTO
(
    Long id,

    String marca,
    String modelo,
    String cor,
    String valor
) 
{
    public static VapeResponseDTO valueOf (Vape vape)
    {
        return new VapeResponseDTO
        (
            vape.getId(),
            vape.getMarca(),
            vape.getModelo(),
            vape.getCor(),
            vape.getValor()
        );
    }



    
}