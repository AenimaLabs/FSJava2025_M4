package conversorTemperatura;

import conversorTemperatura.clases.ConversorTemperatura;

import java.util.Scanner;

public class AppConversorTemperatura {

    public static void main(String[] args) {

        //bucle para repetir el proceso hasta que el usuario decida salir
        while (true) {

            //menú para convertir temperatura
            System.out.println("Conversor de temperatura");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Celsius a Kelvin");
            System.out.println("4. Kelvin a Celsius");
            System.out.println("5. Salir");


            Scanner scanner = new Scanner(System.in);
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la temperatura en Celsius: ");
                    double celsius = Double.parseDouble(scanner.nextLine());
                    double fahrenheit = ConversorTemperatura.convertirCelsiusAFahrenheit(celsius);
                    System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                    break;

                case 2:
                    System.out.println("Introduce la temperatura en Fahrenheit: ");
                    double fahrenheit2 = Double.parseDouble(scanner.nextLine());
                    double celsius2 = ConversorTemperatura.convertirFahrenheitACelsius(fahrenheit2);
                    System.out.println("La temperatura en Celsius es: " + celsius2);
                    break;

                case 3:
                    System.out.println("Introduce la temperatura en Celsius: ");
                    double celsius3 = Double.parseDouble(scanner.nextLine());
                    double kelvin = ConversorTemperatura.convertirCelsiusAKelvin(celsius3);
                    System.out.println("La temperatura en Kelvin es: " + kelvin);
                    break;

                case 4:
                    System.out.println("Introduce la temperatura en Kelvin: ");
                    double kelvin2 = Double.parseDouble(scanner.nextLine());
                    double celsius4 = ConversorTemperatura.convertirKelvinACelsius(kelvin2);
                    System.out.println("La temperatura en Celsius es: " + celsius4);
                    break;


                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            if (opcion == 5) {
                break;
            }

        }

    }
}
