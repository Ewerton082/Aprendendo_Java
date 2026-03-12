package TerminalBank.repository;

import TerminalBank.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountRepository {

    private List<Account> accounts = new ArrayList<>();

    public void createAccount(Account account){
        if(findByName(account.getNome()).isPresent()){
            System.out.println("Ja temos uma conta cadastrada com esse nome !!");
            return;
        }
        this.accounts.add(account);
    }

    // O stream em resumo faz com que nesse comando seja lido item por item
    public Optional<Account> findByName(String name){
        return this.accounts // Aqui Nessa parte pegamos toda a lista
                .stream() // Transformamos num  fluxo de 1 por 1
                .filter(account -> name.equals(account.getNome())) // Aqui criamos uma variavel temporaria para ler item por item e validamos e o moe é igual
                .findFirst(); // pegamos o primeiro item que ele achar com esse nome do fluxo
    }

    public List<Account> findAll() {
        return accounts;
    }
}
