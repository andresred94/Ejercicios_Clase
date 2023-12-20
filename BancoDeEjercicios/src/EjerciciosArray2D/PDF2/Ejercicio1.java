package EjerciciosArray2D.PDF2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main ( String[] args ) {
        int [][] matriz = generarMatriz ();

        for ( int i = 0 ; i < matriz.length ; i++ ) {
            System.out.println ( Arrays.toString (matriz[i]));
        }

    }

    private static Scanner lector = new Scanner ( System.in );

    private static int[][] generarMatriz(){

        System.out.printf ( "¿Cuantas columnas quieres que tenga cada fila? = " );
        int colum = lector.nextInt ();
        int [][] matriz5_X = new int[5][colum];
        for ( int i = 0 ; i < matriz5_X.length ; i++ ) {
            for ( int j = 0 ; j < matriz5_X[i].length ; j++ ) {
                matriz5_X[i][j] = (int) (Math.random () * 100 + 1);
            }
        }
        return matriz5_X;
    };

}// fin-class Ejercicio1
