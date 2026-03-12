package TerminalBank.service;

import TerminalBank.model.Account;
import TerminalBank.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Optional;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void criarConta(String name, String password, int idade){
        Account conta = new Account(name, password, 0, LocalDate.now() , idade);
        accountRepository.createAccount(conta);
    }

    public String authenticate(String name, String password){
        Optional<Account> result = accountRepository.findByName(name);
        if (result.isPresent()){
            Account conta = result.get();
            if (conta.getSenha().equals(password)){
                return "Realizando Login";
            }
            return "Senha Invalida, Tente novamente";
        }
        return "Não Temos Nenhuma conta registrada com esse nome";
    }

    public Optional<Account> buscarConta(String name){
        return accountRepository.findByName(name); // num fluxo normal nao queremos que a Ui fale diretamente com o repository por isso criamos uma função mediadora
    }
}
