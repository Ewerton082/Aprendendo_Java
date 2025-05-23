package medio.abstratas;

public class Main {
    public static void main(String[] args) {

       // Classes Abstratas não podem ser instanciadas, ou seja, não criam objetos, nos obrigando a criar uma classe para herdar ela

       // Ninja Minato = new Ninja("Minato Uzumaki", "Konoha", 34, E_Hokage.YES);

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Sabe se la deus",  35, E_Hokage.NOT, true);
        itachi.Exec_habilidade();
        itachi.info();
        itachi.apresentar();

        System.out.println();

        Uzumaki Boruto = new Uzumaki("Boruto Uzumaki", "Nova Konoha", 16,E_Hokage.YES, false);
        Boruto.Exec_habilidade();
        Boruto.info();
        Boruto.apresentar();



    }
}
