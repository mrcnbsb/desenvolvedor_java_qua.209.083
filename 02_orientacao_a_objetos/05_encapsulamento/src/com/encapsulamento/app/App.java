package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia as classes
        Scanner scan = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // entrada de dados        
        System.out.println("\nInforme seu nome:");
        usuario.setNome(scan.nextLine());
        System.out.println("Informe seu CPF:");
        usuario.setCpf(scan.nextLine());
        System.out.println("Informe seu email:");
        usuario.setEmail(scan.nextLine());
        System.out.println("Informe sua idade:");
        usuario.setIdade(scan.nextInt());

        // saída de dados
        System.out.println("\nDADOS DO USUÁRIO");  
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());

        // fecha objeto scan
        scan.close();                
    }
}
