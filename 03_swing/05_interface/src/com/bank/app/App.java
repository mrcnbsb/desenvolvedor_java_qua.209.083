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

        // variáveis
        double valor;

        cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular:"));
        cc.setCpf(JOptionPane.showInputDialog("Informe o CPF:"));

        do {
            // menu
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a opção desejada",                  
                null,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes, 
                opcoes[0]
            );

            if (opcao == "Consultar Dados"){
                JOptionPane.showMessageDialog(null, cc.consultarDados());                
            }
            else if (opcao == "Depositar"){
                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: R$").replace(",", "."));
                cc.depositar(valor);
                JOptionPane.showMessageDialog(
                    null,
                    "Depósito efetuado com sucesso." +
                    "\n Valor do saldo: R$ " + 
                    String.format("%.2f", cc.getSaldo())
                 );
            }
            else if(opcao == "Sacar"){
                valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: R$").replace(",", "."));
                if (cc.getSaldo() >= valor){
                    cc.sacar(valor);
                    JOptionPane.showMessageDialog(
                        null,
                        "Saque efetuado com sucesso." +
                        "\n Valor do saldo: R$ " + 
                        String.format("%.2f", cc.getSaldo())
                    );
                } else{
                    JOptionPane.showMessageDialog(
                        null,
                        "Saldo insuficiente." +
                        "\n Valor do saldo: R$ " + 
                        String.format("%.2f", cc.getSaldo())
                    );
                }            
            }            
        } while(opcao != "Sair");        
    }
}
