package TerminalBank.service;


import TerminalBank.model.Account;
import TerminalBank.model.Transaction;
import TerminalBank.model.TransactionType;
import TerminalBank.repository.AccountRepository;

import java.time.LocalDate;
import java.util.Optional;

public class TransactionService {
    private final AccountRepository accountRepository;

    public TransactionService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void withdram(Account conta, double valor){
        if (conta.getSaldo() > valor && valor > 0){
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.printf("Você acaba de sacar R$ %.2f e restam R$ %.2f na sua conta", valor, conta.getSaldo());
            Transaction transacao = new Transaction(TransactionType.SACAR, valor, LocalDate.now());
            conta.setUltimaTransacao(transacao);
        }else if (conta.getSaldo() < valor && valor > 0){
            System.out.printf("Não Foi Possivel sacar valor insuficiente !! (Valor atual R$ %.2f ", conta.getSaldo());
        }else{
            System.out.println("Não é possivel sacar valores negativos");
        }
    }


    public void deposit(Account conta, double valor){
        if (valor > 0){
            conta.setSaldo(conta.getSaldo() + valor);
            System.out.printf("Você acaba de Depositar R$ %.2f e agora tem R$ %.2f na sua conta", valor, conta.getSaldo());
            Transaction transacao = new Transaction(TransactionType.DEPOSITAR, valor, LocalDate.now());
            conta.setUltimaTransacao(transacao);
        } else {
            System.out.println("Erro!! Digite um valor válido");
        }
    }

    public void ultimaTransacao(Account conta) {
        Transaction transacao = conta.getUltimaTransacao();
        if (transacao != null) {
            System.out.printf("Última transação: %s de R$ %.2f em %s",
                    transacao.getTipo().getDescricao(),
                    transacao.getValor(),
                    transacao.getDataTransicao());
        } else {
            System.out.println("Nenhuma transação realizada ainda!");
        }
    }
}
