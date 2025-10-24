package com.entrada.app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        

        // declaração de variáveis
        String nome, email;
        int idade;
        float altura;

        //input
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura:");
        altura = leia.nextFloat();
        leia.nextLine(); // Limpa o buffer antes de ler o email
        System.out.println("Informe seu email:");
        email = leia.nextLine();

        // //output
        // System.out.println("Nome: " + nome);
        // System.out.println("Idade: " + idade + " anos");
        // System.out.println("Altura: " + altura + " m");
        // System.out.println("E-mail: " + email);
        
        //output2
        System.out.println("Nome: %s".formatted(nome));
        System.out.println("Idade: %d".formatted(idade));
        System.out.println("Altura: %.2f".formatted(altura));
        System.out.println("E-mail: %s".formatted(email));

        // fecha objeto do tipo Scanner
        leia.close();
    }
}
