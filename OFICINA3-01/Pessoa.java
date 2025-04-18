public class Pessoa {
    private String nome;
    private int idade;
 
    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
 
    // Método para exibir os dados
    public void exibir() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}