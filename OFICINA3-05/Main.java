public class Main {
    public static void main(String[] args) {
        Endereco e = new Endereco("Av. Brasil", "São Paulo");
        Cliente c = new Cliente("Juliana", e);

        c.exibir();
    }
}