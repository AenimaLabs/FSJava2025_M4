package conversorTemperatura.clases;

public class ConversorTemperatura {

    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double convertirFahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double convertirCelsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double convertirKelvinACelsius(double kelvin) {
        return kelvin - 273.15;
    }

}
