package br.unitins.topicos1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
//import jakarta.validation.constraints.Size;

public class VapeDTO 
{
    @NotBlank(message = "O campo marca não pode ser nulo.")
    private final String marca;
    @NotNull(message = "O campo modelo não pode ser nulo")
    private final  String modelo;
    private final String cor;
    @NotNull(message = "O campo valor não pode ser nulo")
    private final String valor;
    
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public String getValor() {
        return valor;
    }
    public VapeDTO( String marca, String modelo, String cor, String valor) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valor = valor;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
        VapeDTO other = (VapeDTO) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (cor == null) {
            if (other.cor != null)
                return false;
        } else if (!cor.equals(other.cor))
            return false;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        return true;
    }

    
    
}
