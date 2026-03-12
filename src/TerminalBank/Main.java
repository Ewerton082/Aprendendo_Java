package TerminalBank;

import TerminalBank.repository.AccountRepository;
import TerminalBank.service.AccountService;
import TerminalBank.service.TransactionService;

public class Main {

    AccountRepository repository = new AccountRepository();

    AccountService accountService= new AccountService(repository);
    TransactionService transactionService = new TransactionService(repository);

    public static void main(String[] args) {

    }
}
