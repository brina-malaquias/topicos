package br.unitins.topicos1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Filme  
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String ator;
    private String idioma;
    private String legenda;
    private String duracao;
    private String idade;

   public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public String getAtor() 
    {
        return ator;
    }

    public void setAtor(String ator) 
    {
        this.ator = ator;
    }

    public String getIdioma() 
    {
        return idioma;
    }

    public void setIdioma(String idioma) 
    {
        this.idioma = idioma;
    }

    public String getLegenda() 
    {
        return legenda;
    }

    public void setLegenda(String legenda) 
    {
        this.legenda = legenda;
    }

    public String getDuracao() 
    {
        return duracao;
    }

    public void setDuracao(String duracao) 
    {
        this.duracao = duracao;
    }

    public String getIdade() 
    {
        return idade;
    }

    public void setIdade(String idade) 
    {
        this.idade = idade;
    }

    public static List<Filme> listAll() {
        return null;
    }

}