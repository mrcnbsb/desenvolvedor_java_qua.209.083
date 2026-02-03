package com.eventos.app.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idEvento;
    private String nome;
    private String local;
    private LocalDate data;
    private LocalTime hora;

    public Evento(){
    }

    public Evento(long idEvento, String nome, String local, LocalDate data, LocalTime hora) {
        this.idEvento = idEvento;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.hora = hora;
    }

    public long getIdEvento() {
        return this.idEvento;
    }

    public void setIdEvento(long idEvento) {
        this.idEvento = idEvento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return this.hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "{" +
            " idEvento='" + getIdEvento() + "'" +
            ", nome='" + getNome() + "'" +
            ", local='" + getLocal() + "'" +
            ", data='" + getData() + "'" +
            ", hora='" + getHora() + "'" +
            "}";
    }

}
