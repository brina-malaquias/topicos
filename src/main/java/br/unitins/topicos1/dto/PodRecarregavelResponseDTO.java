package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.PodRecarregavel;

public record PodRecarregavelResponseDTO
(
    Long id,

    String marca,
    String modelo,
    String cor,
    String valor
) 
{
    public static PodRecarregavelResponseDTO valueOf (PodRecarregavel podRecaregavel)
    {
        return new PodRecarregavelResponseDTO
        (
            podRecaregavel.getId(),
            podRecaregavel.getMarca(),
            podRecaregavel.getModelo(),
            podRecaregavel.getCor(),
            podRecaregavel.getValor()
        );
    }



    
}
