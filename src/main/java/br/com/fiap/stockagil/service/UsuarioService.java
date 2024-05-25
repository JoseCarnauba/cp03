package br.com.fiap.stockagil.service;

import br.com.fiap.stockagil.dto.CadastrarUsuario;
import br.com.fiap.stockagil.entidade.Usuario;
import br.com.fiap.stockagil.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(CadastrarUsuario cadastrarUsuario) {
        Usuario usuario = new Usuario(cadastrarUsuario);
        return usuarioRepository.save(usuario);
    }
}

