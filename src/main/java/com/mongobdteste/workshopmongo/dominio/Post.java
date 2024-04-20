package com.mongobdteste.workshopmongo.dominio;

import com.mongobdteste.workshopmongo.dto.DTOAutor;
import com.mongobdteste.workshopmongo.dto.DTOComentario;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Document
public class Post implements Serializable {

    @Id
    private String id;
    private Date data;
    private String titulo;
    private String corpo;
    private DTOAutor autor;

    private List<DTOComentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(String id, Date data, String titulo, String corpo, DTOAutor autor) {
        this.corpo = corpo;
        this.data = data;
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public List<DTOComentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<DTOComentario> comentarios) {
        this.comentarios = comentarios;
    }

    public DTOAutor getAutor() {
        return autor;
    }

    public void setAutor(DTOAutor autor) {
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return Objects.equals(id, post.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
