package facil.challlenges;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio_2 {
    public static void main(String[] args) {
        ArrayList<String> ninjas = new ArrayList<>();
        Scanner leitor_dados = new Scanner(System.in);
        while (true){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Apagar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            short choice = leitor_dados.nextShort();
            leitor_dados.nextLine();

            switch (choice) {
                case 1:
                    String nome_ninja;
                    System.out.print("Qual o nome do Seu Ninja? ");
                    nome_ninja = leitor_dados.nextLine();
                    if (nome_ninja.length() > 1){
                        ninjas.add(nome_ninja);
                        System.out.println("\nCadastrado :D");
                    } else {
                        System.out.println("\nERRO: você esqueceu de escrever o nome");
                    }
                    break;
                case 2:
                    if (!ninjas.isEmpty()){
                        System.out.println();
                        short cont = 1;
                        for (String ninja : ninjas){
                            System.out.println(cont + "° Ninja: " + ninja);
                            cont ++;
                        }
                        cont = 1;

                    } else {
                        System.out.println("\nERRO: Você Precisa adicionar algum ninja PRIMEIRO IMBECIL :(");
                    }
                    break;
                case 3:
                    if (!ninjas.isEmpty()){
                        System.out.print("Qual a posição do ninja [veja na sessão listar] [0 para sair]:");
                        choice = leitor_dados.nextShort();
                        leitor_dados.nextLine();
                        if (ninjas.size() >= choice){
                            ninjas.remove(choice - 1);
                            System.out.println("Ninja deletado");
                        } else{
                            System.out.println("ERRO: Não existe esse ninja");
                        }
                        break;

                    } else {
                        System.out.println("\nERRO: como vai deletar o que n existe boco?");
                    }
                case 4:
                    System.out.println("\nEncerrando o Programa ...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção invalida tente novamente  OPÇÕES:[1,2,3]");

            }
            leitor_dados.close();
        }
    }
}
