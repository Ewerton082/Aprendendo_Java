package medio.desafio5;

public abstract class ContaBancaria implements ContaAct {
    public String Usuario;
    private String Pass_key;
    public double Saldo_bancario;
    public TipoConta tipo;

    @Override
    public void consultar_saldo(String pass) {
        if (pass.equals(this.Pass_key)){
            System.out.println("Olá, Você tem " + String.format("%.2f",Saldo_bancario) + " R$ em sua conta " + tipo.tipoConta);
        }else {
            System.out.println("As Senhas não sao iguais.");
        }
    }

    public boolean validar(String pass){
        return pass.equals(Pass_key);
    }

    @Override
    public abstract double depositar(double valor, String pass);

    @Override
    public abstract double saque(double valor, String pass);


    public ContaBancaria(String usuario, String pass_key, double saldo_bancario) {
        Usuario = usuario;
        Pass_key = pass_key;
        Saldo_bancario = saldo_bancario;
    }

    public ContaBancaria(String usuario, String pass_key) {
        this.tipo = tipo;
        Usuario = usuario;
        Pass_key = pass_key;
        Saldo_bancario = 0;
    }

    @Override
    public String toString() {
        return "Conta do " + Usuario;
    }
}
