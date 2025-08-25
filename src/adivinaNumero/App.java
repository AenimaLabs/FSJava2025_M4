package adivinaNumero;

import adivinaNumero.clases.AdivinaNumero;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //generar numero aleatorio entre 1 y 100
        int numAleatorio = (int) (Math.random() * 100) + 1;

        //lista para almacenar los intentos del usuario
        ArrayList<Integer> intentos = new ArrayList<>();

        //variable para almacenar el número ingresado
        int numeroIngresado;

        //bucle para repetir el proceso hasta que el usuario adivine el número
        while (true) {
            System.out.println("Adivina el número entre 1 y 100:");
            Scanner sc = new Scanner(System.in);
            numeroIngresado = sc.nextInt();

            intentos.add(numeroIngresado);

            // Llamar al método estático
            String resultado = AdivinaNumero.compararNumeros(numeroIngresado, numAleatorio);
            System.out.println(resultado);

            // Si adivinó, salir
            if (resultado.equals("¡Correcto! Has adivinado el número.")) {
                break;
            }
        }

        // Mostrar resumen
        System.out.println("Te tomó " + intentos.size() + " veces adivinar el número.");

        // Mostrar todos los intentos en una sola línea
        for (int i = 0; i < intentos.size(); i++) {
            System.out.print(intentos.get(i));
            if (i < intentos.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Salto de línea final
    }
}
