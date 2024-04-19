package com.mongobdteste.workshopmongo.repositorio;

import com.mongobdteste.workshopmongo.dominio.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPost extends MongoRepository<Post, String> {
}
