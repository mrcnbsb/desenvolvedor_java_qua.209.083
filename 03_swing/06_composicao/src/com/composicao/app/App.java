package com.composicao.app;

import javax.swing.JOptionPane;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
       
        // instancias
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        // entrada de dados
        motorista.setNome(JOptionPane.showInputDialog("Informe o nome do motorista:"));
        motorista.setCpf(JOptionPane.showInputDialog("Informe o CPF do motorista:"));
        motorista.setTelefone(JOptionPane.showInputDialog("Informe o telefone do motorista:"));

        carro.setMarca(JOptionPane.showInputDialog("Informe a marca do veículo:"));
        carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do veículo:"));
        carro.setAno(JOptionPane.showInputDialog("Informe o ano do veículo:"));
        carro.setCor(JOptionPane.showInputDialog("Informe a cor do veículo:"));
        carro.setPlaca(JOptionPane.showInputDialog("Informe a placa do veículo:"));
        carro.setProprietario(motorista);

        // saída de dados
        JOptionPane.showMessageDialog(
            null,            
            "Marca: " + carro.getMarca() + "\n" +
            "Modelo: " + carro.getModelo() + "\n" +
            "Ano: " + carro.getAno() + "\n" +
            "Cor: " + carro.getCor() + "\n" +
            "Placa: " + carro.getPlaca() + "\n" +
            "Dono do veículo: " + carro.getProprietario().getNome() + "\n" +
            "CPF do dono do veículo: " + carro.getProprietario().getCpf() + "\n" + 
            "Telefone do dono do veículo: " + carro.getProprietario().getTelefone()
         );


    }
}
