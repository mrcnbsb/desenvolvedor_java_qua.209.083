package com.contador.app;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) throws Exception {
        // instancia o Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variável
        int n;

        // solicitando número inteiro ao usuário
        System.out.println("Informe número inteiro:");
        n = leia.nextInt();

        // loop (laço de repetição)
        // while (n >= 0){
        //     System.out.println(n);
        //     n--;
        // }

        // do{
        //     System.out.println(n);
        //     n--;

        // } while (n >=0);

        for(int x = n; x >= 0; x--){
            System.out.println(x);
        }

        // fechando leia
        leia.close();
    }
}
