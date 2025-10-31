package com.novacalculadora.app;

// classe Scanner
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia o scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        double x;
        double y;
        double resultado;
        int opcao;        

        // loop    
        do{
            //menu
            System.out.println("---CALCULADORA---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Resto da divisão");
            System.out.println("6 - Potência");
            System.out.println("7 - Sair");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();

            if (opcao != 7){
                
                if (opcao > 7){
                    System.out.println("Opçao errada, camarada!");
                    continue;
                }
                // entrada de dados
                System.out.println("Informe o valor de x:");
                x = leia.nextDouble();
                
                System.out.println("Informe o valor de y:");
                y = leia.nextDouble();

                // calculadora
                switch (opcao) {
                    case 1:
                        resultado = x + y;
                        System.out.println("Resultado: " + resultado);                    
                        break;
                    case 2:
                        resultado = x - y;
                        System.out.println("Resultado: " + resultado);                    
                        break;
                    case 3:
                        resultado = x * y;
                        System.out.println("Resultado: " + resultado);                    
                        break;
                    case 4:
                        resultado = x / y;
                        System.out.println("Resultado: " + resultado);                    
                        break;
                    case 5:
                        resultado = x % y;
                        System.out.println("Resultado: " + resultado);                    
                        break;
                    case 6:
                        resultado = Math.pow(x, y);
                        System.out.println("Resultado: " + resultado);                    
                        break;
                
                    // default:
                    //     System.out.println("Opção errada.");
                    //     break;
                } 
            }                         

        } while(opcao != 7);
        
        // mensagem saída
        System.out.println("Tchau!!");

        // fecha objeto leia (scanner)
        leia.close();        
    }
}
