class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor padrão com valores genéricos
    public Livro() {
        this.titulo = "Título Desconhecido";
        this.autor = "Autor Desconhecido";
        this.anoPublicacao = 0;
    }

    // Construtor com parâmetros
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Método para exibir os detalhes do livro
    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println();
    }
}
