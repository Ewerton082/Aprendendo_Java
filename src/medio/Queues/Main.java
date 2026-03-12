package medio.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjaQueue = new LinkedList<>();

        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Minato");
        ninjaQueue.add("Hinata");
        ninjaQueue.add("Cachorro");


        // Aqui mostra os itens na ordem
        System.out.println("Fila de Atendimento: " + ninjaQueue);

        // Tirar o primeiro na fila
        System.out.println("Atendendo: " + ninjaQueue.peek()); // Ver o Topo da lista
        ninjaQueue.poll(); // Remover o primeiro item
        System.out.println("Fila de Atendimento: " + ninjaQueue);

        // Adicionando alguem no final
        ninjaQueue.add("Tobirama");
        System.out.println("Fila de Atendimento: " + ninjaQueue);

    }
}
