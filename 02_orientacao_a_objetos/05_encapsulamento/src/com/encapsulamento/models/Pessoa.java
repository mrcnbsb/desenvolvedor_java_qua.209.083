package com.encapsulamento.models;

public class Pessoa {
    // modificadores de acesso
    // public: mesma classe, mesmo pacote, subclasse, outro pacote
    // private: mesma classe
    // protected: mesma classe, mesmo pacote e subclasses
    // package private (default): mesma classe, mesmo pacote pacote
    
    //atributos
    private String nome;
    private String cpf;
    private String email;
    private int idade; 

    public Pessoa() {
    }

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
        if(email.contains("@")){
            this.email = email;
        }        
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }        
    }

}
