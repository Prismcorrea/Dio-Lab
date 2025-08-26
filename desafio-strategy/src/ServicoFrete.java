// src/ServicoFrete.java
public class ServicoFrete {
    private CalculoFrete calculoFrete;

    public ServicoFrete(CalculoFrete calculoFrete) {
        this.calculoFrete = calculoFrete;
    }

    public void setCalculoFrete(CalculoFrete calculoFrete) {
        this.calculoFrete = calculoFrete;
    }

    public double calcularFrete(double peso) {
        return calculoFrete.calcular(peso);
    }
}