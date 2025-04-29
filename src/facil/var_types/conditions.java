package facil.var_types;

public class conditions {
    public static void main(String[] args) {

        /*
        * Estudando sobre If e Else e elseif
        * Objetivo: Se tornar Hokage comletando missões
        * */

        String name = "Naruto Uzumaki";
        int age = 16;
        boolean hokage = false;
        short completed_missions = 666;
        short level;

        /* Portugol : Se (Condição) {Faça isso} */

        if (completed_missions <= 15 && age >= 15){
            level = 1;
            System.out.println("Completamos missões suficientes agora o " + name + " é Nivel " + level);
        } else if (completed_missions <= 25 && age >= 20){
            level = 2;
            System.out.println("carai, completou muita coisa mane agora o " + name + " é Nivel" + level);
        } else if (completed_missions == 666) {
            level = 666;
            hokage = true;
            System.out.println("hokage = " + hokage);
            System.out.println("Capeta encarnou no seu coro puta que pariu sobre logo pro level do capeta, o Seu nivel é " + level);
        } else {
            System.out.println("Ainda não completou as missões minimas seu nivel é ");
        }
    }
}
