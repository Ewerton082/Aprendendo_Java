package medio.polimorfismo;

public class Ninja {

    String nome;
    String aldeia;
    int idade;


    // Isso é um metodo abstrato, geral, ou seja, todos têm
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
        System.out.println();
    }
}
