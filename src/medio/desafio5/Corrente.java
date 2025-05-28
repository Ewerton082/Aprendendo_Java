package medio.desafio5;

public class Corrente extends ContaBancaria {

    @Override
    public double depositar(double valor, String pass) {
        if(validar(pass)){
            Saldo_bancario += (valor * 0.95);
            System.out.println("Foi Adicionado " + String.format("%.2f",(valor * 0.95)) + " R$ a sua conta. [ Juros de 5% ]");
        }else {
            System.out.println("As Senhas não bateram");
        }
        return valor;
    }

    @Override
    public double saque(double valor, String pass) {
        if(validar(pass)){
            Saldo_bancario -= valor;
            System.out.println("Foi Retirado " + String.format("%.2f",valor) + " R$ da sua conta.");
        }else {
            System.out.println("As Senhas não bateram");
        }
        return valor;
    }

    public Corrente(String usuario, String pass_key, double saldo_bancario) {
        super(usuario, pass_key, saldo_bancario);
        super.tipo = TipoConta.CORRENTE;
    }

    public Corrente(String usuario, String pass_key) {
        super(usuario, pass_key);
        super.tipo = TipoConta.CORRENTE;
    }
}
