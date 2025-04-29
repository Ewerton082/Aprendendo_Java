package facil.repetiçoes;

import java.util.Scanner;

public class repete_while {
    public static void main(String[] args) {

        /*
        * laços de repetição em resumo é o while e o for de python
        * objetivo: Definir um limitador de clone pro naruto
        *
        * estrutura: while (condição) {tudo vai repetir até a condição ser falsa}
        * */

        Scanner leitor_dados = new Scanner(System.in);

        System.out.print("Quantos clones ele consegue fazer? ");
        int max_clone = leitor_dados.nextInt();
        leitor_dados.nextLine();

        int clones = 0;

        while (clones < max_clone){
            clones ++;
            System.out.println(clones + "º Clone das sombras do naruto");
        }

        System.out.println("Acabou nosso , ele desmaiou :(");

    }
}
