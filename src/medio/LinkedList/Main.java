package medio.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String>  linked = new LinkedList<>();
        linked.add("Teste Naruto");
        linked.add("bakugan");
        linked.add("Sayonara");

        System.out.println(linked);

        linked.add(1,"PokemonGo");

        System.out.println(linked);
        linked.addFirst("#sou o primeiro");
        System.out.println(linked);


    }
}
