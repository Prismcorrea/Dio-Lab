// ContaCorrente.java
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, Cliente titular) {
        super(numero, titular);
        this.limite = 1000.0; // exemplo de limite da conta corrente
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor do saque deve ser positivo.");
        } else if (valor > saldo + limite) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }
}
