/**
 * Representa uma conta poupança. Aplica 0.08% de juros por dia.
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldo) {
        super(cliente, saldo);
    }

    /**
     * Aplica 0.08% de juros no saldo.
     */
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }

    /**
     * Mostra o extrato da conta poupança.
     */
    public void imprimirExtrato() {
        System.out.println("Conta Poupança - Cliente: " + cliente + " | Saldo: R$" + saldo);
    }
}
