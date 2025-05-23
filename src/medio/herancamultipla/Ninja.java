package medio.herancamultipla;

public abstract class Ninja {
    String nome;
    int idade;
    String vila;
    int numeroMissoesConluidas;
    ranks rankAtual;

    //TODO: Incluir novos atributos [numero de missoes concluidas e rank

    public void info(){
        System.out.println("Nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("vila = " + vila);
        System.out.println("numeroMissoesConluidas = " + numeroMissoesConluidas);
        System.out.println("rankAtual = " + rankAtual);
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    //TODO: Sobrecarga do construtor com tudo


    public Ninja(ranks rankAtual, String vila, int numeroMissoesConluidas, int idade, String nome) {
        this(nome, idade, vila);
        this.numeroMissoesConluidas = numeroMissoesConluidas;
        this.rankAtual = rankAtual;
    }
}
