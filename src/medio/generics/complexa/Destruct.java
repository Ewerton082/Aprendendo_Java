package medio.generics.complexa;

public class Destruct {
    private String nome;
    private int mana;
    private Nivel categoria;

    public Destruct(String nome, int mana, Nivel categoria) {
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
        return "Desctruct | " + nome + " | " + mana + " MP --> " + categoria;
    }
}
