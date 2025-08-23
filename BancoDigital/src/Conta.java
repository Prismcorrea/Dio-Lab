// Conta.java
public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente titular;

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    // Método abstrato para saque (cada conta pode ter regras diferentes)
    public abstract void sacar(double valor);

    // Depósito comum
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor do depósito deve ser positivo.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    // Transferência entre contas
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de R$" + valor + " para " + destino.getTitular().getNome() + " realizada.");
    }
}
