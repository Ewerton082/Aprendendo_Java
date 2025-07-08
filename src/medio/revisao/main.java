package medio.revisao;

public class main {
    public static void main(String[] args) {


        // Ninja sasuke

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Konoha", 17, 4,Niveis_De_Classe.CHOUNNIN, 3);

        sasuke.ataque_sharingan();
        sasuke.ataque();
        System.out.println(sasuke.nivel.name);

        // ninja kakashi

        Hatake kakashi = new Hatake("Kakashi Hatake","Konoha", 26, 120, Niveis_De_Classe.HOKAGE,true);


        // o kakashi pode usar habilidades das 2 arvores ja que ele implementou as 2 interfaces
        kakashi.ataque_sharingan();
        kakashi.mil_tapas();

    }
}
