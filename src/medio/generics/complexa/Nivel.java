package medio.generics.complexa;

public enum Nivel {
    INICIANTE("Iniciante"),
    INTERMEDIARIO("Intermediario"),
    MESTRE("Mestre");

    private final String nivel;

    public String getNivel() {
        return nivel;
    }

    Nivel(String nivel) {
        this.nivel = nivel;
    }
}
