package medio.generics.usando;

public class Main {
    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("shuriken explosiva");
        EquipamentosNinja pergaminho = new EquipamentosNinja("pergaminho do sono");

        BolsaGenerica<EquipamentosNinja> bolsagenerica = new BolsaGenerica<>();
        bolsagenerica.adicionarEquipamentos(kunai);
        bolsagenerica.adicionarEquipamentos(shuriken);
        bolsagenerica.adicionarEquipamentos(pergaminho);
        System.out.println(bolsagenerica);

    }
}
