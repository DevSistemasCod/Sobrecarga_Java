public class MainConversor {
 public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        double celsius = 25;
        double fahrenheit = 77;

        // Testando Celsius para Fahrenheit
        double converteParaF = conversor.converter(celsius);
        System.out.println(celsius + "°C = " + converteParaF + "°F");

        // Testando Fahrenheit para Celsius
        double converteParaC = conversor.converterFahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + converteParaC + "°C");

        // Testando Celsius para Kelvin
        double converteParaK = conversor.converterParaKelvin(celsius);
        System.out.println(celsius + "°C = " + converteParaK + "K");
    }
}