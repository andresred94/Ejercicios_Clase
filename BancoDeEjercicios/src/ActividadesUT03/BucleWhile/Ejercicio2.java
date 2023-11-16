package ActividadesUT03.BucleWhile;

import java.util.Scanner;

public class Ejercicio2 {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    // <-- métodos principales --> //
        public static void adivinarNumero(){
        char op = 's';
        while (op == 's'){
            System.out.printf("Intenta adivinar un número del 1 al 100 = ");
            int numAleatori, n;
            n = obtenerNumero();
            numAleatori = (int) (Math.random() * 100 + 1);
            while ( numAleatori != n ) {
                if ( n > numAleatori ) {
                    System.out.printf("ingresa un número menor = ");
                    n = obtenerNumero();
                } else {
                    System.out.printf("ingresa un número mayor = ");
                    n = obtenerNumero();
                }
            }
            System.out.printf("¡Acertaste! ¿Quieres jugar otra vez (s/n)? = ");
            op = obtenerCaracter();
        }

    }// fin adivinarNumero

    // <-- métodos secundarios --> //
    private static char obtenerCaracter (){
        char n = Character.toLowerCase(lector.next().charAt(0));
        return n;
    }// fin obtenerCaracter

    private static int obtenerNumero(){
        int numIngresado = lector.nextInt();
        return numIngresado;
    }// fin pedirNumero


}// fin-class Ejercicio2
