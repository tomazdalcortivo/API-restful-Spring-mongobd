package com.mongobdteste.workshopmongo.recursos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class RecursoUsuario {

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        Usuario maria = new Usuario("1", "Maria silva", "maria@gamil.com");
        Usuario alex = new Usuario("2", "alex robert", "alex@gamil.com");

        List<Usuario> list = new ArrayList<>(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }
}
