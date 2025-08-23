// ContaPoupanca.java
public class ContaPoupanca extends Conta {
    private double rendimentoMensal = 0.01; // 1% de exemplo

    public ContaPoupanca(String numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: valor do saque deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    // Método adicional para aplicar rendimento
    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
        System.out.println("Rendimento aplicado. Saldo atualizado: R$" + saldo);
    }
}
