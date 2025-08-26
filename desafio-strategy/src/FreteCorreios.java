public class FreteCorreios implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        System.out.println("Calculando frete pelos Correios...");
        return peso * 5.0; // Exemplo: R$ 5,00 por kg
    }
}