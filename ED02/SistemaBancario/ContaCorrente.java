/**
 * Representa uma conta corrente. Aplica 0.1% de juros por dia.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica 0.1% de juros no saldo.
     */
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }

    /**
     * Mostra o extrato da conta corrente.
     */
    public void imprimirExtrato() {
        System.out.println("Conta Corrente - Cliente: " + cliente + " | Saldo: R$" + saldo);
    }
}
