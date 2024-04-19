package com.mongobdteste.workshopmongo.recursos.exeception;

import java.io.Serializable;

public class StandardError implements Serializable {
    private Long timestamp;
    private Integer status;
    private String error;
    private String mensagem;
    private String path;

    public StandardError() {
    }

    public StandardError(Long timestamp,Integer status, String error, String mensagem, String path) {
        this.error = error;
        this.mensagem = mensagem;
        this.path = path;
        this.status = status;
        this.timestamp = timestamp;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
