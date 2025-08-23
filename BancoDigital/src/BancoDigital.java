
public class BancoDigital {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva");
        Cliente cliente2 = new Cliente("Maria Souza");

        // Criando contas
        Conta conta1 = new ContaCorrente("123", cliente1);
        Conta conta2 = new ContaPoupanca("456", cliente2);

        // Operações
        conta1.depositar(500);
        conta2.depositar(1000);

        conta1.sacar(200);
        conta2.sacar(150);

        conta1.transferir(100, conta2);

        // Aplicar rendimento na poupança
        if (conta2 instanceof ContaPoupanca) {
            ((ContaPoupanca) conta2).aplicarRendimento();
        }

        // Exibir saldos finais
        System.out.println("Saldo final conta corrente: R$" + conta1.getSaldo());
        System.out.println("Saldo final conta poupança: R$" + conta2.getSaldo());
    }
}    