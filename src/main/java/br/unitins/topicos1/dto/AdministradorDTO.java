package br.unitins.topicos1.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class AdministradorDTO
{
    @NotBlank(message = "O campo nome não pode ser nulo.")
    private String nome;
    @NotBlank(message = "O campo idade não pode ser nulo.")
    private String idade;
    @NotBlank(message = "O campo cpf não pode ser nulo.")
    private String cpf;
    @NotBlank(message = "Os campos telefone não pode ser nulo.")
    private List<TelefoneDTO> listaTelefone;
    @NotBlank(message = "Os campos endereco não pode ser nulo.")
    private List<EnderecoDTO> listaEndereco;

    @NotBlank(message = "O campo login não pode ser nulo.")
    private String login;
    @NotBlank(message = "O campo senha não pode ser nulo.")
    private String senha;
    
    public String getNome() {
        return nome;
    }
    public String getIdade() {
        return idade;
    }
    public String getCpf() {
        return cpf;
    }
    public List<TelefoneDTO> getListaTelefone() {
        return listaTelefone;
    }
    public List<EnderecoDTO> getListaEndereco() {
        return listaEndereco;
    }
    public String getLogin() {
        return login;
    }
    public String getSenha() {
        return senha;
    }
    public AdministradorDTO(String nome, String idade, String cpf, List<TelefoneDTO> listaTelefone, List<EnderecoDTO> listaEndereco, String login, String senha) 
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.listaTelefone = listaTelefone;
        this.listaEndereco = listaEndereco;
        this.login = login;
        this.senha = senha;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((idade == null) ? 0 : idade.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((listaTelefone == null) ? 0 : listaTelefone.hashCode());
        result = prime * result + ((listaEndereco == null) ? 0 : listaEndereco.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
        AdministradorDTO other = (AdministradorDTO) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade == null) {
            if (other.idade != null)
                return false;
        } else if (!idade.equals(other.idade))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (listaTelefone == null) {
            if (other.listaTelefone != null)
                return false;
        } else if (!listaTelefone.equals(other.listaTelefone))
            return false;
        if (listaEndereco == null) {
            if (other.listaEndereco != null)
                return false;
        } else if (!listaEndereco.equals(other.listaEndereco))
            return false;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        return true;
    }

    
}
