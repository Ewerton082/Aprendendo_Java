package medio.Records;

public record NinjaRecord(String nome, String email, int numero) {

    public String emailCaixaAlta(){
        return email.toUpperCase();
    }

}
