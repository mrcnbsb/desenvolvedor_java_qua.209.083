package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Conta cc = new Conta(null, null, "1234-5", "5432-1", 0.0);

        // array
        String[] opcoes = {"Consultar Dados", "Depositar", "Sacar", "Sair"};
        Object opcao;

        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular:"));
        cc.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));

        // TODO: fazer o laço de repetição ...
        

        
    }
}
