public class FreteDHL implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        System.out.println("Calculando frete pela DHL...");
        return peso * 8.5; // Exemplo: R$ 8,50 por kg
    }
}