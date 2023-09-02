package br.unitins.topicos1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Pod  
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String puffs;
    private String valor;
    private String sabor;
    
    public Long getId() 
    {
        return id;
    }
    
    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getMarca() 
    {
        return marca;
    }

    public String getPuffs() 
    {
        return puffs;
    }

    public void setPuffs(String puffs) 
    {
        this.puffs = puffs;
    }
    
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public String getValor() 
    {
        return valor;
    }

    public void setValor(String valor) 
    {
        this.valor = valor;
    }

    
   public String getSabor() 
    {
        return sabor;
    }

    public void setSabor(String sabor) 
    {
        this.sabor = sabor;
    }
    
    public static List<Pod> listAll() 
    {
        return null;
    }

}