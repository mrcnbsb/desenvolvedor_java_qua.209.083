package com.atividade04.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        // variaveis
        String nome;
        int idade;
        int escolha;

        // entrada de dados
        System.out.println("--Welcome to the Cinema--");
        System.out.println("Informe seu nome:");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();

        for (int i=1; i!=0;i++){
            System.out.println("");
            System.out.println(" Filmes em cartaz:");
            System.out.println("     - Sala 1 - A Roda Quadrada - Livre");
            System.out.println("     - Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("     - Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("     - Sala 4 - A Tranças do Rei Careca - 16 anos");
            System.out.println("     - Sala 5 - A Vingança do Peixe Frito - 18 anos");
            System.out.println("Escolha seu filme: 1/2/3/4/5");
            escolha = leia.nextInt();
            if (escolha == 1){
                System.out.println("");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala 1");
                System.out.println("Filme:  - A Roda Quadrada - Classificação Livre");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: N12");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else if (escolha == 2 && idade >= 12){
                System.out.println("");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala 2");
                System.out.println("Filme:  - A Volta dos Que Não Foram - Classificação 12 anos");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: M08");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else if (escolha == 3 && idade >= 14){
                System.out.println("");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala 3");
                System.out.println("Filme:  - Poeira em Alto Mar - Classificação 14 anos");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: O02");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else if (escolha == 4 && idade >= 16){
                System.out.println("");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala 4");
                System.out.println("Filme:  - A Tranças do Rei Careca - Classificação 16 anos");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: J16");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else if (escolha == 5 && idade >= 18){
                System.out.println("");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala 5");
                System.out.println("Filme:  - A Vingança do Peixe Frito - Classificação 18 anos");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: M08");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else{
                System.out.println("");
                System.out.println("Escolha errada. Tente novamente!");
                System.out.println("");                    
            }
        }
        
        // fecha objeto leia
        leia.close();
        
    }
}
