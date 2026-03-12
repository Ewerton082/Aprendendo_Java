package TerminalBank.model;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    private String nome;
    private String senha;
    private double saldo;
    private LocalDate tempoDeCliente;
    private int idade;
    private Transaction ultimaTransacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getTempoDeCliente() {
        return tempoDeCliente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Transaction getUltimaTransacao() {
        return ultimaTransacao;
    }

    public void setUltimaTransacao(Transaction ultimaTransacao) {
        this.ultimaTransacao = ultimaTransacao;
    }

    public Account(String nome, String senha, double saldo, LocalDate tempoDeCliente, int idade) {
        this.nome = nome;
        this.senha = senha;
        this.saldo = saldo;
        this.tempoDeCliente = tempoDeCliente;
        this.idade = idade;
    }

    public Account() {
    }
}
