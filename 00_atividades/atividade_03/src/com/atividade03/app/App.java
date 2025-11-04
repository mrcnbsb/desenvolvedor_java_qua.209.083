package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // atividade 03
        // cálculo do imc

        // instancias
        Scanner leia = new Scanner(System.in);

        //variaveis
        String nome;
        double peso;
        double altura;
        double imc;
        String resultado;

        // entrada de dados
        System.out.println("--- Calcule o seu IMC ---");
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe seu peso em kg:");
        peso = leia.nextDouble();
        System.out.println("Informe sua altura em m:");
        altura = leia.nextDouble();

        // calcular o imc
        imc = peso / (altura * altura);

        // saída de dados
        System.out.println("");
        System.out.println(nome + ", o seu IMC é " + String.format("%.2f", imc) + ".");
        System.out.println("Segundo a OMS sua condição é:");        

        // Abaixo de 18,5	Abaixo do peso
        // 18,5 – 24,9	Peso normal
        // 25,0 – 29,9	Sobrepeso
        // 30,0 – 34,9	Obesidade grau I
        // 35,0 – 39,9	Obesidade grau II
        // ≥ 40,0	Obesidade grau III (grave)

        //OPERADOR TERNÁRIO
        resultado = (imc <18.5) ? "Abaixo do peso" :
        (imc < 25) ? "Peso normal" :
        (imc < 30) ? "Sobrepeso" :
        (imc < 35) ? "Obesidade grau I" :
        (imc < 40) ? "Obesidade grau II" : "Obesidade grau III (grave)";
        System.out.println(resultado);

        // if (imc < 18.5){
        //     System.out.println("Abaixo do peso");
        // } else if (imc >= 18.5 && imc <=24.9){
        //     System.out.println("Peso normal");
        // } else if (imc >= 25.0 && imc <=29.9){
        //     System.out.println("Sobrepeso");
        // } else if (imc >= 30.0 && imc <=34.9){
        //     System.out.println("Obesidade grau I");
        // } else if (imc >= 35.5 && imc <=39.9){
        //     System.out.println("Obesidade grau II");
        // } else {
        //     System.out.println("Obesidade grau III (grave)");
        // }
        System.out.println("");
        
        // fecha objeto leia
        leia.close();
    }
}
