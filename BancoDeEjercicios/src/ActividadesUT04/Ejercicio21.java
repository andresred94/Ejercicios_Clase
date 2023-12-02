package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21 {
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        int[][] matriz = {
                {3, 4},
                {5, 6, 4, 8,0,111},
                {0, 11, 1,2,4, 8},
                {2, 4, 3, 82},
                {9, 3, 4, 12,2}
        };
        for ( int i = 0 ; i < matriz.length ; i++ ) {
            System.out.println (Arrays.toString ( matriz[i] ));
        }
        busquedaNumeros ( matriz );

    }// fin ejecutarPrograma

    /**
     * Función que pide un número entero por teclado para buscarlo dentro de la matriz
     * ingresada por parámetro. Si deseas seguir buscando números presiona 's'
     * @param matrixNumeros matriz donde se realiza la busqueda
     */
    private static void busquedaNumeros(int [][] matrixNumeros){
        char resp;
        do {
            System.out.printf ( "Ingresa el número que quieres buscar = " );
            int nIn = lector.nextInt ();
            int cantVeces = 0;
            // recorre el array 2D ingresado por parámetro y comprueba si es igual al número ingresado por teclado
            for ( int i = 0 ; i < matrixNumeros.length ; i++ ) {
                int j;// inicilizo anters del for para poder usarla en el while
                // recorre cada posicion de una fila
                for (  j = 0 ; j < matrixNumeros[i].length ; j++ ) {
                    // Cuantas la ceces que aparec un número dentro del array
                    if ( matrixNumeros[i][j] == nIn ){
                        cantVeces++;
                    }
                    // Solo imprime si se encuentra 1 vez
                    while ( cantVeces == 1 ){
                        System.out.printf ( "Se ha encontrado en la fila : %d | columna : %d%n" , i+1 , j+1);
                        cantVeces++;
                    }
                }// fin for-j
            }// fin for-i

            System.out.printf ( "¿Deseas seguir buscando? (s/n) = " );
            resp = lector.next ().charAt ( 0 );
            resp = Character.toLowerCase ( resp );

        } while ( resp != 'n' );

    }// fin busquedaNumeros

}// fin-clas Ejercicio21
