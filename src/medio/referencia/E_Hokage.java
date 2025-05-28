package medio.referencia;

public enum E_Hokage {
    // Pelo que entendi é ENUN é parecido com uma lista de constante, mas com o principal diferencial de que elas podem ter metodos
    YES("Eu SOu sim um Hokage"),
    NOT("Infelizmente ainda não sou Hokage");

    private final String desc;

    E_Hokage(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
