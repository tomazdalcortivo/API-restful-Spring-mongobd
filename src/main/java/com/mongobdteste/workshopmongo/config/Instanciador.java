package com.mongobdteste.workshopmongo.config;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instanciador implements CommandLineRunner {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Override
    public void run(String... args) throws Exception {

        repositorioUsuario.deleteAll();

        Usuario maria = new Usuario(null, "Maria Brown", "maria@gmail.com");
        Usuario alex = new Usuario(null, "Alex Green", "alex@gmail.com");
        Usuario bob = new Usuario(null, "Bob Grey", "bob@gmail.com");

        repositorioUsuario.saveAll(Arrays.asList(maria, alex, bob));
    }
}
