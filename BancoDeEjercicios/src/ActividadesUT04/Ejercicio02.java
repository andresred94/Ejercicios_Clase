package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    // atributos
    private static Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma(){

        System.out.printf ( "Rellena un Array%n" );
        System.out.printf ( "¿Cuantas posiciones quieres que tenga el Array? = " );
        int tamArray = obtenerEnteropos ();
        int [] MiArray = new int[tamArray];
        rellenarArray ( MiArray );
        imprimiArray ( MiArray );

    }// fin ejecutarPrograma

    private static void imprimiArray(int [] numeros){
        System.out.printf ( "%nEl contenido del Array es:%n" );
        System.out.println ( Arrays.toString (numeros));
    }// fin imprimirArray

    private static void rellenarArray(int [] numeros){
        for ( int i = 0 ; i < numeros.length ; i++ ) {
            System.out.printf ( "Ingresa un número = " );
            int nIn = obtenerEnteropos ();
            numeros [i] = nIn;
            System.out.printf ( "index: %d | pos: %d | value = %d%n" , i , i + 1 , numeros [i] );
        }

    }// fin rellenarArray

    // <-- métodos secundarios --> //
    private static int obtenerEnteropos(){
        int n = lector.nextInt ();;
        if ( n < 0 ) n = -1;
        return n;
    }// fin obtenerEnteropos


}// fin-class Ejercicio02
