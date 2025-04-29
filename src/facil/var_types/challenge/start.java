package facil.var_types.challenge;

public class start {
    public static void main(String[] args) throws InterruptedException{

        /* Ninja 1 */
        Ninjas naruto = new Ninjas();
        naruto.nome = "naruto";
        naruto.idade = 14;
        naruto.missao = "Comer 100 Laméns";
        naruto.dificuldade = 'S';

        System.out.println("Meu nome é " + naruto.nome + " e farei minha missão agora :D");
        Thread.sleep(1000);
        naruto.validar_missao();

        /* Ninja 2 */
        Ninjas sakura = new Ninjas();
        sakura.nome = "sakura";
        sakura.idade = 28;
        sakura.missao = "Atravessar a pista";
        sakura.dificuldade = 'D';

        System.out.println("Meu nome é " + sakura.nome + " e farei minha missão agora :D");
        Thread.sleep(1000);
        sakura.validar_missao();

        /* Ninja 3 */
        Ninjas sasuke = new Ninjas();
        sasuke.nome = "sasuke";
        sasuke.idade = 16;
        sasuke.missao = "Matar 10 Hokages Juntos";
        sasuke.dificuldade = 'A';

        System.out.println("Meu nome é " + sasuke.nome + " e farei minha missão agora :D");
        Thread.sleep(1000);
        sasuke.validar_missao();
    }
}
