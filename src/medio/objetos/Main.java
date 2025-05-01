package medio.objetos;

public class Main {
    public static void main(String[] args) {
        // Agora o pau vai torar

        
        // Criar naruto usando o molde da NOSSA CLASSE Ninjas
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Konoha";

        int hokage = Naruto.tempo_para_hokage(70);
        System.out.println("Faltam " + hokage + " anos para se tornar um hokage");

        // Criando o Sasuke, Lembrando que ele é sempre um objeto
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "sasuke";
        Sasuke.idade = 15;
        Sasuke.aldeia = "renegado";

        Sasuke.Habilidade_ativada();
        String podersin = Sasuke.soltar_poder(Sasuke.nome);
        System.out.println(podersin);

        
        // Criando a Sakura - Tudo é um OBJETO
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 16;
        Sakura.aldeia = "Konoha";

    }
}
