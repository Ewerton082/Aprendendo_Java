package medio.revisao;

public class Uchiha extends Ninja implements Sharingan_Interface{

    int nivel_sharingan = 4;

    public void ataque(){
        System.out.println("Atacando os inimigos");
    }

    public void ataque_sharingan(){
        System.out.println("Recebe meu sharingan");
    }

    public Uchiha(String nome, String aldeia, int idade, int missoes, Niveis_De_Classe nivel, int nivel_sharingan) {
        super(nome, aldeia, idade, missoes, nivel);
        this.nivel_sharingan = nivel_sharingan;
    }

    public Uchiha() {
    }
}
