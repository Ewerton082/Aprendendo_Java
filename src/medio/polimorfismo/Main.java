package medio.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.aldeia = "Konoha";
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.habilidadeEspecial();


        Uzumaki Naruto = new Uzumaki();
        Naruto.aldeia = "Konoha";
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.habilidadeEspecial();

        Ninja qualquer = new Ninja();
        qualquer.aldeia = "Konoha";
        qualquer.nome = "Pica da Pica";
        qualquer.idade = 15;
        qualquer.habilidadeEspecial();

    }
}
