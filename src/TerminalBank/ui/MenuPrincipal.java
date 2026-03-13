package TerminalBank.ui;

import TerminalBank.model.Account;
import TerminalBank.service.AccountService;
import TerminalBank.service.TransactionService;

import java.util.Scanner;

public class MenuPrincipal {
    private AccountService accountService;
    private TransactionService transactionService;
    private final Scanner scanner = new Scanner(System.in);

    public MenuPrincipal(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }


    public void menu(){
        boolean rodando = true;
        while (rodando) {
            System.out.println("==============================");
            System.out.println("  Bem Vindo ao TerminalBank");
            System.out.println("==============================");
            System.out.println(" 1. Criar Conta \n 2. Acessar Conta \n 3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Qual Seu nome?");
                    String nome = scanner.nextLine();
                    System.out.print("Qual a Senha?");
                    String senha = scanner.nextLine();
                    System.out.print("Qual Sua idade");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    accountService.criarConta(nome, senha, idade);
                    break;

                case 2:
                    System.out.print("Digite seu nome : ");
                    String nomelogin = scanner.nextLine();
                    System.out.print("Digite sua Senha : ");
                    String senhalogin = scanner.nextLine();
                    Account contalogada = accountService.authenticate(nomelogin, senhalogin);
                    if (contalogada != null) {
                        MenuConta menuConta = new MenuConta(accountService, transactionService, contalogada);
                        menuConta.menu();
                    }
                    break;
                case 3:
                    rodando = false;
                    System.out.println("Até mais");
                    break;
            }
        }
    }
}
