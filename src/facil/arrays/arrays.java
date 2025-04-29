package facil.arrays;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        /*
        * Arrays: são lista de coisas, por exemplo, botar varios ninjas em uma unica variavel
        * objetivo: Agrupar varios ninjas em uma unica array/lista
        *
        * estrutura: Tipo[] nome = new tipo[quantidade]
        * Exemplo: int[] notas = new int[4]
        *
        * */

        String[] ninjas = new String[3];
        // String[] ninjas = {"Naruto", "Sasuke", "Sakura"}
        Scanner leitor_dados = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Qual o nome do seu "+ (i + 1) + "º ninja? ");
            String nome = leitor_dados.nextLine();
            ninjas[i] = nome;
        }

        System.out.println("Temos " + ninjas.length + " Ninjas ");
        for (int i = 0; i < 3 ; i++) {
            System.out.println(ninjas[i]);
        }

        System.out.println(ninjas);
    }
}
