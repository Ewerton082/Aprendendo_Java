package facil.exercices;

import java.util.Scanner;

public class teste_aprendizado {
    public static void main(String[] args) {
        Scanner leitor_dados = new Scanner(System.in);

        int low_speed = 0;
        int max_speed = 0;
        String tipo = "inicializada";

        /*
        * O Problema consiste em analizar a velocidade de um carro e ver se ele está na velocidae permitida na via
        * */

        System.out.print("[1] Via Residencial\n[2] Via estadual\n[3] Avenidas\nEm qual dessas vias você está? ");
        int via = leitor_dados.nextInt();
        leitor_dados.nextLine(); // Limpar facil.scanner

        switch (via){
            case 1:
                tipo = "Via Residencial";
                System.out.println("tipo de pista = " + tipo);
                low_speed = 20;
                max_speed = 40;
                break;

            case 2:
                tipo = "Via Estadual";
                System.out.println("tipo de pista = " + tipo);
                low_speed = 50;
                max_speed = 90;
                break;
            case 3:
                tipo = "Avenidas";
                System.out.println("tipo de pista = " + tipo);
                low_speed = 90;
                max_speed = 140;
                break;

            default:
                System.out.println("Erro no Programa");
                System.exit(0);
        }
        System.out.print("Qual o Seu nome: ");
        String nome_badas = leitor_dados.nextLine();

        System.out.print("Qual A velocidade que você está:");
        int my_speed = leitor_dados.nextInt();
        leitor_dados.nextLine(); // limpar facil.scanner

        if (nome_badas.equals("Ewerton")) {
            System.out.println("Você é o cara então não vai ser multado, Tchau " + nome_badas);
        }
        else {
            switch (tipo){
                case "Via Residencial":
                    if (my_speed > max_speed || my_speed < low_speed) {
                        System.out.println("Você foi multado por não estar na velocidade correta da via Residencial \n [maximo: " + max_speed + " | minimo: " + low_speed + " ]");
                    } else {
                        System.out.println("Tá tudo nos conformes parabens");
                    }
                    break;

                case "Via Estadual":
                    if (my_speed > max_speed || my_speed < low_speed) {
                        System.out.println("Você foi multado por não estar na velocidade correta da via Estadual \n [maximo: " + max_speed + " | minimo: " + low_speed + " ]");
                    } else {
                        System.out.println("Tá tudo nos conformes parabens");
                    }
                    break;

                case "Avenidas":
                    if (my_speed > max_speed || my_speed < low_speed) {
                        System.out.println("Você foi multado por não estar na velocidade correta da Avenida \n [maximo: " + max_speed + " | minimo: " + low_speed + " ]");
                    } else {
                        System.out.println("Tá tudo nos conformes parabens");
                    }
                    break;

                }
            }
        }
}

