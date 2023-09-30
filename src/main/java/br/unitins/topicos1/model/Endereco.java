package br.unitins.topicos1.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Endereco 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bairro;
    private String quadra;
    private String complemento;
    private String numero;

    public String getBairro() 
    {
        return bairro;
    }

    public String getQuadra() 
    {
        return quadra;
    }

    public String getComplemento() 
    {
        return complemento;
    }

    public String getNumero() 
    {
        return numero;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public void setQuadra(String quadra) 
    {
        this.quadra = quadra;
    }

    public void setComplemento(String complemento) 
    {
        this.complemento = complemento;
    }

    public void setNumero(String numero) 
    {
        this.numero = numero;
    }
}
