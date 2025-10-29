package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instanciar a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String resultado;
        double valor;

        // entrada de dados
        System.out.println("Informe o nome do passageiro:");
        nome = leia.nextLine();
        System.out.println("Informe o valor da bagagem:");
        valor = leia.nextDouble();

        // // verificar o valor
        // if (valor <= 1000){
        //     System.out.println(nome + " está liberado.");
        // } else {
        //     System.out.println(nome + " está retido.");
        // }

        // operador ternário
        // condição ? valor_se_verdadeiro : valor_se_falso;
        resultado = valor <= 100 ? " está liberado." : " está retido.";
        System.out.println(nome + resultado);
        
        // fecha objeto leia
        leia.close();
    }
}
