/**
 * Guerreiro é forte no ataque e defende melhor.
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome);
        this.ataqueBase = 15; // Ataque mais forte
    }

    /**
     * Recebe menos dano (metade).
     */
    public void defender(int dano) {
        int reduzido = dano / 2;
        hp -= reduzido;
        if (hp < 0) hp = 0;
        System.out.println(nome + " defendeu e levou só " + reduzido + " de dano.");
    }

    /**
     * Golpe especial: ataca duas vezes.
     */
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo!");
        System.out.println("Dano total: " + (ataqueBase * 2));
    }
}
