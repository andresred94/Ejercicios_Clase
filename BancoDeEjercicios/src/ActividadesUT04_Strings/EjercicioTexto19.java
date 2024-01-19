package ActividadesUT04_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioTexto19 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        int cont = 0;
        String laqueSeAdivina = "Informatica";

        char [] palEscondida = new char[laqueSeAdivina.length ()];

        Arrays.fill ( palEscondida , '-' );


        boolean adivinada = false;


        do {
            laqueSeAdivina = laqueSeAdivina.toLowerCase ();
            System.out.println("Palabra a adivinar: " + String.valueOf(palEscondida));
            System.out.print("Ingresa una letra para adivinar la palabra = ");
            char charLeido = lector.next().charAt(0);

            boolean esLamisma = false;

            for (int i = 0; i < laqueSeAdivina.length(); i++) {
                char letra = laqueSeAdivina.charAt(i);
                if (charLeido == letra){
                    palEscondida[i] = charLeido;
                    esLamisma = true;
                }
            }

            if (!esLamisma){
                cont++;
                System.out.println("Letra incorrecta. Intentos restantes: " + (7 - cont));
            }

            if (Arrays.equals(palEscondida, laqueSeAdivina.toCharArray())) {
                adivinada = true;
                System.out.println("¡Enhorabuena! Has adivinado la palabra: " + laqueSeAdivina);
            }

        } while (!adivinada && cont < 7);

        if (!adivinada) {
            System.out.println("Lo siento, has agotado tus intentos. La palabra era: " + laqueSeAdivina);
        }

        lector.close();
    }
}// fin-class Ejercicio19
