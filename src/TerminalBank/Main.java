package TerminalBank;

import TerminalBank.repository.AccountRepository;
import TerminalBank.service.AccountService;
import TerminalBank.service.TransactionService;
import TerminalBank.ui.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        AccountRepository repository = new AccountRepository();
        AccountService accountService= new AccountService(repository);
        TransactionService transactionService = new TransactionService(repository);
        MenuPrincipal menu = new MenuPrincipal(accountService, transactionService);
        menu.menu();
    }
}
