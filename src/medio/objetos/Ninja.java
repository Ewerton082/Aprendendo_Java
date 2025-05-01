package medio.objetos;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // metodo publico personalizado para poder acessar de qualquer logal

    // metodos voids n retornam valores
    public void Habilidade_ativada(){
        System.out.println("Habilidade preparada");
    }

    public String soltar_poder(String nome){
        return switch (nome.toLowerCase()) {
            case "naruto" -> "Toma Rasengan";
            case "sasuke" -> "Toma um Chidori";
            case "sakura" -> "Toma Curinha seu bosta";
            default -> "Habilidade especial na cara";
        };
    }

    public int tempo_para_hokage(int idade_para_ser_hokage){
        return idade_para_ser_hokage - idade;
    }
}
