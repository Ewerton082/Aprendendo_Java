package medio.desafio6;

public class Ninja {

    private String nome;
    private int idade;
    private String aldeia;
    private Rank nivel;

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    public Ninja(String nome, int idade, String aldeia, Rank nivel) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.nivel = nivel;
    }

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public Rank getNivel() {
        return nivel;
    }

    public void setNivel(Rank nivel) {
        this.nivel = nivel;
    }
}
