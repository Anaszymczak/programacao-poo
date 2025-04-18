class Conta {
    private String numero;
    private double saldo;

    // Construtor
    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    // Método para exibir os detalhes da conta
    public void exibir() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }
}