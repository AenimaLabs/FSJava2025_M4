package utilidadesMatematicas;

public class UtilidadesMatematicas implements CalculadoraMatematica {

    /**
     * Metodo que verifica si un numero es par
     *
     * @param numero
     * @return true si el numero es par, false en caso contrario
     */

//    public static boolean esPar(int numero) {
    //quitamos static para que sea un metodo de instancia
    //inyectarla como dependencia en otras clases
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Metodo que calcula el factorial de un numero
     *
     * @param numero
     * @return el factorial del numero
     * @throws IllegalArgumentException si el numero es negativo
     */

//    public static long obtenerFactorial(int numero) {
    //quitamos static para que sea un metodo de instancia
    //inyectarla como dependencia en otras clases
    public long obtenerFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El numero debe ser no negativo");
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Metodo que verifica si un numero es primo
     * @param numero a evaluar
     * @return true si el numero es primo, false en caso contrario
     * @throws IllegalArgumentException si el numero es menor o igual a 1
     */

//    public static boolean esPrimo(int numero) {
    //quitamos static para que sea un metodo de instancia
    //inyectarla como dependencia en otras clases
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Los números menores que 2 no son primos.");

        }
        for (int i = 2; i<= Math.sqrt(numero); i++){
            if (numero == 2) return true;
            if (numero % 2 == 0) return false;
            if (numero %i == 0) return false;
        }
        return true;
    }

    /**
     * Metodo que calcula el maximo comun divisor de dos numeros usando el algoritmo de euclides
     * @param numero1
     * @param numero2
     * @return el maximo comun divisor de los dos numeros
     * @throws IllegalArgumentException si alguno de los numeros es negativo
     */

//    public static int obtenerMCD(int numero1, int numero2) {
    //quitamos static para que sea un metodo de instancia
    //inyectarla como dependencia en otras clases
    public int obtenerMCD(int numero1, int numero2) {
        if (numero1 < 0 || numero2 < 0) {
            throw new IllegalArgumentException("Los números deben ser no negativos");
        }
        while (numero2 != 0) {
            int temporal = numero2;
            numero2 = numero1 % numero2;
            numero1 = temporal;
        }
        return numero1;
    }

}


