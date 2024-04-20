package com.mongobdteste.workshopmongo.recursos;

import com.mongobdteste.workshopmongo.dominio.Post;
import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.dto.DTOUsuario;
import com.mongobdteste.workshopmongo.servicos.ServicoPost;
import com.mongobdteste.workshopmongo.servicos.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class RecursoPost {

    @Autowired
    private ServicoPost servico;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = servico.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
