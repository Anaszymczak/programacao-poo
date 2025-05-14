/**
 * Teste do jogo de RPG.
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);           // Guerreiro ataca o mago
        m.usarHabilidadeEspecial();  // Mago usa magia
        a.usarHabilidadeEspecial();  // Arqueiro atira flechas

        g.status();
        m.status();
        a.status();
    }
}
