package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Atividade 02
        // Crie um programa que calcule a equação do 1º grau.
        // ax+b=0

        //instancia Scanner
        Scanner leia = new Scanner(System.in);

        // variaveis
        double a;
        double b;
        double x;

        // entrada de dados        
        System.out.println(" --- ax + b = 0 ---");
        System.out.println("Informa o valor de 'a':");
        a = leia.nextDouble();
        if (a == 0){
            System.out.println("Não existe raiz real, 'a' diferente de 0 necessariamente!");            
        } else{
            System.out.println("Informe o valor de 'b':");
            b = leia.nextDouble();

            // calcula a equação do primeiro grau
            x = -b/a;

            // saída de dados
            System.out.println("A equação do 1º grau (" + a + ")x" + " + (" + b + ")" + "=0 tem o seguinte valor de 'x':");            
            System.out.println("x = " + x);
        }                 

        // fecha objeto leia
        leia.close();
    }
}