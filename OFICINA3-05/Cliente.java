class Cliente {
    private String nome;
    private Endereco endereco;

    // Construtor
    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método para exibir os detalhes do cliente
    public void exibir() {
        System.out.println("Nome: " + nome);
        endereco.exibir();
        System.out.println();
    }
}
