package TerminalBank.model;

public enum TransactionType {
    SACAR("Saque"), DEPOSITAR("Deposito");

    private final String descricao;

    TransactionType(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
