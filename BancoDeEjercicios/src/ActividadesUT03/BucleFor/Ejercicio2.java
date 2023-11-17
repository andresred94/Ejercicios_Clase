package ActividadesUT03.BucleFor;

import java.util.Scanner;

public class Ejercicio2 {

    //atributos
    private static final Scanner lector = new Scanner(System.in);
    public static void ejecutarPrograma(){
        char opIn;
        int impares = 0;
        int nIn;
        do {// bucle general del programa
            System.out.printf("%nComprueba cuántos números son pares e impares%n");
            System.out.printf("Ingresa \"s\" para salir y \"e\" para empezar = ");
            opIn = obtenerCaracter();

            while (opIn == 'e') {// empieza el programa
                do {// si desea salir presiona s
                    System.out.printf("Ingresa un número = ");
                    nIn = obtenerEntero();
                    // comprueba que sea impar
                    if (contarImpares ( nIn )) {
                        impares++;
                    }
                    System.out.printf("Ingresa \'c\' para continua y \'s\' para salir = ");
                    opIn = obtenerCaracter();
                } while ( opIn == 'c' );// para continuar ingresa c
            }

            if (opIn == 's') {
                if ( impares == 1 ){
                    System.out.printf("Has ingresado %d número impar%n", impares);
                } else {
                    System.out.printf("Has ingresado %d números impares%n", impares);
                }
            }

        } while (opIn != 's');

    }// fin ejecutarPrograma

    protected static boolean contarImpares (int... num){
         boolean esCierto = false;
        for ( int n : num ){
            // comprueba que sea impar
            if (n % 2 != 0) {
                esCierto = true;
            } else {
                esCierto = false;
            }
        }
        return esCierto;
    }

    private static char obtenerCaracter (){
        char n = Character.toLowerCase(lector.next().charAt(0));
        return n;
    }// fin obtenerCaracter

    private static int obtenerEntero(){
        int n = lector.nextInt();
        return n;
    }// fin obtenerEntero1_5

}// fin-class Ejercicio2
