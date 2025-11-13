package com.atividade5.models;

public class Pessoa {
    // atributos
    private String nome;
    private double peso;
    private double altura;

    // constructor
    public Pessoa() {
    }

    // métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
