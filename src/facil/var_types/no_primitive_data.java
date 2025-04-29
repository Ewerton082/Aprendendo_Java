package facil.var_types;

public class no_primitive_data {
    public static void main(String[] args) {
        /* Tudo que tiver aqui dentro vai ser compilado pelo java */

        /*
        * Tipos de dados não Primitivos : String, Array, Class, enum
        * Objetivo da Aula: Criar um Ninja e atribuir seus métodos
        * */

        String nome = "NaRuTo UsUmAkI";
        String upper_name = nome.toUpperCase();
        String lower_name = nome.toLowerCase();
        int lenght_name = nome.length();

        System.out.println("Texto normal: " + nome);
        System.out.println("Texto grandão: " + upper_name);
        System.out.println("Texto pequeno: " + lower_name);
        System.out.println("Tamanho do nome: " + lenght_name);
    }
}
