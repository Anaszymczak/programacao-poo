/**
 * Classe abstrata que representa um funcionário.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }



    /**
     * Exibe o nome e salário base.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }





    /**
     * Método abstrato que calcula o salário final.
     * @return salário calculado
     */
    public abstract double calcularSalario();
}
