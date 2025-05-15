package medio.construtor;

public class Hokage {

    String nome;
    int idade;
    boolean vivoOuMorto;

    // No args constructors são construtores que não precisam de argumentos para inicializar
    public Hokage() {
        // por padrão vem vazio, ou seja, no args que é a meneira que ja fazemos
        // Hokage Naruto = new Hokage();  Esse new é o construtor, ta vendo que n tem nenhum argumento no parenteses
    }

    // All Args Constructor são aqueles que precisam de todos os argumentos para fucionar

    public Hokage(String nome, int idade, boolean status){
        // é Possivel fazer varios construtores, ou seja, posso por apenas alguns construtores sem dar erro, mas não é uma boa prática
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = status;
    }

    public void Detalhes(){
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("vivoOuMorto = " + vivoOuMorto);
        System.out.println();
    }

    // Shortcut para criar algumas coisas mais rapidas [ALT + INSERT]



}

