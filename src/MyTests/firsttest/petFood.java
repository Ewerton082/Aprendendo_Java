package MyTests.firsttest;

public class petFood extends Product implements movimentacoes{

    @Override
    public int realizar_vendas(int vendas) {
        super.quantity = super.quantity - vendas;
        return super.quantity;
    }

    @Override
    public int realizar_compras(int compras) {
        super.quantity = super.quantity + compras;
        return super.quantity;
    }

    @Override
    public void chamar_atencao() {
        System.out.println("Venham comprar ração para seu pet aqui !! temos a " + super.product);
    }

    @Override
    public void show_type() {
        System.out.println("tipo = " + tipo);
        System.out.println("quantity = " + quantity);
    }

    public petFood(String product, double buy_price, double sell_price, int quantity, String desc, tiposDeProdutos tipo) {
        super(product, buy_price, sell_price, quantity, desc, tipo);
    }

    public petFood() {
    }
}
