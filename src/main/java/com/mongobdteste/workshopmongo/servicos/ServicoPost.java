package com.mongobdteste.workshopmongo.servicos;

import com.mongobdteste.workshopmongo.dominio.Post;
import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.dto.DTOUsuario;
import com.mongobdteste.workshopmongo.repositorio.RepositorioPost;
import com.mongobdteste.workshopmongo.repositorio.RepositorioUsuario;
import com.mongobdteste.workshopmongo.servicos.exception.ObjetoNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoPost {

    @Autowired
    private RepositorioPost repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> optionalUsuario = repo.findById(id);
        if (optionalUsuario.isEmpty())
            throw new ObjetoNotFoundException("Objeto nâo encontrado");
        else
            return optionalUsuario.get();
    }
}
