package medio.abstratas;

public class Uchiha extends Ninja{

    Boolean sharigan;

    @Override
    public void Exec_habilidade() {
        System.out.println("Eu Copio Tudo com meu sharingan");
    }

    public Uchiha(String nome, String vila, int idade, E_Hokage hokage, Boolean sharigan) {
        super(nome, vila, idade, hokage);
        this.sharigan = sharigan;
    }

    public Uchiha(){

    }

}
