/**
 * Classe principal para representar uma conta bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da conta.
     * @param cliente Nome do cliente.
     * @param saldo Saldo inicial da conta.
     */
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    /**
     * Adiciona dinheiro na conta.
     * @param valor Valor a ser depositado.
     */
    public void depositar(double valor) {
        saldo += valor;
    }

    /**
     * Tira dinheiro da conta se tiver saldo.
     * @param valor Valor a ser sacado.
     */
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    /**
     * Transfere dinheiro para outra conta.
     * @param destino Conta que vai receber o valor.
     * @param valor Valor a ser transferido.
     */
    public void transferir(Conta destino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        }
    }

    /**
     * Mostra o saldo da conta.
     * @return Saldo atual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta. Cada tipo de conta tem o seu jeito.
     */
    public abstract void imprimirExtrato();

    /**
     * Aplica juros diários. Cada tipo de conta tem sua regra.
     */
    public abstract void aplicarJurosDiarios();
}
