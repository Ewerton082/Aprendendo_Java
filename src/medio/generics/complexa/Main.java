package medio.generics.complexa;

public class Main {
    public static void main(String[] args) {

        LivroMagia<Object> tomo = new LivroMagia<>();

        tomo.novaMagia(new Destruct("Raio de Fogo", 20, Nivel.INICIANTE));
        tomo.novaMagia(new Conjure("Invocar Matilha de Lobos Infernais", 35, Nivel.MESTRE));
        tomo.abrirLivro();

    }
}
