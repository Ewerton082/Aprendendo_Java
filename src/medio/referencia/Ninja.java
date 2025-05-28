package medio.referencia;

public abstract class Ninja implements ataques {

    String nome;
    String vila;
    int idade;
    E_Hokage Hokage;

    protected Ninja(){

    }

    // Metodos abstratos funcionam tipo uma interface, eles não podem ter conteudo e a classe que herdar ele terá que implementar o conteudo
    public abstract void Exec_habilidade();

    // Mas classes abstratas também podem ter metodos universais/ padrões como esse abaixo que todas vão ter
    public void info(){
        System.out.println("nome = " + nome);
        System.out.println("vila = " + vila);
        System.out.println("idade = " + idade);
        System.out.println(Hokage.getDesc());
    }

    public void apresentar(){
        System.out.println("Prazer em conhecer você, meu nome é " + nome + " e sou de " + vila);
    }


    public Ninja(String nome, String vila, int idade, E_Hokage hokage) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
        this.Hokage = hokage;
    }

    // esse metodo o java ja cria por padrão e faz com que nossa referencia se torne um valor
    @Override
    public String toString() {
        return super.toString();
    }
}
