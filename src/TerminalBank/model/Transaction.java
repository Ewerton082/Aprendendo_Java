package TerminalBank.model;

import java.util.Date;

public abstract class Transaction {
    private TransactionType tipo;
    private double valor;
    private Date dataTransicao;

    public TransactionType getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataTransicao() {
        return dataTransicao;
    }

    public void setTipo(TransactionType tipo) {
        this.tipo = tipo;
    }

    public void setDataTransicao(Date dataTransicao) {
        this.dataTransicao = dataTransicao;
    }

    public Transaction(TransactionType tipo, double valor, Date dataTransicao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataTransicao = dataTransicao;
    }

    public Transaction() {
    }
}
