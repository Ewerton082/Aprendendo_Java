package facil.var_types;

public class primitive_data {
    public static void main(String[] args) {
        /*
        *  Tipos Primitivos: int, float, double, char, boolean, byte, short, long
        * Objetivo Criar um Ninja
        * */

        int idade = 21; /* Valor maximo : 2,147,483,647 */
        double altura = 1.68;
        char primeira_letra = 'E';
        boolean vivo_ou_morto = true;
        Long dinheiro_banco = 900000000000000L; /* Valor maximo 9,223,372,036,854,807  Tem que Ter o L no fim */

        System.out.print("Meu caractere inicial é " + primeira_letra + " | "); /* Print que termina na msm linha */
        System.out.println("Minha idade é " + idade); /*comnaod para o print sout e esse comando printa e pula para proxima linha*/
        System.out.println("Eu tenho " + altura + " Cm de Altura");
        System.out.println("dinheiro_banco = " + dinheiro_banco);
        System.out.println("vivo_ou_morto = " + vivo_ou_morto);
    }
}
