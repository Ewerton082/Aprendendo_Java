package medio.generics.usando;

import java.util.ArrayList;
import java.util.List;

// para transformar a classe em generica só precisa por <> e algum texto dentro
// normalmente se usa o T por convenção T de type
public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString(){
        return "Bolsa de Equipamentos : " + equipamentos.toString();
    }
}
