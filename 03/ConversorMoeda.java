public class ConversorMoeda {

    // Converte Dólar para Real (taxa fixa)
    public double converter(double valorDolar) {
        double taxaDolar = 5.0; // Exemplo de taxa 
        return valorDolar * taxaDolar;
    }

    // Converte Euro para Real usando taxa fornecida
    public double converter(double valorEuro, double taxaEuro) {
        return valorEuro * taxaEuro;
    }

    // Converte Libra para Real usando taxa fornecida
    public double converter(double valorLibra, double taxaLibra, boolean isLibra) {
        return valorLibra * taxaLibra;
    }
}