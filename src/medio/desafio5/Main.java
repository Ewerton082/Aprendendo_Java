package medio.desafio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner seletor = new Scanner(System.in);
        byte escolha;
        String usuario;
        String password;
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (true){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("[1] Criar nova conta\n" + "[2] Acessar Conta\n" + "[0] Encerrar o Programa");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("OPÇÃO: ");
            escolha = seletor.nextByte();
            seletor.nextLine();

            switch (escolha){
                case 1:
                    while (true) {
                        System.out.println("    Qual o tipo da conta?");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("[1] Poupança \n" + "[2] Corrente \n" + "[0] Cancelar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("OPÇÃO: ");
                        escolha = seletor.nextByte();
                        switch (escolha){
                            case 1:
                                System.out.println("Poupança");
                                break;
                            case 2:
                                System.out.println("Corrente");
                                break;
                            case 0:
                                System.out.println("Saindo da criação...");
                                break;
                            default:
                                System.out.println("Escolha uma opção valida");

                        if (escolha == 0){
                            break;
                        }

                        }
                    }
                case 2:
                    System.out.println("Acessando...");
                    break;
                case 0:
                    System.out.println("Encerrando o Programa...");
                    System.exit(0);
                default:
                    System.out.println("Faça uma escolha valida\n");
            }

        }
    }
}
