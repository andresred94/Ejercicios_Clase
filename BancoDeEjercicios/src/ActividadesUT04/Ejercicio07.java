package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        System.out.printf ( "%nCalcula el producto de dos matrices%n" );
        // primer Array 2D
        System.out.printf ( "Ingresa el nº de filas de la primera matriz = " );
        int filasM1 = lector.nextInt ();
        System.out.printf ( "Ingresa el nº de columnas de la primera matriz = " );
        int coluM1 = lector.nextInt ();
        System.out.printf ( "Rellena la primea matriz:%n" );
        int [][] matriz1 = new int[filasM1][coluM1];
        rellenarArrayBidimensional ( matriz1 );
        System.out.printf ( "Primera Matriz:%n" );
        imprimirArrayBidimensional ( matriz1 );

        // segundo Array 2D
        System.out.printf ( "Ingresa el nº de filas de la segunda matriz = " );
        int filasM2 = lector.nextInt ();
        System.out.printf ( "Ingresa el nº de columnas de la segunda matriz = " );
        int coluM2 = lector.nextInt ();
        System.out.printf ( "Rellena la segunda matriz:%n" );
        int [][] matriz2 = new int[filasM2][coluM2];
        rellenarArrayBidimensional ( matriz2 );
        System.out.printf ( "Segunda matriz:%n" );
        imprimirArrayBidimensional ( matriz2 );

        // control de errores
        while ( coluM1 != filasM2 ){
            System.out.printf ( "%nError : el nº de columnas de la primera matriz debe ser igual al nº de filas de la segunda matriz.%n" );
            System.out.printf ( "Ingresa el nº columnas de la primera matriz = " );
            coluM1 = lector.nextInt ();
            System.out.printf ( "Ingresa el nº de filas de la primera matriz = " );
            filasM2 = lector.nextInt ();
        }

        int [][] resulMulti = productoMatrices ( matriz1 , matriz2 );
        System.out.printf ( "El producto de ambas matrices es:%n" );
        imprimirArrayBidimensional ( resulMulti );


    }// fin ejecutarPrograma

    private static int [][] productoMatrices ( int mA [][] , int mB [][]){
        int filMatrA = mA.length;
        int coluMatrA = mA[0].length;
        int coluMatrB = mB[0].length;

        int[][] result = new int[filMatrA][coluMatrB];

        for (int i = 0; i < filMatrA; i++) {
            for (int j = 0; j < coluMatrB; j++) {
                result[i][j] = 0; // Inicializar la posición a 0 antes de sumar productos

                for (int k = 0; k < coluMatrA; k++) {
                    result[i][j] = result[i][j]+ (mA[i][k] * mB[k][j]);
                    //result[i][j] += mA[i][k] * mB[k][j];
                }// fin for-k
            }// fin for-j
        }// fin for-i

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
            System.out.println ( Arrays.toString ( array[i] ));
        }// fin for-i

    }// fin imprimirArrayBidimensional


}// fin-class ejercicio07
