package TerminalBank.service;


import TerminalBank.repository.AccountRepository;

public class TransactionService {
    private AccountRepository accountRepository;

    public TransactionService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


}
