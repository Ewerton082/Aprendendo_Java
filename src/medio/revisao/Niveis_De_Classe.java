package medio.revisao;

public enum Niveis_De_Classe {
    GENNIN("gennin", 1),
    CHOUNNIN("chounnin", 2),
    JOUNNIN("jounnin", 3),
    HOKAGE("hokage", 4);

    final String name;
    final int nivel_ninja;

    Niveis_De_Classe(String name, int nivel_ninja) {
        this.name = name;
        this.nivel_ninja = nivel_ninja;
    }

    // Enuns São para guardar listas de constantes em resumo mas podemos botar alguns atributos dentro dela
}
