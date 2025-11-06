package com.construtor.app;

import java.util.Scanner;
import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        // instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        // entrada de dados
        System.out.println("Informe seu nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe seu CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe seu email:");
        usuario.email = leia.nextLine();
        System.out.println("Informe seu telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe sua idade:");
        usuario.idade = leia.nextInt();

        // saída de dados
        System.out.println(usuario.apresentar());        

        // fecha objeto leia
        leia.close();        
    }
}
