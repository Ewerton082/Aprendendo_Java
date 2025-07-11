package medio.generics.usando;

public class kunai extends EquipamentosNinja {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public kunai(String nome) {
        super(nome);
    }

    public kunai(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return getNome() + " " +  tipo;
    }
}
