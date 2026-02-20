package medio.ResumoEstruturaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //ARRAYS
        //O array é determinado pelos colchetes, lembrando que é tamanho fixo que é o 4 abaixo
        // VANTAGEM: Os Arrays são mais rapidos justamente por ter uma memoria fixa então você tem um controle maior nas mãos

        String[] VilaDaFolhaArray = new String[5]; //tem 5 espacos reservados independente de eu nao usar
        VilaDaFolhaArray[0] = "Samurai";
        VilaDaFolhaArray[1] = "Hinata";
        VilaDaFolhaArray[2] = "Sakuna";
        VilaDaFolhaArray[3] = "Natsu";
        System.out.println(VilaDaFolhaArray); // quando printamos ele nos diz a referencia da memoria não os dados
        System.out.println(VilaDaFolhaArray[1]); // Quando colocamos o indice ele pega o valor certo
        System.out.println("============================================");



        //LIST
        //Aa Lista é adaptavel entao ela vai aumentando e diminuindo de acordo com a necessidade
        // o List é um atributo de uma biblioteca propria do java, que vem com diversos metodos
        // DESVANTAGEM: A list é mais lenta que a array porque requer mas memoria

        List<String> VilaDaFolhaList = new ArrayList<>();
        VilaDaFolhaList.add("SamuraiLista");// Esse metodo ja adiciona na lista
        VilaDaFolhaList.add("HinataLista");
        System.out.println(VilaDaFolhaList); // aqui no lugar de printar a referencia ele mostra tudo
        System.out.println(VilaDaFolhaList.get(1)); // aqui usa o comando get para pegar o resultado do index da lista
        System.out.println("============================================");


        //STACKS
        // São muito parecidos com listas mas com uma peculiaridade, vc só pode retirar o ultimo elemento da lista
        // mas assim como o list é de um biblioteca do java com muitos atributos e funcões uteis

        Stack<String> NomesNinjaStack = new Stack<>();

        NomesNinjaStack.push("Narutinho Final"); // Foi o primeiro a ser adicionado mas fica no fundo da pilha
        NomesNinjaStack.push("Hinatinha Meio"); // a segunda fica no meio
        NomesNinjaStack.push("Sakurinha Inicio"); // Foi a ultima a ser adicionada entao todos comandos que usarmos sera com ela podemos, remover, verificar ou adicionar outro em cima
        System.out.println(NomesNinjaStack);
        NomesNinjaStack.pop(); // Aqui Removeu o ultimo adicionado
        System.out.println(NomesNinjaStack);

    }
}
