package medio.generics.complexa;

import java.util.List;

// dizemos que a classe é generica aqui com o <T> ou seja pode armazenar varios tipos
public class LivroMagia<T> {

    // aqui inicializamos nossa Array
    private List<T> magias;


    // construtor no args
    public LivroMagia() {
        this.magias = new java.util.ArrayList<>();
    }

    // adicionando magias em nosso livro
    public void novaMagia(T magia){
        magias.add(magia);
    }

    //mostrando nossas magias
    public void abrirLivro(){
        for (T magia : magias){
            System.out.println(magia);
        }
    }

}
