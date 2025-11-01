package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in); // Scanner
        String[] nomes = new String[5]; //array
      
        // entrada de dados
        for(int i=0; i<nomes.length; i++){
            System.out.println("Informe o " + (i+1) + "º nome: ");
            nomes[i] = leia.nextLine();             
        }

        // // saída de dados
        // for(int i=0; i<10; i++){
        //     System.out.println("Olá " + nomes[i]);            
        // }

        // saída de dados
        for (String nome : nomes){
            System.out.println("Olá " + nome);
        }

        // fecha objeto leia
        leia.close();
    }
}
