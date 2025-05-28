package medio.desafio5;

public enum TipoConta {
    CORRENTE("corrente"),
    POUPANCA("poupança");

    final String tipoConta;

    TipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
}
