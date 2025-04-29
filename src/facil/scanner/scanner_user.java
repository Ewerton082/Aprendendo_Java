package facil.scanner;

import java.util.Scanner;

public class scanner_user {
    public static void main(String[] args) {
        /*
        * facil.scanner é igual o input do python: ou seja, é uma maneira de pôr o usuário para trabalhar
        * */

        // tipo liberar o input você abre a caixa de input e tem que fechar no fim
        Scanner caixaDeTexto = new Scanner(System.in);

        // Parte do nome
        System.out.print("Qual o nome do ninja: ");
        String nome = caixaDeTexto.nextLine();

        // parte da idade
        System.out.print("Qual a Idade do ninja: ");
        int idade = caixaDeTexto.nextInt();

        // tratamento de dados / condições
        if (idade == 666){
            System.out.println("Sai de Ré satanás");
        } else if (idade >= 18) {
            System.out.println("O Ninja" + nome + " tem " + idade + " Anos, Ou seja é maior de idade Tras a pinga");
        } else {
            System.out.println("O Ninja " + nome + " Ainda é uma criança de " + idade + " Anos, cuidado para n chorar");
        }

        // Fechamento da caixa ps: ainda não sei oque acontece se não fechar
        caixaDeTexto.close();
    }
}
