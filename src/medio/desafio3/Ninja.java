package medio.desafio3;

public class Ninja {

    String nome;
    short idade;
    String missao_atual;
    String dificuldade;
    String status_missao;


    public void mostrarinformacoes(){
        System.out.println("nome do ninja = " + nome);
        System.out.println("idade atual = " + idade);
        System.out.println("==========================");
        System.out.println("missão ativa = " + missao_atual);
        System.out.println("nivel de dificuldade = " + dificuldade);
        System.out.println("status = " + status_missao);
    }
}
