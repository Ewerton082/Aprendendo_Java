package medio.desafio5;

public class Main {
    public static void main(String[] args) {

        Corrente ewerton = new Corrente("Ewerton","123456", 10000);

        ewerton.consultar_saldo("123");
        System.out.println();
        ewerton.consultar_saldo("123456");
        System.out.println();

        ewerton.depositar(5600,"1234567");
        System.out.println();
        ewerton.depositar(200, "123456");

        System.out.println();
        ewerton.consultar_saldo("123456");

        ewerton.saque(9000, "123456");

        ewerton.consultar_saldo("123456");
    }
}
