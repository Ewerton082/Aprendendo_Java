package medio.generics.semusar;

import java.util.ArrayList;
import java.util.List;

public class Bolsakunai {
    private List<Kunai> kunais;

    public Bolsakunai() {
        this.kunais = new ArrayList<>();
    }

    public void adicionarKunai(Kunai kunai){
        kunais.add(kunai);
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString(){
        return "bolsa kunais: " +  kunais.toString();
    }
}
