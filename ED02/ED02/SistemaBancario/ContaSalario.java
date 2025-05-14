/**
 * Representa uma conta salário. Não aplica juros.
 */
public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Conta salário não tem juros.
     */
    public void aplicarJurosDiarios() {
        // Não aplica juros
    }

    /**
     * Mostra o extrato da conta salário.
     */
    public void imprimirExtrato() {
        System.out.println("Conta Salário - Cliente: " + cliente + " | Saldo: R$" + saldo);
    }
}
