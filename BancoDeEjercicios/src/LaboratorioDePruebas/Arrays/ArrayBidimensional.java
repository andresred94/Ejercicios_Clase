package LaboratorioDePruebas.Arrays;

import java.util.Scanner;

public class ArrayBidimensional {
    private static Scanner lector = new Scanner ( System.in );

    public static void main ( String[] args ) {

        System.out.println ( "Array bidimensional:" );
        System.out.printf ( "int[][] nombArray = new [filas][columnas]%n" );

        //int filas = 3; // Número de filas
        System.out.printf ( "¿Cuantas filas quieres que tenga el Array bidimensional? = " );
        int filas = obtenerEnteroPositivo ();

        //int columnas = 5; // Número de columnas
        System.out.printf ( "¿Cuantas columnas quieres que tenga el Array bidimensional? = " );
        int columnas = obtenerEnteroPositivo ();
        int[][] miArrayBidimensional = new int[filas][columnas];

        // Rellenar el array bidimensional
        for ( int i = 0 ; i < filas ; i++ ) {
            System.out.printf ( "%n| fila %d |%n" , i );
            for ( int j = 0 ; j < columnas ; j++ ) {
                System.out.printf ( "columna %d %n" , j );
                System.out.printf ( "Ingresa un número = " );
                miArrayBidimensional[i][j] = obtenerEnteroPositivo ();

            }
        }

        // Imprimir el array bidimensional
        imprimirArrayBidimensional ( miArrayBidimensional );
    }// fin main

    private static void imprimirArrayBidimensional ( int[][] array ) {
        System.out.printf ( "Imprimiendo contenido del Array:%n" );
        for ( int i = 0 ; i < array.length ; i++ ) {
            for ( int j = 0 ; j < array[i].length ; j++ ) {
                System.out.print ( array[i][j] + " " );
            }
            System.out.println ();
        }
    }

    private static int obtenerEnteroPositivo () {
        int n = lector.nextInt ();
        if ( n < 0 ) n = -n; // Convertir números negativos a positivos
        return n;
    }


}// fin-class ArrayBidimensional
