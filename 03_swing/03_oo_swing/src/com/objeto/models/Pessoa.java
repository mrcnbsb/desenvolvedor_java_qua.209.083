package com.objeto.models;

public class Pessoa {
    // atributos
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int idade;

    // constructor
    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public Pessoa(){        
    }

    // métodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
