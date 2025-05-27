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

    // Sobrecarga de metodo (o metodo de cima)



    @Override
    public void chamar_atencao(boolean foda){
        if(foda) {
            System.out.println("Mete a mão na raçao mane");
        }
        else {
            System.out.println("Tu é muito ruim");
        }
    }

    @Override
    public void show_type() {
        System.out.println("tipo = " + tipo);
        System.out.println("quantity = " + quantity);
    }

    public void teste_temp(){
        System.out.println("Teste na pets food");
    }

    public petFood(String product, double buy_price, double sell_price, int quantity, String desc, tiposDeProdutos tipo) {
        super(product, buy_price, sell_price, quantity, desc, tipo);
    }

    public petFood() {
    }
}
