package medio.herancamultipla;

public abstract class Ninja {
    String nome;
    int idade;
    String vila;

    public void info(){
        System.out.println("Nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("vila = " + vila);
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }
}
