package medio.objetos;

public class Ninja {

    String nome;
    int idade;
    String aldeia;

    // metodo publico personalizado para poder acessar de qualquer local

    public int tempo_para_hokage(int idade_para_ser_hokage){
        return idade_para_ser_hokage - idade;
    }

    public void habilidade_especial(){
        System.out.println("receba minha habilidade");
    }

}

