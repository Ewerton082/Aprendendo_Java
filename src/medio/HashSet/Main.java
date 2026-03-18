package medio.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> ninjas = new ArrayList<>();
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        ninjas.add("Kakashi");
        ninjas.add("Naruto");
        // em Listas n se importa se ja tem o item entao pode se repetir infinita vezes igual
        System.out.println("Ninjas: " + ninjas);

        // Aprendendo HashSet

        // IMPORTANTE
        // Qual a Diferença e list para set?
        // R. a list só pode ser usada quando não importa a quantidade de itens iguais

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.add("Narutinho");
        ninjasSet.add("Sakurinha");
        ninjasSet.add("sasukinho");
        ninjasSet.add("Narutinho");
        ninjasSet.add("Baratinhaa");

        System.out.println("Ninjas set: " + ninjasSet);
        ninjasSet.remove("Narutinho");
        System.out.println(ninjasSet);


        // TreeSets

        Set<String> treeninja = new TreeSet<>();
        treeninja.add("Kirito");
        treeninja.add("Asuna");
        treeninja.add("Bagom");
        treeninja.add("Kirito");
        treeninja.add("Baratinhaa");

        System.out.println(treeninja);

    }
}
