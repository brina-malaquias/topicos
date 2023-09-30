package br.unitins.topicos1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;


public class Usuario 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String idade;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "usuario_telefone",
        joinColumns = @JoinColumn (name = "id_usuario"),
        inverseJoinColumns = @JoinColumn (name = "id_telefone") )
    private List<Telefone> telefone;
    private String endereco;

    private String login;
    private String senha;

    public Long getId() 
    {
        return id;
    }
    public void setId(Long id) 
    {
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
    public String getIdade() 
    {
        return idade;
    }
    public void setIdade(String idade) 
    {
        this.idade = idade;
    }
    public List<Telefone> getTelefone() 
    {
        return telefone;
    }
    public void setTelefone(List<Telefone> telefone) 
    {
        this.telefone = telefone;
    }
    public String getEndereco() 
    {
        return endereco;
    }
    public void setEndereco(String email) 
    {
        this.endereco = email;
    }
    public String getLogin() 
    {
        return login;
    }
    public void setLogin(String login) 
    {
        this.login = login;
    }
    public String getSenha() 
    {
        return senha;
    }
    public void setSenha(String senha) 
    {
        this.senha = senha;
    }
    public List<Telefone> getListaTelefone() {
        return null;
    }
    public String getCpf() {
        return null;
    }
    public void setCpf(Object cpf) {
    }
    public void setListaTelefone(ArrayList<Telefone> arrayList) {
    }
    
}
