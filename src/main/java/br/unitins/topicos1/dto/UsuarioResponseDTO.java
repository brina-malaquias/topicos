package br.unitins.topicos1.dto;

import java.util.List;

import br.unitins.topicos1.model.Usuario;

public record UsuarioResponseDTO(Long id,
String nome,
String idade,
String cpf,
String endereco,
String login,
String senha,
List<TelefoneDTO> listaTelefone
) { 
public static UsuarioResponseDTO valueOf(Usuario usuario){

    return new UsuarioResponseDTO(
        usuario.getId(), 
        usuario.getNome(),
        usuario.getIdade(),
        usuario.getCpf(),
        usuario.getEndereco(),
        usuario.getLogin(),
        usuario.getSenha(),
        usuario.getListaTelefone()
            .stream()
            .map(t -> TelefoneDTO.valueOf(t)).toList()
    );
}
    
}
