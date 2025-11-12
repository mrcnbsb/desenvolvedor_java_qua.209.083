package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instacias 
        Pessoa usuario = new Pessoa();        

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setCpf(JOptionPane.showInputDialog("Informe seu CPF:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe seu e-mail"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe seu telefone:"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));        

        // saída de dados
        JOptionPane.showMessageDialog(null,
         "DADOS DO USUÁRIO:" + "\n" +   
         "Nome: " + usuario.getNome() + "\n" +
         "CPF: " + usuario.getCpf() + "\n" + 
         "E-mail: " + usuario.getEmail() + "\n" +
         "Telefone: " + usuario.getTelefone() + "\n" + 
         "Idade: " + usuario.getIdade()
         );
        




    }
}
