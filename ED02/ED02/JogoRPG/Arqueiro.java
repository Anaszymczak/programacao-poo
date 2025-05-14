/**
 * Arqueiro ataca com chance de crítico.
 */
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome);
        this.ataqueBase = 12;
    }

    /**
     * Defesa normal.
     */
    public void defender(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
        System.out.println(nome + " recebeu " + dano + " de dano.");
    }

    /**
     * Chuva de flechas: 3 ataques de uma vez.
     */
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Chuva de Flechas! Atacou 3 vezes.");
    }
}
