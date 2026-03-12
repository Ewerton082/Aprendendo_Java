package medio.desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static LinkedList<Ninja> CadastroNinja = new LinkedList<>();

    public static void main(String[] args) {

        // Criar Linked List

        // Cadastras 7 Ninjas
        CadastroNinja.add(new Ninja("Naruto Uzumaki", 12, "Konoha", Rank.GENIN));
        CadastroNinja.add(new Ninja("Gaara", 17, "Suna", Rank.HOKAGE));
        CadastroNinja.add(new Ninja("Mei Terumi", 31, "Kiri", Rank.JOUNNIN));
        CadastroNinja.add(new Ninja("Onoki", 79, "Iwa", Rank.HOKAGE));
        CadastroNinja.add(new Ninja("Killer Bee", 35, "Kumo", Rank.JOUNNIN));
        CadastroNinja.add(new Ninja("Shikamaru Nara", 16, "Konoha", Rank.CHUUNIN));
        CadastroNinja.add(new Ninja("Temari", 18, "Suna", Rank.CHUUNIN));

        // Mostrar todos Ninjas
        System.out.println(CadastroNinja);

        // Remover Ultimo
        CadastroNinja.removeLast();
        System.out.println(CadastroNinja);

        // Adicionar Primeiro
        CadastroNinja.addFirst(new Ninja("Jiraiya", 54, "Konoha", Rank.JOUNNIN));
        System.out.println(CadastroNinja);

        menu();

    }
     static void menu(){
        Scanner leitor = new Scanner(System.in);

         while (true){
             System.out.println("========================");
             System.out.println("0 > Encerrar Menu");
            for (Ninja ninja : CadastroNinja){
                System.out.println(CadastroNinja.indexOf(ninja)+1 + " > "  + ninja.getNome());
            }
            System.out.print("Qual Ninja deseja Obter Informacões? ");
            int Escolha = leitor.nextInt();
            if (Escolha == 0){
                break;
            }
            if (Escolha <= CadastroNinja.size() - 1){
                System.out.println(CadastroNinja.get(Escolha - 1));
            }
        }
     }
}
