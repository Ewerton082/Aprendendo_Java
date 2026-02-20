package medio.Records;

public class Main {
    public static void main(String[] args) {
        Ninja ninja1 = new Ninja("Naruto", "Narutinho.mail@gmail.com",92993399);
        System.out.println(ninja1.getNome());
        NinjaRecord ninja2 = new NinjaRecord("Sasuke", "Sasukin@live.com", 88888888);
        System.out.println(ninja2.nome());
        System.out.println(ninja2.emailCaixaAlta());

    }
}
