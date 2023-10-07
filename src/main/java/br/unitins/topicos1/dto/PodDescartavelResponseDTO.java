package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.PodDescartavel;

public record PodDescartavelResponseDTO
(
    Long id,
    String marca,
    String puffs,
    String valor,
    String sabor
)  
{ 
    public static PodDescartavelResponseDTO valueOf (PodDescartavel podDesDescartavel)
    {
        return new PodDescartavelResponseDTO
        (
            podDesDescartavel.getId(),
            podDesDescartavel.getMarca(),
            podDesDescartavel.getPuffs(),
            podDesDescartavel.getValor(),
            podDesDescartavel.getSabor()
            );
    }
}
