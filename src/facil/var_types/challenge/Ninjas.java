package facil.var_types.challenge;

public class Ninjas {
    String nome;
    byte idade;
    String missao;
    char dificuldade;
    String concluido;

    void show_card(){
        String borda = "=".repeat(30);

        System.out.println(borda);
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("missao = " + missao);
        System.out.println("dificuldade = " + dificuldade);
        System.out.println("concluido = " + concluido);
        System.out.println(borda);
        System.out.println();
    }

    void validar_missao(){
        if (idade >= 15){
            if (nome.equals("sakura")){
                System.out.println("Tu é uma fracassada desiste da vida pô");
                concluido = "Falhou";
            }else {
                System.out.println("Meus Parabêns você completou a missão");
                concluido = "Completou a missão";
            }
        } else{
            if (nome.equals("sakura")){
                System.out.println("Tu é uma fracassada desiste da vida pô");
                concluido = "Falhou";
            } else if (dificuldade == 'C' || dificuldade == 'D'){
                System.out.println("Meus Parabêns você completou a missão");
                concluido = "Completou a Missão";
            }else {
                System.out.println("Treine mais e quando for mais velho você consegue");
                concluido = "Falhou";
            }

        }
        show_card();
    }
}
