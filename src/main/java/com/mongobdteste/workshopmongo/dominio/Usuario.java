package com.mongobdteste.workshopmongo.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
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
        if (!(o instanceof Usuario usuario)) return false;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
