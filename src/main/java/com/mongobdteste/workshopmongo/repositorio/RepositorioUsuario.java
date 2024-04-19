package com.mongobdteste.workshopmongo.repositorio;

import com.mongobdteste.workshopmongo.dominio.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends MongoRepository<Usuario, String> {
}
