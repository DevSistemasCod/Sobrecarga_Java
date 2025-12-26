public class ConversorTemperatura {

    // Converte Celsius para Fahrenheit
    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converte Fahrenheit para Celsius
    public double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Converte Celsius para Kelvin
    public double converterParaKelvin(double celsius) {
        return celsius + 273.15;
    }
}