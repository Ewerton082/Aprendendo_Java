package medio.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ARRAY
        // Diferença: São estaticas, ou seja, o tamanho dela é fixo
        String[] ninjasarray = new String[3];
        ninjasarray[0] = "naruto ";
        ninjasarray[1] = "Sakura ";
        ninjasarray[2] = "Sasuke ";
        System.out.println(ninjasarray[0] + ninjasarray[1] + ninjasarray[2]);

        //LIST
        //Listas não são estaticas, ou seja, o tamanho e variavel pode diminuir ou aumentar que ele aloca espaço sozinho
        List<String> ninjaslist = new ArrayList<>();
        //nas Listas como é uma classe ela tem diversos metodos
        ninjaslist.add("Ino ");
        ninjaslist.add("Kiba ");
        ninjaslist.add("Shino ");
        // nesse ponto ela já funciona parecido com as listas de outras linguagens tipo python
        System.out.println(ninjaslist);
        System.out.println();
        //se quisermos adicionar ou remover temos metodos
        ninjaslist.add("Roronoa Zoro");
        System.out.println(ninjaslist);
        ninjaslist.remove("Roronoa Zoro");
        System.out.println(ninjaslist);
        // para trocar itens
        ninjaslist.set(0, "Hinata");
        System.out.println(ninjaslist);
        //para ver o tamanho da lista
        System.out.println(ninjaslist.size());

    }
}
