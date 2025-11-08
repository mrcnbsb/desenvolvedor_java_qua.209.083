package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

final public class App {
    public static void main(String[] args) throws Exception {
        // instancia objeto de entrada de dados
        Scanner scanner = new Scanner(System.in);

        // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaração de variáveis
        String motor;

        // entrada de dados do carro
        System.out.println("INFORME OS DADOS DO CARRO:\n");
        System.out.println("Informe o fabricante:");
        carro.fabricante = scanner.nextLine();
        System.out.println("Informe o modelo:");
        carro.modelo = scanner.nextLine();
        System.out.println("Informe a cor:");
        carro.cor = scanner.nextLine();
        System.out.println("Informe o ano:");
        carro.ano = scanner.nextLine();
        System.out.println("Informe a placa:");
        carro.placa = scanner.nextLine();        

        // padrão de motor do carro
        carro.motorDiesel = false;
        carro.motorEletrico = false;
        carro.motorFlex = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // entrada de dados tipo de motor
        System.out.println("Informe o tipo de motor:\n");
        System.out.println("1 - Gasolina");
        System.err.println("2 - Etanol");
        System.out.println("3 - Gasolina e Etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Elétrico");        
        motor = scanner.nextLine();
        
        switch(motor){
            case "1":
                carro.motorGasolina = true;                
                break;
            case "2":
                carro.motorEtanol = true;                
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default:
                System.out.println("Motor inexistente.");
        }

        // entrada de dados da moto
        System.out.println("\nINFORME OS DADOS DA MOTO:\n");
        System.out.println("Informe o fabricante:");
        moto.fabricante = scanner.nextLine();
        System.out.println("Informe o modelo:");
        moto.modelo = scanner.nextLine();
        System.out.println("Informe a cor:");
        moto.cor = scanner.nextLine();
        System.out.println("Informe o ano:");
        moto.ano = scanner.nextLine();
        System.out.println("Informe a placa:");
        moto.placa = scanner.nextLine();

        // saída de dados do carro
        System.out.println("                               _..-------++._\r\n" + //
                        "                             _.-'/ |      _||  \\\"--._\r\n" + //
                        "                       __.--'`._/_\\j_____/_||___\\    `----.\r\n" + //
                        "                  _.--'_____    |          \\     _____    /\r\n" + //
                        "                _j    /,---.\\   |        =o |   /,---.\\   |_\r\n" + //
                        "               [__]==// .-. \\\\==`===========/==// .-. \\\\=[__]\r\n" + //
                        "                 `-._|\\ `-' /|___\\_________/___|\\ `-' /|_.'     hjw\r\n" + //
                        "                       `---'                     `---'");
        System.out.println("\nDADOS DO CARRO");
        carro.exibirDados();
        
        // saída de dados da moto
        System.out.println("\r\n" + //
                        "            r==\r\n" + //
                        "        _  //\r\n" + //
                        "       |_)//(''''':\r\n" + //
                        "         //  \\_____:_____.-----.P\r\n" + //
                        "        //   | ===  |   /        \\\r\n" + //
                        "    .:'//.   \\ \\=|   \\ /  .:'':.\r\n" + //
                        "   :' // ':   \\ \\ ''..'--:'-.. ':\r\n" + //
                        "   '. '' .'    \\:.....:--'.-'' .'\r\n" + //
                        "    ':..:'                ':..:'");
        System.out.println("\nDADOS DA MOTO");
        moto.exibirDados();

        // fecha objeto scanner
        scanner.close();
                    
        
    }
}
