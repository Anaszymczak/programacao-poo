/**
 * Classe base para todos os personagens do jogo.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    /**
     * Cria um personagem.
     * @param nome Nome do personagem.
     */
    public Personagem(String nome) {
        this.nome = nome;
        this.hp = 100; // Vida começa com 100
        this.ataqueBase = 10; // Ataque padrão
    }

    /**
     * Ataca um inimigo. Tira vida dele.
     * @param inimigo Quem vai receber o ataque.
     */
    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
        System.out.println(nome + " atacou " + inimigo.nome + " com " + ataqueBase + " de dano.");
    }

    /**
     * Recebe um ataque e perde vida.
     * @param dano Quanto de dano vai levar.
     */
    public void defender(int dano) {
        hp -= dano;
        if (hp < 0) hp = 0;
    }

    /**
     * Usa uma habilidade especial. Muda de acordo com o tipo.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Mostra o status do personagem.
     */
    public void status() {
        System.out.println(nome + " | HP: " + hp);
    }
}
