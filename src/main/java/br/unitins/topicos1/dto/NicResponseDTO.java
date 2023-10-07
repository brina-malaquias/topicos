package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Nic;

public record NicResponseDTO
(
    Long id,
    String marca,
    String tipo,
    String valor,
    String sabor
) 
{
    public static NicResponseDTO valueOf (Nic nic)
    {
        return new NicResponseDTO
        (
            nic.getId(),
            nic.getMarca(),
            nic.getTipo(),
            nic.getValor(),
            nic.getSabor()
            );
    }
}
