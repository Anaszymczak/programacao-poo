class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor com apenas o nome
    public Produto(String nome) {
        this(nome, 0.0, 0); // Chama o outro construtor com valores padrão
    }

    // Construtor completo
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir os detalhes do produto
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
    }
}
