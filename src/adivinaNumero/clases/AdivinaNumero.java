package adivinaNumero.clases;

public class AdivinaNumero {

    public static String compararNumeros(int numUsuario, int numAleatorio) {
        if (numUsuario == numAleatorio) {
            return "¡Correcto! Has adivinado el número.";
        } else if (numUsuario < numAleatorio) {
            return "Muy bajo. Intenta de nuevo.";
        } else {
            return "Muy alto. Intenta de nuevo.";
        }
    }
}
