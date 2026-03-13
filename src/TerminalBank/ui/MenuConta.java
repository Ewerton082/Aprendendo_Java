package TerminalBank.ui;

import TerminalBank.model.Account;
import TerminalBank.service.AccountService;
import TerminalBank.service.TransactionService;

import java.util.Scanner;

public class MenuConta {
    private AccountService accountService;
    private TransactionService transactionService;
    private Account contaLogada;
    private final Scanner scanner = new Scanner(System.in);

    public MenuConta(AccountService accountService, TransactionService transactionService, Account contaLogada) {
        this.accountService = accountService;
        this.transactionService = transactionService;
        this.contaLogada = contaLogada;
    }

    public void menu(){
        boolean rodando = true;
        while (rodando){
            System.out.println("\n==============================");
            System.out.println("  Bem Vindo " + contaLogada.getNome());
            System.out.println("==============================");
            System.out.println(" 1. Consultar Saldo \n 2. Saque \n 3. Deposito \n 4. Ultima Transação \n 5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    accountService.consultarSaldo(contaLogada);
                    break;
                case 2:
                    System.out.printf("Atualmente você tem R$ %.2f, quanto deseja sacar?", contaLogada.getSaldo());
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    transactionService.withdram(contaLogada, valor);
                    break;
                case 3:
                    System.out.printf("Atualmente você tem R$ %.2f, quanto deseja Adicionar a sua conta?", contaLogada.getSaldo());
                    System.out.print("Valor: ");
                    double valordeposito = scanner.nextDouble();
                    scanner.nextLine();
                    transactionService.deposit(contaLogada, valordeposito);
                    break;
                case 4:
                    transactionService.ultimaTransacao(contaLogada);
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Obrigado por usar nossos serviços!!");
                    break;
                default:
                    System.out.println("Escolha uma opcão válida");
            }
        }
    }
}
