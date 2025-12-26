 public class ConversorMain {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();

        double valorDolar = 100;
        double valorEuro = 50;
        double taxaEuro = 5.5;
        double valorLibra = 30;
        double taxaLibra = 6.2;

        // Dólar para Real
        double dolarParaReal = conversor.converter(valorDolar);
        System.out.println(valorDolar + " USD = " + dolarParaReal + " BRL");

        // Euro para Real
        double euroParaReal = conversor.converter(valorEuro, taxaEuro);
        System.out.println(valorEuro + " EUR = " + euroParaReal + " BRL");

        // Libra para Real
        double libraParaReal = conversor.converter(valorLibra, taxaLibra, true);
        System.out.println(valorLibra + " GBP = " + libraParaReal + " BRL");
    }
 }