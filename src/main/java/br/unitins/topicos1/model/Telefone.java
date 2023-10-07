package br.unitins.topicos1.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Telefone 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String codigoArea;
    private String numero;

    public Long getId() 
    {
        return id;
    }
    public String getCodigoArea() 
    {
        return codigoArea;
    }
    public String getNumero() 
    {
        return numero;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }
    public void setCodigoArea(String codigoArea) 
    {
        this.codigoArea = codigoArea;
    }
    public void setNumero(String numero) 
    {
        this.numero = numero;
    }

}
