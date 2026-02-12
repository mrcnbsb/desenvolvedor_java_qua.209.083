package com.sistema_apostila.app.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long IdTarefa;

    private String descricao;

    public Tarefa(){
    }

    public long getIdTarefa() {
        return this.IdTarefa;
    }

    public void setIdTarefa(long IdTarefa) {
        this.IdTarefa = IdTarefa;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
