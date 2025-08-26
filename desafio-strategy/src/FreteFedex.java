public class FreteFedex implements CalculoFrete {
    @Override
    public double calcular(double peso) {
        System.out.println("Calculando frete pela Fedex...");
        return peso * 10.0; // Exemplo: R$ 10,00 por kg
    }
}