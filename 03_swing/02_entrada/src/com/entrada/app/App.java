package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        String resultado;       
        int idade;

        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome:");        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")); // casting da string para o tipo int

        // // saíde de dados
        // if (idade > 18){
        //     JOptionPane.showMessageDialog(null, nome + " é maior de idade.");            
        // } else{
        //     JOptionPane.showMessageDialog(null, nome + " é menor de idade.");
        // }        
        
        // saída de dados com operador ternário
        resultado = (idade >= 18) ? "é maior de idade" : "é menor de idade";
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");
    }
}