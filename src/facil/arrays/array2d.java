package facil.arrays;

public class array2d {
    public static void main(String[] args) {
        /*
         * Array Multidimensional, ou seja, um array que com tem 1 array dentro
         * objetivo: Criar 5 aldeias e cada uma com alguns ninjas
         * */

        String[][] lista_das_vilas = new String[3][4];

        lista_das_vilas[0][0] = "Aldeia da Folha";
        lista_das_vilas[0][1] = "Naruto";
        lista_das_vilas[0][2] = "Sasuke";
        lista_das_vilas[0][3] = "Sakura";

        lista_das_vilas[1][0] = "Nevoa";
        lista_das_vilas[1][1] = "Zabuza";
        lista_das_vilas[1][2] = "Haku";

        lista_das_vilas[2][0] = "Areia";
        lista_das_vilas[2][1] = "Gaara";
        lista_das_vilas[2][2] = "Temari";
        lista_das_vilas[2][3] = "cara dos boneco";

        for (String[] ninja : lista_das_vilas) {
            System.out.print(ninja[0]);
            System.out.print(" | " + ninja[1]);
            System.out.print(" | " + ninja[2]);
            System.out.print(" | " + ninja[3]);
            System.out.println();
        }

    }

}

