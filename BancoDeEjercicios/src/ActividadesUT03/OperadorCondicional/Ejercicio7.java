package ActividadesUT03.OperadorCondicional;

import java.util.Scanner;

public class Ejercicio7 {
    // atributos
    private static final Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){
        System.out.printf("%nComprueba si el caracter pertenece al alfabeto inglés%n");
        System.out.printf("Ingresa un caracter = ");
        char carIn = obtenerCaracter();
        System.out.printf("%b" , isAlphabet(carIn));

    }// fin ejecutarPrograma

    private static boolean isAlphabet (char letra){
        boolean esCierto = (letra == 'ñ' ? false : true);
        return esCierto;
    }// fin isAlphabet

    // <--- metodos secundarios ---> //
    private static char obtenerCaracter (){
        char n = Character.toLowerCase(lector.next().charAt(0));
        return n;
    }// fin obtenerCaracter

}// fin-class Ejercicio7
