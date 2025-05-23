package medio.herancamultipla;

public class Main {
    public static void main(String[] args) {

        // kakashi
        Hatake kakashi = new Hatake("Kakashi Hatake", 32, "Konoha");
        kakashi.apresentar();
        kakashi.bemvindoAnbu();
        kakashi.info();

        Hatake toninho = new Hatake(ranks.JOUNNIN,"Konoha", 55,34,"Toninho madara",false);

        toninho.apresentar();
        toninho.info();

    }
}
