package com.mongobdteste.workshopmongo.servicos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.repositorio.RepositorioUsuario;
import com.mongobdteste.workshopmongo.servicos.exception.ObjetoNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repo;

    public List<Usuario> findAll() {
        return repo.findAll();
    }

    public Usuario findById(String id) {
        Optional<Usuario> optionalUsuario = repo.findById(id);
        if (optionalUsuario.isEmpty())
            throw new ObjetoNotFoundException("Objeto nâo encontrado");
        else
            return optionalUsuario.get();
    }
}
