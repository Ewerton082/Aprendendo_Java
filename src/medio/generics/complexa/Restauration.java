package medio.generics.complexa;

public class Restauration {
    private String nome;
    private int mana;
    private Nivel categoria;
    private String desc;

    public Restauration(String nome, int mana, Nivel categoria, String desc) {
        this.nome = nome;
        this.mana = mana;
        this.categoria = categoria;
        this.desc = desc;
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

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void desc(){
        System.out.printf("Descriçao da Magia: " + desc);
    }

    @Override
    public String toString(){
        return "Restauration | " + nome + " | " + mana + " MP --> " + categoria;
    }
}
