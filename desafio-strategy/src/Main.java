
public class Main {
    public static void main(String[] args) {
        double pesoPacote = 15.0; // 15 kg

        // Usando a estratégia dos Correios
        ServicoFrete servico1 = new ServicoFrete(new FreteCorreios());
        double custoCorreios = servico1.calcularFrete(pesoPacote);
        System.out.printf("Custo do frete (Correios) para %.2f kg: R$ %.2f\n\n", pesoPacote, custoCorreios);

        // Trocando para a estratégia da DHL em tempo de execução
        servico1.setCalculoFrete(new FreteDHL());
        double custoDHL = servico1.calcularFrete(pesoPacote);
        System.out.printf("Custo do frete (DHL) para %.2f kg: R$ %.2f\n\n", pesoPacote, custoDHL);

        // Usando a estratégia da Fedex diretamente em uma nova instância
        ServicoFrete servico2 = new ServicoFrete(new FreteFedex());
        double custoFedex = servico2.calcularFrete(pesoPacote);
        System.out.printf("Custo do frete (Fedex) para %.2f kg: R$ %.2f\n", pesoPacote, custoFedex);
    }
}