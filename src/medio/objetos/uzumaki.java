package medio.objetos;

public class uzumaki extends Ninja{

    boolean receptaculo;

    @Override
    public void habilidade_especial() {
        if (receptaculo){
            System.out.println("A Kurama Despertou, todos fujam da vila");
        } else {
            System.out.println("Tome um rasengan seu corno, " + nome + " é meu nome");
        }
    }
}
