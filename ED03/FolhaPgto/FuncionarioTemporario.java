/**
 * Classe para funcionários temporários com desconto fixo.
 */

 
public class FuncionarioTemporario extends Funcionario {

    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase - 100;
    }
}
