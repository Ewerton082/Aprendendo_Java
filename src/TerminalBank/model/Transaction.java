package TerminalBank.model;

import java.time.LocalDate;
import java.util.Date;

public class Transaction {
    private TransactionType tipo;
    private double valor;
    private LocalDate dataTransicao;

    public TransactionType getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getDataTransicao() {
        return dataTransicao;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }

    public void setDataTransicao(LocalDate dataTransicao) {
        this.dataTransicao = dataTransicao;
    }

    public Transaction(TransactionType tipo, double valor, LocalDate dataTransicao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataTransicao = dataTransicao;
    }

    public Transaction() {
    }
}
