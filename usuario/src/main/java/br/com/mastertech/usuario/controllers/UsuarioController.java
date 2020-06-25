package br.com.mastertech.usuario.controllers;

import br.com.mastertech.usuario.client.CepClient;
import br.com.mastertech.usuario.dtos.Usuario;
import br.com.mastertech.usuario.dtos.UsuarioRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UsuarioController {

    @Autowired
    private CepClient cepClient;

    @PostMapping
    public Usuario create(@RequestBody UsuarioRequest usuarioRequest) {
        HashMap<String, Object> cep = cepClient.getCep(usuarioRequest.getCep());

        Usuario usuario = new Usuario();
        usuario.setId(usuarioRequest.getId());
        usuario.setNome(usuarioRequest.getNome());
        usuario.setCep(cep);

        return usuario;
    }
}
