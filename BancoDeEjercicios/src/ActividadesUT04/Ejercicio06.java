package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {
    // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        System.out.printf ( "%nCalcula la suma de dos matrices%n" );
        System.out.printf ( "Ingresa el tamaño de las filas de ambas matrices = " );
        int filasM = lector.nextInt ();
        System.out.printf ( "Ingresa el tamaño de las columnas de ambas matrices = " );
        int coluM = lector.nextInt ();

        // control de errores
        while ( filasM != coluM ){
            System.out.printf ( "%nError : filas y columnas deben ser iguales.%n" );
            System.out.printf ( "Ingresa el tamaño de las filas de ambas matrices = " );
            filasM = lector.nextInt ();
            System.out.printf ( "Ingresa el tamaño de las columnas de ambas matrices = " );
            coluM = lector.nextInt ();
        }

        System.out.printf ( "Rellena la primea matriz:%n" );
        int [][] matriz1 = new int[filasM][coluM];
        rellenarArrayBidimensional ( matriz1 );


        System.out.printf ( "Primera Matriz:%n" );
        imprimirArrayBidimensional ( matriz1 );

        System.out.printf ( "Rellena la segunda matriz:%n" );
        int [][] matriz2 = new int[filasM][coluM];
        rellenarArrayBidimensional ( matriz2 );

        System.out.printf ( "Segunda matriz:%n" );
        imprimirArrayBidimensional ( matriz2 );

        int [][] sumaAmbas = sumaMatrices ( matriz1 , matriz2 );
        System.out.printf ( "La suma de ambas matrice es:%n" );
        imprimirArrayBidimensional ( sumaAmbas );


    }// fin ejecutarPrograma

    private static int [][] sumaMatrices (int mA [][] , int mB [][]){
        int fil = mA.length;// al ser las dos iguales cojo cualquiera
        int colu = mA[0].length;

        int result [][] = new int [fil][colu];

        for ( int i = 0 ; i < result.length ; i++ ) {
            for ( int j = 0 ; j < result[i].length ; j++ ) {
                result[i][j] = mA[i][j] + mB [i][j];
            }
        }

        return result;
    }// fin sumaMatrices

    private static void rellenarArrayBidimensional(int [][] array2D){
        for ( int i = 0 ; i < array2D.length ; i++ ) {
            for ( int j = 0 ; j < array2D[i].length ; j++ ) {
                System.out.printf ( "Ingresa un valor en la fila %d y col %d = ", i+1 , j+1 );
                int nIn = lector.nextInt ();
                array2D[i][j] = nIn;
            }
        }

    }// rellenarArrayBidimensional

   private static void imprimirArrayBidimensional ( int[][] array ) {
       System.out.printf ( "imprimiendo Array2D...%n" );
       // recorremos el array que se ingresa por parámetro
       for ( int i = 0 ; i < array.length ; i++ ) {
           System.out.println (Arrays.toString ( array[i] ));
       }// fin for-i

   }// fin imprimirArrayBidimensional

}// fin-class Ejercicio06
