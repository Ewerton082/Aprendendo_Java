package medio.desafio4;

public enum TipoHabilidade {
    TAIJUTSU("Ninja de Taijustsu"),
    NINJUTSU("Ninja de Ninjutsu"),
    GENJUTSU("Ninja de Genjustu"),
    KATON("Ninja de Katon"),
    RINNENGAN("Ninja de Rinnegan");

    private final String descricao;

    TipoHabilidade(String descricao){
        this.descricao = descricao;
    }

    public String getHabilidade(){
        return descricao;
    }


}
