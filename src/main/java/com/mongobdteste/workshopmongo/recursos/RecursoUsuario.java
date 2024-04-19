package com.mongobdteste.workshopmongo.recursos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.dto.DTOUsuario;
import com.mongobdteste.workshopmongo.servicos.ServicoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<DTOUsuario> findById(@PathVariable String id) {
        Usuario obj = servico.findById(id);
        return ResponseEntity.ok().body(new DTOUsuario(obj));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody DTOUsuario objDto) {
        Usuario obj = servico.fromDTO(objDto);
        obj = servico.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        servico.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Void> update(@RequestBody DTOUsuario objDto, @PathVariable String id) {
        Usuario obj = servico.fromDTO(objDto);
        obj.setId(id);
        servico.update(obj);
        return ResponseEntity.noContent().build();
    }
}
