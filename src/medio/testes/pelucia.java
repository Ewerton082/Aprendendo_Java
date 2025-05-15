package medio.testes;

public class pelucia extends Products implements productsAct{
    String tipoPelucia;


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
        System.out.println("Foi vendido uma pelucia linda, temos" + QTD + " Unidades ainda saindo cada uma a " + sell_price);
        System.out.println("Ainda Temos " + quantity + " pelucias no estoque, Volte sempre");
        System.out.println("Essa Pelucia de  " + tipoPelucia + " é muito bonita");
    }

    @Override
    public void realizarcompra(int QTD) {
        quantity = quantity + QTD;
        System.out.println("Foi comprado" + QTD + "peluccias de "+ tipoPelucia + "cada uma de " + buy_price);
        System.out.println("Ainda Temos " + quantity + " pelucias no estoque, venha comprar :D");
        System.out.println("Essa Pelucia de  " + tipoPelucia + " vai vender igual agua");
    }

}
