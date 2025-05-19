package medio.abstratas;

public class Uzumaki extends Ninja{

    Boolean portador;

    @Override
    public void Exec_habilidade() {
        if (portador){
            System.out.println("Eu Sou o portador da raposa de 9 caudas");
        }else {
            System.out.println("Receba Meu Rasengan");
        }
    }

    public Uzumaki(String nome, String vila, int idade, E_Hokage hokage, Boolean portador) {
        super(nome, vila, idade, hokage);
        this.portador = portador;
    }

    public Uzumaki() {

    }
}
