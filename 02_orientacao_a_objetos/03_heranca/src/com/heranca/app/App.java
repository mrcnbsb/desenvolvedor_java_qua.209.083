package com.heranca.app;

//import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {        
    public static void main(String[] args) throws Exception {
        // instancia
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        empresa.cnpj = "33.333.333/0001-33";
        empresa.email = "empresa@gmail.com";
        empresa.nomeFantasia = "Minha Emprasa";
        empresa.razaoSocial = " Empresa S.A LTDA";
        empresa.telefone = "(61)0800-1234";
        
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("Email a empresa: " + empresa.email);
        System.out.println("Telefone a empresa: " + empresa.telefone);

        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");

        usuario.nome = "Marcone";
        usuario.cpf = "123.456.789-01";
        usuario.idade = 45;
        usuario.email = "marcone@gmail.com";
        usuario.telefone = "(61)98765-4321";


        System.out.println("Nome do usuario: " + usuario.nome);
        System.out.println("CPF do usuario: " + usuario.cpf);        
        System.out.println("Email do usuario: " + usuario.email);
        System.out.println("Telefone do usuario: " + usuario.telefone);
        System.out.println("Idade do usuario: " + usuario.idade + "anos.");
    }
}
