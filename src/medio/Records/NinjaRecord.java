package medio.Records;

// só em usar isso acaba todoo trabalho de criar construtor e getter ou setters
public record NinjaRecord(String nome, String email, int telefone) {

    // todos atributos são final entoa cuidado onde usar

    // para acessar os dados dele não precisa usar o getter

    public String ta_caps(){
        return email.toUpperCase();
    }
}
