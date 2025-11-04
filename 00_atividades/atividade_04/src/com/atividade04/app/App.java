package com.atividade04.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        // variaveis
        String nome;
        int idade;
        int sala;

        // entrada de dados
        System.out.println("--Bem-vindo ao Cine SENAI--");
        System.out.println("Qual o seu nome:");
        nome = leia.nextLine();
        System.out.println("Qual a sua idade:");
        idade = leia.nextInt();

        // saída de dados
        do {        
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println(" Filmes em cartaz:");
            System.out.println("     - Sala 1 - A Roda Quadrada - Livre");
            System.out.println("     - Sala 2 - A Volta dos Que Não Foram - 12 anos");
            System.out.println("     - Sala 3 - Poeira em Alto Mar - 14 anos");
            System.out.println("     - Sala 4 - A Tranças do Rei Careca - 16 anos");
            System.out.println("     - Sala 5 - A Vingança do Peixe Frito - 18 anos");
            System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Escolha seu filme: 1/2/3/4/5");
            sala = leia.nextInt();

            // verifica escolha
            if (sala == 1){
                // classificação livre
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("Cine SENAI");
                System.out.println("Ingresso para a Sala " + sala);
                System.out.println("Filme:  - A Roda Quadrada - Classificação Livre");
                System.out.println("Nome: " + nome + ", idade: " + idade);
                System.out.println("Poltrona: N12");
                System.out.println("Ótimo filme!!");
                System.out.println("");
                break;
            } else if (sala == 2){
                // verifica idade limite
                if (idade >= 12){
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Cine SENAI");
                    System.out.println("Ingresso para a Sala " + sala);
                    System.out.println("Filme:  - A Volta dos Que Não Foram - Classificação 12 anos");
                    System.out.println("Nome: " + nome + ", idade: " + idade);
                    System.out.println("Poltrona: M08");
                    System.out.println("Ótimo filme!!");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("");
                    break;
                // caso 
                } else {
                    System.out.println("*************************************************************");
                    System.out.println("Cine SENAI");
                    System.out.println("Infelizmente você não tem a idade mínima determinada por lei.");
                    System.out.println("Experimente outro filme!");
                    System.out.println("*************************************************************");
                    System.out.println("");
                    continue;
                }                
            } else if (sala == 3){
                if(idade>=14){
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Cine SENAI");
                    System.out.println("Ingresso para a Sala " + sala);
                    System.out.println("Filme:  - Poeira em Alto Mar - Classificação 14 anos");
                    System.out.println("Nome: " + nome + ", idade: " + idade);
                    System.out.println("Poltrona: O02");
                    System.out.println("Ótimo filme!!");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("");
                    break;
                } else {
                    System.out.println("*************************************************************");
                    System.out.println("Cine SENAI");
                    System.out.println("Infelizmente você não tem a idade mínima determinada por lei.");
                    System.out.println("Experimente outro filme!");
                    System.out.println("*************************************************************");
                    System.out.println("");
                    continue;
                }                
            } else if (sala == 4){
                if(idade>=16){
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Cine SENAI");
                    System.out.println("Ingresso para a Sala " + sala);
                    System.out.println("Filme:  - A Tranças do Rei Careca - Classificação 16 anos");
                    System.out.println("Nome: " + nome + ", idade: " + idade);
                    System.out.println("Poltrona: J16");
                    System.out.println("Ótimo filme!!");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("");
                    break;
                } else {
                    System.out.println("*************************************************************");
                    System.out.println("Cine SENAI");
                    System.out.println("Infelizmente você não tem a idade mínima determinada por lei.");
                    System.out.println("Experimente outro filme!");
                    System.out.println("*************************************************************");
                    System.out.println("");
                    continue;
                }                            
            } else if (sala == 5){
                if(idade>=18){
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("Cine SENAI");
                    System.out.println("Ingresso para a Sala " + sala);
                    System.out.println("Filme:  - A Vingança do Peixe Frito - Classificação 18 anos");
                    System.out.println("Nome: " + nome + ", idade: " + idade);
                    System.out.println("Poltrona: M08");
                    System.out.println("Ótimo filme!!");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("");
                    break;
                } else {
                    System.out.println("*************************************************************");
                    System.out.println("Cine SENAI");
                    System.out.println("Infelizmente você não tem a idade mínima determinada por lei.");
                    System.out.println("Experimente outro filme!");
                    System.out.println("*************************************************************");
                    System.out.println("");
                    continue;
                }                     
            } else{
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("Cine SENAI");
                System.out.println("Escolha errada. Tente novamente!");
                System.out.println("");
            }
        } while(true);
        
        // fecha objeto leia
        leia.close();        
    }
}