package medio.desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaBasico Ewerton = new NinjaBasico("Ewerton", 22, TipoHabilidade.NINJUTSU);
        Ewerton.mostrarinfo();
        Ewerton.executarhabilidade();

        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 18, TipoHabilidade.GENJUTSU, "Fogo");
        Sasuke.mostrarinfo();
        Sasuke.executarhabilidade();

        NinjaAvancado Capeta = new NinjaAvancado("Capeta SIlveira", 666, TipoHabilidade.TAIJUTSU, "Infernal");
        Capeta.mostrarinfo();
    }
}
