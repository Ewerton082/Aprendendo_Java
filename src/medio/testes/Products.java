package medio.testes;

public class Products {
    String name;
    double buy_price;
    double sell_price;
    int quantity;

    public void product_data(){
        System.out.println("Nome do Produto = " + name);
        System.out.println("Valor de compra = " + buy_price);
        System.out.println("Valor de venda = " + sell_price);
        System.out.println("Quantidade atual = " + quantity);
    }
}
