package com.mongobdteste.workshopmongo.recursos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.servicos.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class RecursoUsuario {

    @Autowired
    private ServicoUsuario servico;

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> list = servico.findAll();
        return ResponseEntity.ok().body(list);
    }
}
