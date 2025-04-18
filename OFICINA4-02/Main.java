public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        l1.exibir();
        l2.exibir();
    }
}