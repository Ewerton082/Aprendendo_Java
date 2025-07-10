package medio.generics.semusar;

public class Main {
    public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai de fogo");
        Kunai kunai2 = new Kunai("Kunai de gelo");
        Kunai kunai3 = new Kunai("Kunai de trovao");

        Bolsakunai bolsaKunai = new Bolsakunai();
        bolsaKunai.adicionarKunai(kunai1);
        bolsaKunai.adicionarKunai(kunai2);
        bolsaKunai.adicionarKunai(kunai3);

        System.out.println(bolsaKunai);

    }
}
