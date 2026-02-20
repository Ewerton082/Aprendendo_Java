package medio.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> NomesNinjas = new Stack<>();

        NomesNinjas.push("narutoBala");
        NomesNinjas.push("Hinata");
        NomesNinjas.push("Tobirama");
        System.out.println("Stack Inicial --> " + NomesNinjas); // Aqui Retorna os 3 nomes de cima

        NomesNinjas.push("Sasuke");
        System.out.println("Stack depois do Push ---> " + NomesNinjas); // Aqui Retorna os 3 nomes de cima e o do sasuke

        NomesNinjas.pop(); // com esse comando o sasuke sai por que ele está no topo
        System.out.println("Stack depois do Pop ---> " + NomesNinjas); // Aqui Retorna os 3 nomes de cima

        System.out.println("Item do Topo ---> " + NomesNinjas.peek()); // Aqui vai mostrar o proximo no topo

        NomesNinjas.pop(); // Agora o Tobirama saiu
        System.out.println("Stack depois do Pop ---> " + NomesNinjas); // Aqui Retorna os 3 nomes de cima

        System.out.println("Tamanho da Pilha ---> " + NomesNinjas.size()); // Aqui vai mostrar o tamanho da pilha




    }
}
