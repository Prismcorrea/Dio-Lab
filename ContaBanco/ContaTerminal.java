import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Garante ponto como separador decimal no format
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consome quebra de linha pendente

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine(); // permite formato 067-8

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        // Aceita vírgula ou ponto e valida
        String saldoEntrada = scanner.nextLine().trim().replace(",", ".");
        double saldo;
        try {
            saldo = Double.parseDouble(saldoEntrada);
        } catch (NumberFormatException e) {
            System.out.println("Valor de saldo inválido. Use números, ex: 237.48");
            scanner.close();
            return;
        }

        String saldoFormatado = String.format(Locale.US, "%.2f", saldo);

        // Mensagem final exatamente no formato pedido
        String mensagem =
            "Olá " + nomeCliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
            ", conta " + numero +
            " e seu saldo " + saldoFormatado + " já está disponível para saque";

        System.out.println();
        System.out.println(mensagem);

        scanner.close();
    }

    @Override
    public String toString() {
        return "ContaTerminal []";
    }
}

