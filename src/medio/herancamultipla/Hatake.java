package medio.herancamultipla;

public class Hatake extends Ninja implements Habilidades, anbu {

    Boolean sharingan;

    public void apresentar(){
        System.out.println("Meu nome é " + nome);
    }

    @Override
    public void ativarSharingan(){
        if (sharingan){
            System.out.println("Ativando Sharingan ...");
        }else {
            System.out.println("Não temos o sharingan ...");
        }
    }


    public Hatake(String nome, int idade, String vila) {
        super(nome, idade, vila);
    }

    public Hatake(ranks rankAtual, String vila, int numeroMissoesConluidas, int idade, String nome, Boolean sharingan) {
        super(rankAtual, vila, numeroMissoesConluidas, idade, nome);
        this.sharingan = sharingan;
    }


    @Override
    public void bemvindoAnbu() {
        System.out.println("Eu sou da Anbu seu otario");
    }
}

