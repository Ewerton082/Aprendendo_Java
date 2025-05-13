package medio.desafio3;

import facil.var_types.challenge.Ninjas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opt = new Scanner(System.in);
        ArrayList<Ninja> NinjaGroup = new ArrayList<>();

        do {
            System.out.println("=================================");
            System.out.println(" 1º > Listar todos ninjas");
            System.out.println(" 2º > Adicionar Novo Ninja");
            System.out.println(" 3º > Detalhar Ninja especifico");
            System.out.println(" 0º > Finalizar programa");
            System.out.println("=================================");
            System.out.print("Opção: ");
            short escolha = opt.nextShort();

            switch (escolha){
                case 1:
                    for (Ninja ninjas : NinjaGroup) {
                        System.out.println(NinjaGroup.indexOf(ninjas) + " > " + ninjas.nome);

                    }
                    break;
                case 2:

                    System.out.print("Deseja Criar Um Ninja comum [1] ou um Uchiha [2]? ");
                    escolha = opt.nextShort();
                    opt.nextLine();

                    Ninja personagem;

                    if (escolha == 2){
                        Uchiha ninja_uchiha = new Uchiha();
                        System.out.print("Qual a Habilidade especial dele? ");
                        ninja_uchiha.habilidade_especial = opt.nextLine();
                        personagem = ninja_uchiha;
                    } else if (escolha == 1) {
                        personagem = new Ninja();
                    }else {
                        personagem = new Ninja();
                    }

                    System.out.print("Qual o Nome do seu ninja? ");
                    personagem.nome = opt.nextLine();

                    System.out.print("Qual A idade dele? ");
                    personagem.idade = opt.nextShort();
                    opt.nextLine();

                    System.out.print("Missão atual: ");
                    personagem.missao_atual = opt.nextLine();

                    System.out.print("Qual a dificuldade: ");
                    personagem.dificuldade = opt.nextLine();

                    System.out.print("Status da missão: ");
                    personagem.status_missao = opt.nextLine();

                    NinjaGroup.add(personagem);
                    break;
                case 3:
                    System.out.println("Escolha a posição do ninja dada na listagem [1º opção]");
                    System.out.print("Numº Ninja: ");
                    escolha = opt.nextShort();
                    System.out.println("=================================");
                    Ninja personagem_choice = NinjaGroup.get(escolha);
                    personagem_choice.mostrarinformacoes();
                    if (personagem_choice instanceof Uchiha){
                        System.out.println(((Uchiha) personagem_choice).Habilidade_especial_ativar());
                    }
                    break;
                case 0:
                    System.out.println("Finalizando Programa... :(");
                    System.exit(0);
            }
        }while (true);


    }
}
