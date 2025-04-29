package facil.arrays;

public class garbage_array {
    public static void main(String[] args) {
        /*
        * Quando redeclaramaos a array ela perde os valores que haviamos passado
        * garbage collector : é tipo o carro de lixo que vai apagar valores na memoria que pararam de ser usados
        * */

        String[] listaninjas = new String[5];

        listaninjas[0] = "naruto";
        listaninjas[1] = "sakura";
        listaninjas[2] = "sasuke";
        listaninjas[3] = "hinata";
        listaninjas[4] = "Kakashi";

        System.out.println("Lista antiga");
        for (String listaninja : listaninjas) {
            System.out.println(listaninja);
        }

        listaninjas = new String[4];

        listaninjas[0] = "cara do veneno";
        listaninjas[1] = "cara do cachorro";
        listaninjas[2] = "hinatinha";
        listaninjas[3] = "neji o cegueta";

        System.out.println("lista atualizada");

        for(String ninja: listaninjas){
            System.out.println(ninja);
        }
    }


}
