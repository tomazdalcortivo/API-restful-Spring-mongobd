package com.mongobdteste.workshopmongo.config;

import com.mongobdteste.workshopmongo.dominio.Post;
import com.mongobdteste.workshopmongo.dominio.Usuario;
import com.mongobdteste.workshopmongo.dto.DTOAutor;
import com.mongobdteste.workshopmongo.dto.DTOComentario;
import com.mongobdteste.workshopmongo.repositorio.RepositorioPost;
import com.mongobdteste.workshopmongo.repositorio.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instanciador implements CommandLineRunner {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @Autowired
    private RepositorioPost repositorioPost;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        repositorioUsuario.deleteAll();
        repositorioPost.deleteAll();

        Usuario maria = new Usuario(null, "Maria Brown", "maria@gmail.com");
        Usuario alex = new Usuario(null, "Alex Green", "alex@gmail.com");
        Usuario bob = new Usuario(null, "Bob Grey", "bob@gmail.com");

        repositorioUsuario.saveAll(Arrays.asList(maria, alex, bob));


        Post post1 = new Post(null, sdf.parse("21/03/2024"), "Partiu, role", "Vou viajar para floripa", new DTOAutor(maria));
        Post post2 = new Post(null, sdf.parse("22/03/2024"), "rolezou", "Vou viajar para o mexico", new DTOAutor(maria));

        DTOComentario c1 = new DTOComentario("Boa, viagem mano", sdf.parse("21/03/2024"), new DTOAutor(alex));
        DTOComentario c2 = new DTOComentario("Que dahora bro", sdf.parse("23/03/2024"), new DTOAutor(bob));
        DTOComentario c3 = new DTOComentario("Sucesso", sdf.parse("24/03/2024"), new DTOAutor(alex));

        post1.getComentarios().addAll(Arrays.asList(c1, c2));
        post2.getComentarios().add(c3);

        repositorioPost.saveAll(Arrays.asList(post1, post2));

        maria.getPosts().addAll(Arrays.asList(post1, post1));
        repositorioUsuario.save(maria);
    }
}
