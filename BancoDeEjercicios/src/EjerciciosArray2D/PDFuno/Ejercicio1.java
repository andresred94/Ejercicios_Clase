package EjerciciosArray2D.PDFuno;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main ( String[] args ) {
        int [][] matriz1 = {
                {10,20},
                {30,40}
        };

        for ( int i = 0 ; i < matriz1.length ; i++ ) {
            System.out.println ( Arrays.toString (matriz1[i]));
        }

        for ( int i = 0 ; i < matriz1.length ; i++ ) {
            for ( int j = 0 ; j < matriz1[i].length ; j++ ) {
                System.out.printf ( "%d " , matriz1[i][j] );
            }
            System.out.println ();
        }

    }// fin main

}// fin-class Ejercicio1
