package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @GetMapping("usuario/{id}")
    public Usuario getUsuario(@PathVariable long id) {
        Usuario usuario = new Usuario();

        usuario.setId(id);
        usuario.setNombre("Javier");
        usuario.setApellido("Rodriguez");
        usuario.setEmail("jrod@gmail.com");
        usuario.setTelefono("2344756952");

        return usuario;
    }

    @GetMapping("usuarios")
    public List<Usuario> getUsuarios() {

        Usuario usuario1 = new Usuario();

        usuario1.setId(1001L);
        usuario1.setNombre("Javier");
        usuario1.setApellido("Rodriguez");
        usuario1.setEmail("jrod@gmail.com");
        usuario1.setTelefono("2344756952");

        Usuario usuario2 = new Usuario();

        usuario2.setId(1002L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Tellez Mendoza");
        usuario2.setEmail("mtmendoza@gmail.com");
        usuario2.setTelefono("5512336655");

        Usuario usuario3 = new Usuario();

        usuario3.setId(1003L);
        usuario3.setNombre("Graciela");
        usuario3.setApellido("Amador Loyola");
        usuario3.setEmail("gamalo@gmail.com");
        usuario3.setTelefono("5533665522");

        return List.of(usuario1, usuario2, usuario3);
    }

    @GetMapping("usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();

        usuario.setNombre("Javier");
        usuario.setApellido("Rodriguez");
        usuario.setEmail("jrod@gmail.com");
        usuario.setTelefono("2344756952");

        return usuario;
    }

    @GetMapping("usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();

        usuario.setNombre("Javier");
        usuario.setApellido("Rodriguez");
        usuario.setEmail("jrod@gmail.com");
        usuario.setTelefono("2344756952");

        return usuario;
    }

    @GetMapping("usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();

        usuario.setNombre("Javier");
        usuario.setApellido("Rodriguez");
        usuario.setEmail("jrod@gmail.com");
        usuario.setTelefono("2344756952");

        return usuario;
    }

}
