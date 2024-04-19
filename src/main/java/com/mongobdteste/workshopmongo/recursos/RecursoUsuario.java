package com.mongobdteste.workshopmongo.recursos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.dto.DTOUsuario;
import com.mongobdteste.workshopmongo.servicos.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/usuario")
public class RecursoUsuario {

    @Autowired
    private ServicoUsuario servico;

    //    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<DTOUsuario>> findAll() {
        List<Usuario> lista = servico.findAll();
        List<DTOUsuario> listaDto = lista.stream().map(x -> new DTOUsuario(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listaDto);
    }
}
