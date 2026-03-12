package TerminalBank.service;


import TerminalBank.model.Account;
import TerminalBank.repository.AccountRepository;

import java.util.Optional;

public class TransactionService {
    private AccountRepository accountRepository;

    public TransactionService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void withidram(Account conta, double valor){
        Optional<Account> result = accountRepository.findByName(conta.getNome());
        if (result.isPresent()){
            Account selectedAccount = result.get();
            if (selectedAccount.getSaldo() > valor && valor > 0){
                selectedAccount.setSaldo(selectedAccount.getSaldo() - valor);
                System.out.printf("Você acaba de sacar R$ %.2f e restam R$ %.2f na sua conta", valor, selectedAccount.getSaldo());
            }else if (selectedAccount.getSaldo() < valor && valor > 0){
                System.out.printf("Não Foi Possivel sacar valor insuficiente !! (Valor atual R$ #.2f ", selectedAccount.getSaldo());
            }else{
                System.out.printf("Não é possivel sacar valores negativos");
            }
        }
    }

    public void deposit(Account conta, double valor){

    }
}
