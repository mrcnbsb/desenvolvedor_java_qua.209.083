package com.maioridade.app;

// importa a classe Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância da classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        int idade;

        // input
        System.out.print("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        // estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } 
        else {
            System.out.println(nome + " é menor de idade.");
        }

        // fecha o objeto Scanner
        leia.close();
    }
}
