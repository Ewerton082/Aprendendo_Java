package medio.testes;

public class Books extends Products implements productsAct{
    String genre;

    @Override
    public double desconto(double percentual) {
        sell_price = sell_price - ( sell_price * (percentual / 100));
        return sell_price;
    }

    @Override
    public double acrescimo(double percentual) {
        sell_price = sell_price + ( sell_price * (percentual / 100));

        return sell_price;
    }

    @Override
    public void realizarVenda(int QTD) {
        quantity = quantity - QTD;
        System.out.println("Foi vendido" + QTD + " saindo cada um a " + sell_price);
        System.out.println("Ainda Temos " + quantity + " no estoque, Volte sempre");
        System.out.println("Livros de " + genre + " são fodas hehe");
    }

    @Override
    public void realizarcompra(int QTD) {
        quantity = quantity + QTD;
        System.out.println("Foi comprado" + QTD + " livros saindo cada um a " + buy_price);
        System.out.println("Ainda Temos " + quantity + " livros no estoque, venha comprar :D");
        System.out.println("Livros de " + genre + " são fodas hehe");
    }
}
