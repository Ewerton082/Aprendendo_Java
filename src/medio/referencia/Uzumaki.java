package medio.referencia;

public class Uzumaki extends Ninja {

    Boolean portador;

    @Override
    public void Exec_habilidade() {
        if (portador){
            System.out.println("Eu Sou o portador da raposa de 9 caudas");
        }else {
            System.out.println("Receba Meu Rasengan");
        }
    }

    @Override
    public void jogar_shuriken(){
        System.out.println("Jogar Uma Shuriken");
    }

    @Override
    public void jogar_kunai() {
        System.out.println("Jogar uma kunai");
    }

    public Uzumaki(String nome, String vila, int idade, E_Hokage hokage, Boolean portador) {
        super(nome, vila, idade, hokage);
        this.portador = portador;
    }

    public Uzumaki() {

    }
}
