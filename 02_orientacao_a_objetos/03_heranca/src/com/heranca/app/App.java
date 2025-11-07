package com.heranca.app;

// classe Java importada
import java.util.Scanner;

// classes criadas por mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {            
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner scanner = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(null, null, 0, null, null);
        PessoaJuridica pj = new PessoaJuridica(null, null, null, null, null);

        // entrada de dados do usuário
        System.out.println("\nINFORME OS DADOS DO USUÁRIO:\n");
        System.out.println("Informe o nome:");
        usuario.nome = scanner.nextLine();
        System.out.println("Informe CPF:");
        usuario.cpf = scanner.nextLine();
        System.out.println("Informe o email:");
        usuario.email = scanner.nextLine();
        System.out.println("Informe o telefone:");
        usuario.telefone = scanner.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = scanner.nextInt();

        // limpeza do buffer: sempre após o scanner com dado numérico
        scanner.nextLine();

        // entrada de dados da empresa
        System.out.println("\nINFORME OS DADOS DA EMPRESA:\n");
        System.out.println("Informe o Nome Fantasia:");
        pj.nomeFantasia = scanner.nextLine();
        System.out.println("Informe a Razão Social:");
        pj.razaoSocial = scanner.nextLine();
        System.out.println("Informe o CNPJ");
        pj.cnpj = scanner.nextLine();
        System.out.println("Informe o email:");
        pj.email = scanner.nextLine();
        System.out.println("Informe o telefone:");
        pj.telefone = scanner.nextLine();
        
        // saída de dados
        System.out.println("\nDADOS DO USUÁRIO:\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA:\n");
        pj.exibirDados();

        // fecla objeto leia
        scanner.close();
    }
}
