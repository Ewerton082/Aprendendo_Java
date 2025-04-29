package facil.SwitchCases;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        /*
        * Hj: Treinaremos sobre Switch case
        * switch: em resumo é um if else com casos bem especificos
        * objetivo: Fazer o usuario escolher entre 3 ninjas
        * */

        Scanner leitor_de_entradas = new Scanner(System.in);

        System.out.println("[1] Naruto Uzumaki \n[2] Sakura Haruno \n[3] Sasuke Uchiha");
        System.out.print("Escolha o seu Ninja preferido: ");
        short opc = leitor_de_entradas.nextShort();
        leitor_de_entradas.nextLine();

        String ninja;

        switch (opc){

            case 1:
                ninja = "Naruto Uzumaki";
                System.out.println("\nninja = " + ninja);
                System.out.println("Ótima escolha o " + ninja + " é um ninja bolado");
                break;
            case 2:
                ninja = "Sakura Haruno";
                System.out.println("\nninja = " + ninja);
                System.out.println("Péssima Escolha para combate, a " + ninja + " só serve para curar");
                break;
            case 3:
                ninja = "Sasuke Uchiha";
                System.out.println("\nninja = " + ninja);
                System.out.println("Esse Cara é um traidor safado mas, o " + ninja + " é muito bom para combate");
                break;
            default:
                System.out.println("Sua Resposta foi invalida tente novamente");
        }

        leitor_de_entradas.close();
    }
}
