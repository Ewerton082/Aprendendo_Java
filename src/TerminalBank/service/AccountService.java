package TerminalBank.service;

import TerminalBank.model.Account;
import TerminalBank.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Optional;

public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void criarConta(String name, String password, int idade){
        Account conta = new Account(name, password, 0, LocalDate.now() , idade);
        accountRepository.createAccount(conta);
    }

    public Account authenticate(String name, String password){
        Optional<Account> result = accountRepository.findByName(name);
        if (result.isPresent()){
            Account conta = result.get();
            if (conta.getSenha().equals(password)){
                return conta ;
            }
            System.out.println("Senha Invalida");;
            return null;
        }
        System.out.println("não há nenhuma conta com esse nome");;
        return null;
    }

    public Optional<Account> buscarConta(String name){
        return accountRepository.findByName(name); // num fluxo normal nao queremos que a Ui fale diretamente com o repository por isso criamos uma função mediadora
    }

    public void consultarSaldo(Account conta) {
        System.out.printf("Saldo atual: R$ %.2f", conta.getSaldo());

    }
}
