package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        System.out.println("---Atividade 01---");

        // variaveis
        String nome;
        String nascimento;
        String cpf;
        String email;
        String telefone;

        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento:");
        nascimento = leia.nextLine();
        System.out.println("Informe seu CPF:");
        cpf = leia.nextLine();
        System.out.println("Informe seu email:");
        email = leia.nextLine();
        System.out.println("Informe seu telefone:");
        telefone = leia.nextLine();

        System.out.println(" ");
        System.out.println(nome + ", que nasceu em " + nascimento + ", tem o cpf nº " + cpf + ", email: " + email + " e o nº de telefone: " + telefone + ". É uma boa pessoa.");

        // fecha objeto leia
        leia.close();
               
    }
}
