package facil.ternarios;

import java.util.Scanner;

public class ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: em resumo um if else bem resumido, normalmente em uma única linha ajudando a reduzir o código
        * objetivo:
        *
        * exemplo de ternario: variavel = (condição) ? se for True : se for False ;
        * */

        Scanner leitor_dados = new Scanner(System.in);
        System.out.print("Qual a idade dele: ");
        short idade = leitor_dados.nextShort();
        leitor_dados.nextLine();

        String categoria = (idade >= 18) ? "ele é um ninja maior de idade" : "ele é um ninja menor de idade";
        System.out.println("categoria = " + categoria);

        /*
        * if (idade >= 18) {
        *   mostrar que ele tá liberado na tela
        * } else {
        *   mostrar que ele n pode fazer isso
        * }
        * */


        leitor_dados.close();
    }
}
