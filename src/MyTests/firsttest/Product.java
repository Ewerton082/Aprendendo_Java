package MyTests.firsttest;

//Abstract Class
public abstract class Product {
    String product;
    double buy_price;
    double sell_price;
    int quantity;
    String desc;
    tiposDeProdutos tipo;

    public void info(){
        System.out.println("======================");
        System.out.println("product = " + product);
        System.out.println("quantity = " + quantity);
        System.out.println("buy_price = " + buy_price);
        System.out.println("sell_price = " + sell_price);
        System.out.println("desc = " + desc);
        System.out.println("======================");
    }

    //Method abstract
    public abstract void show_type();

    public Product() {
    }

    public Product(String product, double buy_price, double sell_price, int quantity) {
        this.product = product;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.quantity = quantity;
    }


    // Overload de constructor
    public Product(String product, double buy_price, double sell_price, int quantity, String desc, tiposDeProdutos tipo) {
        this(product, buy_price, sell_price, quantity);
        this.desc = desc;
        this.tipo = tipo;
    }

    //teste sobreescrever metodos
    public void teste_temp(){
        System.out.println("teste de sobrescever produto");
    }
}
