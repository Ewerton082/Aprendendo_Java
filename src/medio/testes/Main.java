package medio.testes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        ArrayList<Products> lista_estoque = new ArrayList<>();
        short choice;

        pelucia peluciaTeste = new pelucia();
        peluciaTeste.name = "Pelúcia do Pikachu";
        peluciaTeste.tipoPelucia = "Pokémon";
        peluciaTeste.buy_price = 10.0;
        peluciaTeste.sell_price = 25.0;
        peluciaTeste.quantity = 50;
        lista_estoque.add(peluciaTeste);

        // Criando um livro de teste
        Books livroTeste = new Books();
        livroTeste.name = "Harry Potter e a Pedra Filosofal";
        livroTeste.genre = "Fantasia";
        livroTeste.buy_price = 20.0;
        livroTeste.sell_price = 45.0;
        livroTeste.quantity = 30;
        lista_estoque.add(livroTeste);


        do {
            System.out.println("=================================");
            System.out.println(" 1º > Cadastrar Produto");
            System.out.println(" 2º > Listar Produtos");
            System.out.println(" 3º > Comprar Produtos");
            System.out.println(" 4º > Vender Produtos");
            System.out.println(" 5º > Dar Desconto");
            System.out.println(" 6º > Dar Acrescimo");
            System.out.println(" 7º > Informações prododuto");
            System.out.println(" 0º > Finalizar programa");
            System.out.println("=================================");
            System.out.print("Opção: ");
            choice = Leitor.nextShort();

            switch (choice) {
                case 1:
                    Leitor.nextLine(); // limpar buffer

                    System.out.print("Deseja criar um Livro [1] ou uma Pelúcia [2]? ");
                    short tipoProduto = Leitor.nextShort();
                    Leitor.nextLine(); // limpar quebra de linha

                    Products novoProduto;

                    if (tipoProduto == 1) {
                        Books livro = new Books();
                        System.out.print("Gênero do livro: ");
                        livro.genre = Leitor.nextLine();
                        novoProduto = livro;
                    } else if (tipoProduto == 2) {
                        pelucia pelucia = new pelucia();
                        System.out.print("Tipo da pelúcia: ");
                        pelucia.tipoPelucia = Leitor.nextLine();
                        novoProduto = pelucia;
                    } else {
                        System.out.println("Tipo inválido, criando produto genérico.");
                        novoProduto = new Products();
                    }

                    System.out.print("Nome do produto: ");
                    novoProduto.name = Leitor.nextLine();

                    System.out.print("Preço de compra: ");
                    novoProduto.buy_price = Leitor.nextDouble();
                    Leitor.nextLine();

                    System.out.print("Preço de venda: ");
                    novoProduto.sell_price = Leitor.nextDouble();
                    Leitor.nextLine();

                    System.out.print("Quantidade: ");
                    novoProduto.quantity = Leitor.nextInt();
                    Leitor.nextLine();

                    lista_estoque.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    if (lista_estoque.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Produtos cadastrados:");
                        for (int i = 0; i < lista_estoque.size(); i++) {
                            Products p = lista_estoque.get(i);
                            System.out.println(i + " > " + p.name + " | Quantidade: " + p.quantity);

                            // Verifica se é livro ou pelúcia e mostra o campo específico
                            if (p instanceof Books b) {
                                System.out.println("   (Livro - Gênero: " + b.genre + ")");
                            } else if (p instanceof pelucia t) {
                                System.out.println("   (Pelúcia - Tipo: " + t.tipoPelucia + ")");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Comprar Produtos...");
                    // lógica para comprar produtos
                    break;
                case 4:
                    if (lista_estoque.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }

                    System.out.println("Escolha um produto para vender:");
                    for (int i = 0; i < lista_estoque.size(); i++) {
                        System.out.println(i + " > " + lista_estoque.get(i).name);
                    }

                    System.out.print("Digite o número do produto: ");
                    int indexVenda = Leitor.nextInt();
                    Leitor.nextLine();

                    if (indexVenda < 0 || indexVenda >= lista_estoque.size()) {
                        System.out.println("Produto inválido!");
                        break;
                    }

                    System.out.print("Quantidade a vender: ");
                    int qtdVenda = Leitor.nextInt();
                    Leitor.nextLine();

                    Products produtoVenda = lista_estoque.get(indexVenda);

                    if (produtoVenda instanceof pelucia pelucia) {
                        pelucia.realizarVenda(qtdVenda);
                    } else {
                        if (qtdVenda <= produtoVenda.quantity) {
                            produtoVenda.quantity -= qtdVenda;
                            System.out.println("Venda realizada de " + qtdVenda + " unidades do produto: " + produtoVenda.name);
                            System.out.println("Estoque restante: " + produtoVenda.quantity);
                        } else {
                            System.out.println("Estoque insuficiente para venda.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Dar Desconto...");
                    // lógica para aplicar desconto
                    break;
                case 6:
                    System.out.println("Dar Acréscimo...");
                    // lógica para aplicar acréscimo
                    break;
                case 7:
                    System.out.println("Informações do Produto...");
                    // lógica para mostrar informações do produto
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (choice != 0);
    }
}
