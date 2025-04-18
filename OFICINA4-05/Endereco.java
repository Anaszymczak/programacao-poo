class Endereco {
    private String rua;
    private String cidade;

    // Construtor
    public Endereco(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    // Método para exibir o endereço
    public void exibir() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
    }
}
