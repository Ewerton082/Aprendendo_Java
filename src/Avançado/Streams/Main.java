package Avançado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("âaruto", "Konoha", 24));
        ninjas.add(new Ninja("Sasuke", "Konoha", 16));
        ninjas.add(new Ninja("sakura", "Konoha", 35));
        ninjas.add(new Ninja("gaara", "aldeia terra", 14));
        ninjas.add(new Ninja("xirito", "SAO", 65));
        ninjas.add(new Ninja("bsuna", "SAO", 19));
        ninjas.add(new Ninja("Gabimaru", "HellParadise", 22));


        // .stream é um metodo de muitas classes que importa varios metodos internos


        // Filtrar por algum dado
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("campo"))
                .forEach(System.out::println);



        // Aqui arruma a lista de acordo com o que vc deseja
        //Formato .sorted(( valor1, valor2 ) -> metodo de verificacao ).forEach(System.out::println);
        ninjas.stream()
                .sorted((n1, n2) -> String.CASE_INSENSITIVE_ORDER.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);


        // MAP
        // Mostrar algum atributo em especifico
        ninjas.stream()
                .map(Ninja::getAldeia)
                .forEach(System.out::println);


        // MAX e MIN
        // Filtrar o maior valor e menor valor

        Ninja maisVelho =ninjas.stream()
                .max((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()))
                .orElse(null);

        System.out.println("Ninja mais velho é : " + maisVelho);
    }
}
