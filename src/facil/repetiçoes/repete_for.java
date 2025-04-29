package facil.repetiçoes;

import java.util.Scanner;

public class repete_for {
    public static void main(String[] args) {

        /*
        * for e fori = é o for do python, porém o fori o intelli ajuda a fazer
        *
        * estrutura : for (int i = 0 ; i < x ; i++){ tudo aqui se repete }  */

        Scanner leitor_dados = new Scanner(System.in);
        System.out.print("Quantos clone o naruto consegue manter? ");
        int max_clones = leitor_dados.nextInt();
        leitor_dados.nextLine();

        for (int i = 0; i <= max_clones; i++) {
            System.out.println(i + "º Clone das sombras do Naruto");
        }
        System.out.println("Ele desmaiou");

        leitor_dados.close();
    }

}
