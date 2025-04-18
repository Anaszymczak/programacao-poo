import java.util.Random;


public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    /**
     * @param jogador 
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        
        
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    /**
     * @param tentativa 
     * @return 
     */
    public String jogar(int tentativa) {
        jogador.incrementarTentativas();
        
        if (tentativa < numeroSecreto) {
            return "O número secreto é MAIOR.";
        } else if (tentativa > numeroSecreto) {
            return "O número secreto é MENOR.";
        } else {
            int pontos = calcularPontuacao();
            jogador.atualizarPontuacao(pontos);
            return "PARABÉNS! Você ACERTOU o número secreto " + numeroSecreto + "!\n" +
                   "Você fez " + pontos + " pontos nesta rodada.";
        }
    }
    
    /** 
     * @return 
     */
    private int calcularPontuacao() {
        // Cálculo de pontuação: quanto menos tentativas, mais pontos
        int pontos = 100 - jogador.getTentativas() * 10;
        // Garantir que a pontuação não seja negativa
        return Math.max(10, pontos);
    }
    
    /**
     * @return 
     */
    public int getNumeroSecreto() {
        return numeroSecreto;
    }
}