package com.mongobdteste.workshopmongo.dto;

import java.util.Date;

public class DTOComentario {
    private String texto;
    private Date date;
    private DTOAutor autor;

    public DTOComentario() {
    }

    public DTOComentario(String texto, Date date, DTOAutor autor) {
        this.autor = autor;
        this.date = date;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DTOAutor getAutor() {
        return autor;
    }

    public void setAutor(DTOAutor autor) {
        this.autor = autor;
    }
}
