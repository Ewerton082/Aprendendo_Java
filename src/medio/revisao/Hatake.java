package medio.revisao;

// como ele implimentou 2 interfaces ele fica com mais atributos e metodos
public class Hatake extends Ninja implements Sharingan_Interface, Rinegan_Interface{

    private boolean olho_copiador;

    public boolean isOlho_copiador() {
        return olho_copiador;
    }

    public void setOlho_copiador(boolean olho_copiador) {
        this.olho_copiador = olho_copiador;
    }

    @Override
    public void mil_tapas() {
        System.out.println("Darei Mil tapas agora pa pum");
    }

    @Override
    public void ataque_sharingan() {
        System.out.println("Pega meu Sharingan");
    }

    public Hatake(String nome, String aldeia, int idade, int missoes, Niveis_De_Classe nivel, boolean olho_copiador) {
        super(nome, aldeia, idade, missoes, nivel);
        this.olho_copiador = olho_copiador;
    }

    public Hatake() {
    }
}
