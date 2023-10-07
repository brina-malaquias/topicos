package br.unitins.topicos1.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Endereco extends DefaultEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 60, nullable = false)
    private String bairro;
    @Column(length = 7, nullable = false)
    private String quadra;
    @Column(length = 60, nullable = false)
    private String complemento;
    @Column(length = 20)
    private String n;

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }
    
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

    public String getN() 
    {
        return n;
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

    public void setN(String n) 
    {
        this.n = n;
    }

}
