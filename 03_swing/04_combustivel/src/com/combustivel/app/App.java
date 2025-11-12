package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Combustivel combustivel = new Combustivel();

        // array
        String[] opcoes = {"Informar valores", "Sair do programa", "Outra opção", "Mais uma opção"};
        Object opcao;

        do {
            // controle do loop
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma opção:", // texto na caixa
                "Combustível", // títula da janela
                0,
                null,
                opcoes, // array com opções
                opcoes[0] // default na caixa de seleção
            );

            if (opcao == "Informar valores"){
                // entrada de dados
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina em R$:").replace(",", ".")));
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanal em R$:").replace(",", ".")));
                
                // saída de dados
                JOptionPane.showMessageDialog(null, 
                "Posto SENAI" + "\n" + 
                "Gasolina: R$ " + combustivel.getGasolina() + "\n" + 
                "Etanol: R$ " + combustivel.getEtanol() + "\n" + 
                combustivel.calcularCombustivel());                       
            }                      
            
        } while(opcao != "Sair do programa");       
    }
}
