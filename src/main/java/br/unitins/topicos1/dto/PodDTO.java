package br.unitins.topicos1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class PodDTO 
{
    @NotBlank(message = "O campo marca não pode ser nulo.")
    private final String marca;
    @NotNull(message = "O campo puffs não pode ser nulo")
    @Size(min = 3, max = 6)
    private final  String puffs;
    @NotNull(message = "O campo valor não pode ser nulo")
    private final String valor;
    private final String sabor;

    public PodDTO(String marca, String puffs, String valor, String sabor) 
    {
        this.marca = marca;
        this.puffs = puffs;
        this.valor = valor;
        this.sabor = sabor;
    }

    public String getMarca() 
    {
        return marca;
    }
    public String getPuffs() 
    {
        return puffs;
    }
    public String getValor() 
    {
        return valor;
    }
    public String getSabor() 
    {
        return sabor;
    } 
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((puffs == null) ? 0 : puffs.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        result = prime * result + ((sabor == null) ? 0 : sabor.hashCode());      
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PodDTO other = (PodDTO) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (puffs == null) {
            if (other.puffs != null)
                return false;
        } else if (!puffs.equals(other.puffs))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        if (sabor == null) {
            if (other.sabor != null)
                return false;
        } else if (!sabor.equals(other.sabor))
            return false;
        
        return true;
    }

    
}
