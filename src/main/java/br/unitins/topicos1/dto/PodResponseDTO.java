package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Pod;

public record PodResponseDTO
(
    Long id,
    String marca,
    String puffs,
    String valor,
    String sabor
)  { 
    public static PodResponseDTO valueOf (Pod pod)
    {
        return new PodResponseDTO
        (
            pod.getId(),
            pod.getMarca(),
            pod.getPuffs(),
            pod.getValor(),
            pod.getSabor());
    }
}
