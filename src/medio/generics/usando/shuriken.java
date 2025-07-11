package medio.generics.usando;

public class shuriken extends EquipamentosNinja{
    private String tipo;

    public shuriken(String nome) {
        super(nome);
    }

    public shuriken(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return getNome() + " " +  tipo;
    }
}
