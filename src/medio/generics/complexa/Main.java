package medio.generics.complexa;

public class Main {
    public static void main(String[] args) {

        LivroMagia<Object> tomo = new LivroMagia<>();

        tomo.novaMagia(new Destruct("Raio de Fogo", 20, Nivel.INICIANTE));
        tomo.novaMagia(new Conjure("Invocar Matilha de Lobos Infernais", 35, Nivel.MESTRE));
        tomo.novaMagia(new Restauration("Expulsar Mortos Vivos", 35, Nivel.INTERMEDIARIO, "Cria um domo ao redor de voce que expulsa os mortos vivos ao redor"));
        tomo.abrirLivro();

    }
}
