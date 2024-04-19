package com.mongobdteste.workshopmongo.dto;

import com.mongobdteste.workshopmongo.dominio.Usuario;

import java.io.Serializable;

public class DTOUsuario implements Serializable {

    private String id;
    private String nome;
    private String email;

    public DTOUsuario() {
    }

    public DTOUsuario(Usuario obj) {
        id = obj.getId();
        nome = obj.getNome();
        email = obj.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}
