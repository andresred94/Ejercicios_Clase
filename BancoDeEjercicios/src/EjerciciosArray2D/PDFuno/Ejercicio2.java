package EjerciciosArray2D.PDFuno;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner lector = new Scanner ( System.in );
    public static void main ( String[] args ) {

        System.out.printf ( "¿Cuantas filas quieres que tenga la matriz? = " );
        int filas = lector.nextInt ();
        System.out.printf ( "¿Cuantas columnas quieres que tenga la matriz? = " );
        int colum = lector.nextInt ();

        int [][] matriz1 = new int [filas][colum];

        // rellenamos la matriz
        for ( int i = 0 ; i < matriz1.length ; i++ ) {
            System.out.printf ( "fila %d %n" , i + 1 );
            for ( int j = 0 ; j < matriz1[i].length ; j++ ) {
                System.out.printf ( "columna %d | " , j + 1 );
                System.out.printf ( "Ingresa un número = " );
                int nIn = lector.nextInt ();
                matriz1[i][j] = nIn;

            }
        }

        // imprimir la matriz
        for ( int i = 0 ; i < matriz1.length ; i++ ) {
            System.out.println ( Arrays.toString (matriz1[i]) );
        }

    }// fin main

}// fin-class Ejercicio2
