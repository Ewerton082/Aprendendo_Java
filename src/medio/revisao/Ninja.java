package medio.revisao;


//Classes abstratas n podem gerar filhos ou seja n consigo criar objetos a partir dela
public abstract class Ninja {

    // usar variaveis privadas é mais seguro para n  comprometer os dados ai usamos funçoes para dar get e set na variavel
    private String nome;
    private String aldeia;
    private int idade;
    public int missoes;
    public Niveis_De_Classe nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Normalmente usamos 2 tipos de construtores (um vazio e outro completo)
    public Ninja(String nome, String aldeia, int idade, int missoes, Niveis_De_Classe nivel) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.missoes = missoes;
        this.nivel = nivel;
    }

    public Ninja() {
    }
}
