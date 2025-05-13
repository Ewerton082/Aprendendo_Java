package medio.objetos;

public class Main {
    public static void main(String[] args) {
        // Agora o pau vai torar

        
        // Criar naruto usando o molde da NOSSA CLASSE Ninjas
        uzumaki Naruto = new uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Konoha";
        Naruto.receptaculo = false;

        Naruto.habilidade_especial();


        // Criando o Sasuke, Lembrando que ele é sempre um objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "sasuke";
        Sasuke.idade = 15;
        Sasuke.aldeia = "renegado";

        System.out.println("Falta esse tempo: " + Sasuke.tempo_para_hokage(Sasuke.idade) + " anos para o " + Sasuke.nome + "se tornar hokage");
        Sasuke.habilidade_especial();
        System.out.println();

        
        // Criando a Sakura - Tudo é um OBJETO
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 16;
        Sakura.aldeia = "Konoha";

        Sakura.habilidade_especial();

        // Criando a Hinata para fazer o filho deles Boruto
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 18;

        Hinata.byakuganAtivado();
        Hinata.habilidade_especial();

        // Criando o boruto implementando interface
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.idade = 16;
        boruto.aldeia = "Nova Konoha";
        boruto.receptaculo = true;
        System.out.println();
        boruto.CloneDasSombras();
        boruto.AtivarOKarma();
        boruto.habilidade_especial();
        System.out.println("Tempo para Hokage: " + boruto.tempo_para_hokage(55));
    }
}
