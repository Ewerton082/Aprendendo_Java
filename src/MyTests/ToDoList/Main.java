package MyTests.ToDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);
        List<ToDo> listaTarefas = new ArrayList<>();
        int opcao;

        // Inserção dados
        ToDo testeTarefa = new ToDo("Colocar Comida dos Cachorros", Prioridade.ALTA);
        listaTarefas.add(testeTarefa);
        testeTarefa = new ToDo("Estudar Java Hoje", Prioridade.BAIXA);
        listaTarefas.add(testeTarefa);

        //Fim

        do {
            System.out.print("""
                =====================
                1 - Listar Tarefas
                2 - Criar Tarefas
                3 - Concluir Tarefas
                4 - Deletar Tarefas
                5 - Sair
                ======================
                """);
            System.out.print("Opção:");
            opcao = leitorDeDados.nextInt();
            leitorDeDados.nextLine();

            switch (opcao){
                case 1:
                    if (listaTarefas.isEmpty()){
                        System.out.println("você não tem nada adicionado");
                    }else{
                        System.out.println("======================");
                        for (ToDo item : listaTarefas){
                            System.out.println(item.toString());
                        }
                    }
                    break;

                case 2:
                    ArrayList<Object> temporario = new ArrayList<>(2);
                    System.out.println("======================");
                    System.out.print("Qual o Conteudo da Tarefa? ");
                    temporario.addFirst(leitorDeDados.nextLine());
                    System.out.print("""
                            1 - Baixo
                            2 - Medio
                            3 - Alto
                            Qual o nivel de prioridade?""");
                    temporario.add(1, leitorDeDados.nextInt());
                    switch ((int) temporario.get(1)){
                        case 1: temporario.set(1, Prioridade.BAIXA); break;
                        case 2: temporario.set(1, Prioridade.MEDIA); break;
                        case 3: temporario.set(1, Prioridade.ALTA); break;
                    }
                    listaTarefas.add(new ToDo( (String) temporario.get(0), (Prioridade) temporario.get(1)));
                    break;
                case 3:
                    System.out.println("======================");
                    System.out.println("Selecione o número da tarefa");
                    for (ToDo item : listaTarefas){
                        if (item.getConcluido() == Boolean.FALSE) {
                            System.out.println(listaTarefas.indexOf(item) + " | " + item.toString());
                        }
                    }
                    System.out.print("OPÇÃO: ");
                    opcao = leitorDeDados.nextInt();
                    System.out.println(listaTarefas.size());
                    if (opcao <= listaTarefas.size()){
                        System.out.println("Concluindo tarefa");
                        listaTarefas.get(opcao).concluiTarefa();
                    } else{
                        System.out.println("Opção Invalida, tente novamente");
                    }
                    break;
                case 4:
                    System.out.println("======================");
                    System.out.println("Selecione o número da tarefa");
                    for (ToDo item : listaTarefas){
                        System.out.println(listaTarefas.indexOf(item) + " | " + item.toString());
                    }
                    System.out.print("OPÇÃO: ");
                    opcao = leitorDeDados.nextInt();
                    System.out.println(listaTarefas.size());
                    if (opcao <= listaTarefas.size()){
                        System.out.println("Deletando a seguinte tarefa -> %s".formatted(listaTarefas.get(opcao).getTarefa()));
                        listaTarefas.remove(opcao);
                    } else{
                        System.out.println("Opção Invalida, tente novamente");
                    }
                    break;
            }
        } while(opcao != 5);
    }
}
