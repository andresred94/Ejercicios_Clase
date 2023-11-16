package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio8 {
    // atributos
    private static final Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma() {
        System.out.printf("%nComprueba si el caracter pertenece al alfabeto inglés%n");
        System.out.printf("Ingresa un caracter = ");
        char carIn = obtenerCaracter();
        System.out.printf("%b", esAlfabeto(carIn));

    }// fin ejecutarPrograma

    private static boolean esAlfabeto(char letra) {
        boolean esCierto = (letra == 'ñ' || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú' ? true : false);
        return esCierto;
    }// fin isAlphabet

    // <--- metodos secundarios ---> //
    private static char obtenerCaracter() {
        char n = Character.toLowerCase(lector.next().charAt(0));
        return n;
    }// fin obtenerCaracter


}// fin-class Ejercicio8

