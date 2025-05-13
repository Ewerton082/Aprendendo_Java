package medio.desafio3;

public class Uchiha extends Ninja {

    String habilidade_especial;

    @Override
    public void mostrarinformacoes(){
        System.out.println("nome do ninja = " + nome);
        System.out.println("idade atual = " + idade);
        System.out.println("habilidade especial = " + habilidade_especial);
        System.out.println("==========================");
        System.out.println("missão ativa = " + missao_atual);
        System.out.println("nivel de dificuldade = " + dificuldade);
        System.out.println("status = " + status_missao);
    }

    public String Habilidade_especial_ativar(){
        return "Receba o meu " + habilidade_especial;
    }

}
