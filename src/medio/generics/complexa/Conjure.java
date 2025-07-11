package medio.generics.complexa;

public class Conjure {

    private String nome;
    private int mana;
    private Nivel categoria;

    public Conjure(String nome, int mana, Nivel categoria) {
        this.nome = nome;
        this.mana = mana;
        this.categoria = categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setCategoria(Nivel categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "Conjure | " + nome + " | " + mana + " MP --> " + categoria;
    }
}
