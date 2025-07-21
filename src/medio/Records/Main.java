package medio.Records;


// oque são records: em resumo ele facilita a produtividade ja que armazena varios dados como setters e getters

public class Main {
    public static void main(String[] args) {

        Ninja Cadastro = new Ninja("Narutinho", "narutodelas@gmail.com", 988776644);
        System.out.println(Cadastro);
        System.out.println("Nome do cadastro " + Cadastro.getNome());

        NinjaRecord CadastroRecord = new NinjaRecord("Sasuke", "Sasuke@gmail.com", 55667788);
        System.out.println(CadastroRecord);
        System.out.println(CadastroRecord.ta_caps());

        // aqui por exemplo n precisei usar o getter
        System.out.println("Nome do cadastro " + CadastroRecord.nome());

    }
}
