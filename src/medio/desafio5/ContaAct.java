package medio.desafio5;

public interface ContaAct {

    //TODO: Irá retornar uma mensagem com o valor disponivel em conta
    void consultar_saldo(String pass);

    //TODO: irá acrescentar no dinheiro atual e irá validar por senha
    double depositar(double valor, String pass);

    //TODO: Irá retirar dinheiro do valor atual e irá validar por senha
    double saque(double value, String pass);
}
