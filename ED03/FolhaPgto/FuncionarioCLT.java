/**
 * Classe para funcionários CLT com adicional.
 */

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase + 300;
    }
}
