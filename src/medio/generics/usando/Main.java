package medio.generics.usando;

public class Main {
    public static void main(String[] args) {

        kunai kunai = new kunai("Kunai de Ferro", "Fogareu");
        shuriken shuriken = new shuriken("shuriken explosiva", "Chacabum");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho do sono");

        BolsaGenerica<Object> bolsagenerica = new BolsaGenerica<>();
        bolsagenerica.adicionarEquipamentos(kunai);
        bolsagenerica.adicionarEquipamentos(shuriken);
        bolsagenerica.adicionarEquipamentos(pergaminho);
        System.out.println(bolsagenerica);

    }
}
