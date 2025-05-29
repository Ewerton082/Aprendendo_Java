package medio.desafio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner seletor = new Scanner(System.in);
        byte escolha;
        String usuario;
        String password;
        double valor;
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (true){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("[1] Criar nova conta\n" + "[2] Acessar Conta\n" + "[0] Encerrar o Programa");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("OPÇÃO: ");
            escolha = seletor.nextByte();
            seletor.nextLine();

            switch (escolha){
                case 1:
                    while (true) {
                        System.out.println("    Qual o tipo da conta?");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.println("[1] Poupança \n" + "[2] Corrente \n" + "[0] Cancelar");
                        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        System.out.print("OPÇÃO: ");
                        escolha = seletor.nextByte();
                        seletor.nextLine();
                        switch (escolha){
                            case 1:
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("Usuário: ");
                                usuario = seletor.nextLine();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("Senha: ");
                                password = seletor.nextLine();

                                System.out.println("    Deseja Depositar Agora");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.println("[1] Sim \n" + "[2] Não");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("OPÇÃO: ");
                                escolha = seletor.nextByte();
                                seletor.nextLine();
                                switch (escolha){
                                    case 1:
                                        System.out.println("Qual O valor que você deseja depositar?");
                                        System.out.print("Valor: R$ ");
                                        valor = seletor.nextDouble();
                                        System.out.println("Criando Conta...");
                                        contas.add(new Poupanca(usuario,password,valor));
                                        break;
                                    case 2:
                                        System.out.println("Criando Conta ...");
                                        contas.add(new Poupanca(usuario, password));
                                        break;
                                    default:
                                        System.out.println("Criando Conta ...");
                                        contas.add(new Poupanca(usuario, password));
                                }
                                escolha = 0;
                                break;

                            case 2:
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("Usuário: ");
                                usuario = seletor.nextLine();
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("Senha: ");
                                password = seletor.nextLine();

                                System.out.println("    Deseja Depositar Agora");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.println("[1] Sim \n" + "[2] Não");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.print("OPÇÃO: ");
                                escolha = seletor.nextByte();
                                seletor.nextLine();
                                switch (escolha){
                                    case 1:
                                        System.out.println("Qual O valor que você deseja depositar?");
                                        System.out.print("Valor: R$ ");
                                        valor = seletor.nextDouble();
                                        System.out.println("Criando Conta...");
                                        contas.add(new Corrente(usuario,password,valor));
                                        break;
                                    case 2:
                                        System.out.println("Criando Conta ...");
                                        contas.add(new Corrente(usuario, password));
                                        break;
                                    default:
                                        System.out.println("Criando Conta ...");
                                        contas.add(new Corrente(usuario, password));
                                }
                                escolha = 0;
                                break;

                            case 0:
                                System.out.println("Saindo da criação...");
                                break;

                            default:
                                System.out.println("Escolha uma opção valida");
                        }

                        if (escolha == 0){
                            break;
                        }
                    }
                    break;

                case 2:
                    if (contas.isEmpty()){
                        System.out.println("Não há nenhuma conta cadastrada");
                    }else {
                        while (true) {
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            System.out.println("    Listando Contas");
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            short index = 1;
                            for (ContaBancaria accounts : contas) {
                                System.out.println(index + " -> " + accounts);
                                index++;
                            }
                            System.out.println("0 -> Sair da sessão");
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            System.out.print("OPÇÃO: ");
                            escolha = seletor.nextByte();
                            seletor.nextLine();
                            if (escolha == 0 ){
                                break;
                            }
                            if (escolha <= contas.size()){
                                ContaBancaria conta_selecionada = contas.get(escolha - 1);
                                while (true){
                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                    System.out.println("Qual a senha da sua conta " + conta_selecionada.Usuario + "?");
                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                    password = seletor.nextLine();
                                    if (conta_selecionada.validar(password)){
                                        while (true){

                                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                            System.out.println("    Menu da conta");
                                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                            System.out.println("[1] Informações\n" + "[2] Saldo\n" + "[3] Sacar\n" + "[4] Depositar\n" + "[0] Sair da conta");
                                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                            System.out.print("OPÇÃO: ");
                                            escolha = seletor.nextByte();

                                            switch (escolha){
                                                case 1:
                                                    conta_selecionada.informacoesConta();
                                                    break;

                                                case 2:
                                                    conta_selecionada.consultar_saldo(password);
                                                    break;

                                                case 3:
                                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                                    System.out.println("Quanto deseja sacar? você tem " + String.format("%.2f" ,conta_selecionada.Saldo_bancario));
                                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                                    System.out.print("Valor? R$ ");
                                                    valor = seletor.nextDouble();
                                                    seletor.nextLine();
                                                    conta_selecionada.saque(valor, password);
                                                    break;

                                                case 4:
                                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                                    System.out.println("Quanto deseja Depositar");
                                                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                                    System.out.print("Valor? R$ ");
                                                    valor = seletor.nextDouble();
                                                    conta_selecionada.depositar(valor, password);
                                                    break;

                                                case 0:
                                                    System.out.println("Saindo da conta...");
                                                    break;

                                                default:
                                                    System.out.println("Digite uma opçaõ valida");

                                            }

                                            if (escolha == 0){
                                                break;
                                            }
                                        }
                                        break;
                                    } else {
                                        System.out.println("As Senhas não conferem, deseja tentar novamente?");
                                        System.out.println("[1] Sim \n" + "[2] Não");
                                        System.out.print("OPÇÃO: ");
                                        escolha = seletor.nextByte();
                                        seletor.nextLine();
                                        if (escolha == 2){
                                            break;
                                        }
                                    }
                                }
                            }
                        }

                    }
                    break;
                case 0:
                    System.out.println("Encerrando o Programa...");
                    System.exit(0);
                default:
                    System.out.println("Faça uma escolha valida\n");
            }

        }
    }
}
