package medio.desafio4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    @Override
    public void mostrarinfo() {
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("habilidade = " + habilidade);
        System.out.println("especialidade = " + especialidade);
        System.out.println("usar_habilidade = " + usar_habilidade);
        System.out.println();
    }

    @Override
    public void executarhabilidade() {
        switch (habilidade){
            case GENJUTSU:
                System.out.println("Receba Meu Genjutsu avançado de " + especialidade);
                break;
            case KATON:
                System.out.println("Receba Meu Katon avançado de " + especialidade);
                break;
            case NINJUTSU:
                System.out.println("Receba Meu Ninjutsu avançado de " + especialidade);
                break;
            case RINNENGAN:
                System.out.println("Receba Meu Rinnegan avançado de " + especialidade);
                break;
        }
        System.out.println();
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }
}
