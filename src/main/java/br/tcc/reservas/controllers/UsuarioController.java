package br.tcc.reservas.controllers;

import br.tcc.reservas.entities.Usuario;
import br.tcc.reservas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario newUsuario(@RequestBody Usuario usuario) {

        if (consultaUsuario(usuario.getEmail()) != null) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Já existe um usuário cadastrado com este e-mail");
        }

        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public Usuario usuarioPorEmail(@RequestParam String email) {
        return consultaUsuario(email);
    }

    @GetMapping("/all")
    public List<Usuario> getUsuarioLista(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
    public Usuario consultaUsuario(String email) {
        Usuario usuarioConsulta = new Usuario();
        List<Usuario> usuarioLista = new ArrayList<Usuario>();

        usuarioLista = usuarioRepository.findByEmail(email);

        if (usuarioLista.size() > 0) {
            return usuarioLista.get(0);
        } else {
            return null;
        }
    }
}
