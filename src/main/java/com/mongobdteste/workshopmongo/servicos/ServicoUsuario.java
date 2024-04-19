package com.mongobdteste.workshopmongo.servicos;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repo;

    public List<Usuario> findAll() {
        return repo.findAll();
    }
}
