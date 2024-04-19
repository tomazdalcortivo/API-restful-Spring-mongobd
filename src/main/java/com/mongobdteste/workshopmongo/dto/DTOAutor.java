package com.mongobdteste.workshopmongo.dto;

import com.mongobdteste.workshopmongo.dominio.Usuario;

import java.io.Serializable;

public class DTOAutor implements Serializable {

    private String id;
    private String nome;

    public DTOAutor() {
    }

    public DTOAutor(Usuario obj) {
        this.setId(obj.getId());
        this.setNome(obj.getNome());
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
