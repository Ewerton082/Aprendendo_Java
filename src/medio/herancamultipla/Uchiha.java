package medio.herancamultipla;

public class Uchiha extends Ninja implements Habilidades{

    Boolean sharingan;

    @Override
    public void ativarSharingan(){
        if (sharingan){
            System.out.println("Ativando Sharingan ...");
        }else {
            System.out.println("Não temos o sharingan ...");
        }
    }

    public Uchiha(String nome, int idade, String vila, Boolean sharingan){
        super(nome, idade, vila);
        this.sharingan = sharingan;
    }
}
