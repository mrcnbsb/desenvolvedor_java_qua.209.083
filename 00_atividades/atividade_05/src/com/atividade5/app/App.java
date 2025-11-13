package com.atividade5.app;

import javax.swing.JOptionPane;

import com.atividade5.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        // intancias
        Pessoa pessoa = new Pessoa();

        // array
         String[] opcoes = {"Informar valores", "Sair do programa"};
        Object opcao;

        // variáveis
        double imc;
        String resultado;

        do {
            // controle do loop
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma opção:", // texto na caixa
                "IMC", // títula da janela
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes, // array com opções
                opcoes[0] // default na caixa de seleção
            ); 

            if (opcao == "Informar valores"){
                // entrada de dados
                pessoa.setNome(JOptionPane.showInputDialog(
                    null,
                     "Informe seu nome:",
                     "CÁLCULO DO IMC",
                     JOptionPane.QUESTION_MESSAGE).toUpperCase());
                pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Informe seu peso:",
                    "CÁLCULO DO IMC",
                    JOptionPane.QUESTION_MESSAGE).replace(",", ".")));
                pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog(
                    null,
                    "Informe sua altura:", // texto
                    "CÁLCULO DO IMC", // título
                    JOptionPane.QUESTION_MESSAGE).replace(",", "."))); // ícone

                // cálculo do imc                
                imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());

                //OPERADOR TERNÁRIO
                resultado = (imc <18.5) ? "ABAIXO DO PESO" :
                (imc < 25) ? "PESO NORMAL" :
                (imc < 30) ? "SOBREPESO" :
                (imc < 35) ? "OBESIDADE GRAU I" :
                (imc < 40) ? "OBESIDADE GRAU II" : "OBESIDADE III (GRAVE)";

                // saída de dados
                JOptionPane.showMessageDialog(
                    null,                      
                    pessoa.getNome() + 
                        ", SEU IMC É " +
                        String.format("%.2f", imc) + 
                        "\n" +
                        "SEGUNDO A OMS: " +
                        resultado,
                    "CÁLCULO DO IMC", // título
                    JOptionPane.QUESTION_MESSAGE); // ícone
            }
         } while(opcao != "Sair do programa");        
    }
}
