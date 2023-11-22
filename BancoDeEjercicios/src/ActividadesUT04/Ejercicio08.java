package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {
    // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        System.out.printf ( "%nPrograma que copia una matriz...%n" );
        // primer Array 2D
        System.out.printf ( "Ingresa el nº de filas de la matriz = " );
        int filasM = lector.nextInt ();
        System.out.printf ( "Ingresa el nº columnas de la matriz = " );
        int coluM = lector.nextInt ();

        int [][] matriz1 = new int[filasM][coluM];
        rellenarArrayBidimensional ( matriz1 );
        int [][] matrizCopiada = copiarMatriz ( matriz1 );
        imprimirArrayBidimensional ( matrizCopiada );

    }// fin ejecutarPrograma

    private static void rellenarArrayBidimensional(int [][] array2D){
        System.out.printf ( "rellenando la matriz...%n" );
        for ( int i = 0 ; i < array2D.length ; i++ ) {
            for ( int j = 0 ; j < array2D[i].length ; j++ ) {
                System.out.printf ( "Ingresa un valor en la fila %d y col %d = ", i+1 , j+1 );
                int nIn = lector.nextInt ();
                array2D[i][j] = nIn;
            }
        }

    }// rellenarArrayBidimensional

    private static int [][] copiarMatriz ( int[][] array2D ) {
        int filasM = array2D.length;
        int coluM = array2D[0].length;

        int [][] resp = new int [filasM][coluM];
        System.out.printf ( "copiando matriz...%n" );
        // recorremos el array que se ingresa por parámetro
        for ( int i = 0 ; i < array2D.length ; i++ ) {
            for ( int j = 0 ; j < array2D[i].length ; j++ ) {
                int num = array2D[i][j];
                resp[i][j] = num;
            }// fin for-j
        }// fin for-i
        return resp;

    }// fin imprimirArrayBidimensional

    private static void imprimirArrayBidimensional ( int[][] array ) {
        System.out.printf ( "imprimiendo Array2D...%n" );
        // recorremos el array que se ingresa por parámetro
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.println ( Arrays.toString ( array[i] ));
        }// fin for-i

    }// fin imprimirArrayBidimensional

}// fin-class Ejercicio08
