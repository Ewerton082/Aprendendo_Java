package medio.desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    TipoHabilidade habilidade;
    String usar_habilidade;

    @Override
    public void mostrarinfo() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
        System.out.println("usar_habilidade = " + usar_habilidade);
        System.out.println();


    }

    @Override
    public void executarhabilidade() {
        switch (habilidade){
            case GENJUTSU:
                System.out.println("Receba Meu Genjutsu Básico");
                break;
            case KATON:
                System.out.println("Receba Meu Katon Básico");
                break;
            case NINJUTSU:
                System.out.println("Receba Meu Ninjustu Básico");
                break;
            case RINNENGAN:
                System.out.println("Receba Meu Rinnegan Básico");
                break;
        }
        System.out.println();
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.usar_habilidade = habilidade.getHabilidade();
    }
}
