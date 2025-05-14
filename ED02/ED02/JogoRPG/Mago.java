/**
 * Mago tem ataque mágico forte mas pouca defesa.
 */
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome);
        this.ataqueBase = 20; // Ataque mágico alto
    }

    /**
     * Defesa fraca, recebe tudo.
     */
    public void defender(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
        System.out.println(nome + " não tem muita defesa. Levou " + dano + " de dano.");
    }

    /**
     * Bola de fogo: ataque em área (simulado com print).
     */
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lançou Bola de Fogo! Causa dano em vários inimigos.");
    }
}
