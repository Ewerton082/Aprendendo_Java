package medio.referencia;

public class Uchiha extends Ninja {

    Boolean sharigan;

    @Override
    public void Exec_habilidade() {
        System.out.println("Eu Copio Tudo com meu sharingan");
    }

    @Override
    public void jogar_shuriken(){
        System.out.println("Jogar Uma Shuriken");
    }

    @Override
    public void jogar_kunai() {
        System.out.println("Jogar uma kunai");
    }

    public Uchiha(String nome, String vila, int idade, E_Hokage hokage, Boolean sharigan) {
        super(nome, vila, idade, hokage);
        this.sharigan = sharigan;
    }

    public Uchiha(){

    }

}
