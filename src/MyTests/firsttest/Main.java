package MyTests.firsttest;

public class Main {
    public static void main(String[] args) {

        petFood Friskies =  new petFood("Friskies carne", 136.44, 170.00,8,"A melhor ração do mercado para seu gato", tiposDeProdutos.COMIDA);

        Friskies.info();
        Friskies.realizar_vendas(4);
        Friskies.show_type();
        Friskies.realizar_compras(10);
        Friskies.show_type();
    }
}
