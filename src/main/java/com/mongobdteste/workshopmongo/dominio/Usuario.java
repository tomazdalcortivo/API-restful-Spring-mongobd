package com.mongobdteste.workshopmongo.dominio;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

//@Document(collection = "usuario") so o document mapeia com base no nome da entidade em lowcase
@Document
public class Usuario implements Serializable {

    @Id
    private String id;
    private String nome;
    private String email;

    public Usuario() {
    }

    public Usuario(String id, String nome, String email) {
        this.email = email;
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario Usuario)) return false;
        return Objects.equals(id, Usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
