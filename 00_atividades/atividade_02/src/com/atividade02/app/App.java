package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // ax+b=0

        //instancias
        Scanner leia = new Scanner(System.in);

        // variaveis
        double a;
        double b;
        double x;

        // entrada de dados
        System.out.println(" --- ax + b = 0 ---");
        System.out.println("Informa o valor de a:");
        a = leia.nextDouble();

        System.out.println("Informe o valor de b:");
        b = leia.nextDouble();

        System.out.println("A equação do 1º grau (" + a + ")x" + " + (" + b + ")" + "=0 tem o seguinte valor de x:");
        x = (b*(-1))/a;
        System.out.println("x = " + x);

        // fecha objeto leia
        leia.close();
    }
}
