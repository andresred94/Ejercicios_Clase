package LaboratorioDePruebas.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NumeroMayor {
    public static void main ( String[] args ) {
        mayor ();
    }// fin main

    private static Scanner lector = new Scanner ( System.in );

    private static void mayor (){
        System.out.printf ( "%nDevuelve el número mayor de todos los ingresados...%n" );
        System.out.printf ( "¿Cuantos números decimales quieres ingresar? = " );
        int tamArray = obtenerEnteroPos ();
        float [] numeros  = new float [tamArray];

        // bucle para rellenar el array
        for ( int i = 0 ; i < numeros.length ; i++ ) {
            System.out.printf ( "Ingresa un número decimal = " );
            float nIn = obtenerDecimalPos ();
            numeros [i] = nIn;
            System.out.printf ( "Se ha guardado en la posición : %d%n" , i );
        }
        // ordenamos el array de menor a mayor
        Arrays.sort ( numeros );
        float nMayor = numeros[tamArray - 1];
        //float nMayor = numeros[numeros.length-1];
        System.out.printf ( "El número mayor de todos es : %.2f" , nMayor );
    }

    private static float obtenerDecimalPos() {
        float n = lector.nextFloat ();
        if ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEnteroPos

    private static int obtenerEnteroPos(){
        int n = lector.nextInt ();
        if ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEnteroPos

}// fin-class NumeroMayor
