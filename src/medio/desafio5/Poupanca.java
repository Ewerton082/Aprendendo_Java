package medio.desafio5;

public class Poupanca extends ContaBancaria{

    @Override
    public double depositar(double valor, String pass) {
        if(validar(pass)){
            Saldo_bancario += valor;
            System.out.println("Foi Adicionado " + String.format("%.2f",valor) + " R$ a sua conta.");
        }else {
            System.out.println("As Senhas não bateram");
        }
        return valor;
    }

    @Override
    public double saque(double valor, String pass) {
        if(validar(pass)){
            if (Saldo_bancario >= valor) {
                Saldo_bancario -= valor;
                System.out.println("Foi Retirado " + String.format("%.2f", valor) + " R$ da sua conta. Você recebe: " + String.format("%.2f", (valor * 0.90)) + " [10% de Desconto]");
            } else {
                System.out.println("não foi possivel realizar o saque | (SALDO INSUFICIENTE) você tem: " + String.format("%.2f", Saldo_bancario) + " R$");
            }
        }else {
            System.out.println("As Senhas não bateram");
        }
        return valor;
    }

    public Poupanca(String usuario, String pass_key) {
        super(usuario, pass_key);
        super.tipo = TipoConta.POUPANCA;
    }

    public Poupanca(String usuario, String pass_key, double saldo_bancario) {
        super(usuario, pass_key, saldo_bancario);
        super.tipo = TipoConta.POUPANCA;
    }

}
