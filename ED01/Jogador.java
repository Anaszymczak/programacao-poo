
public class Jogador {
    private String nome;
    private int tentativas;
    private int pontuacao;

    /**
     * @param nome O nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /** 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return 
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     * @param tentativas 
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * @return 
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao 
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }


    public void incrementarTentativas() {
        this.tentativas++;
    }

    /**
     * @param valor 
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }
}