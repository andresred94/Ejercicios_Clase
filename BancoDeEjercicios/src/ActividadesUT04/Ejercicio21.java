package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio21 {
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 4, 8},
                {9, 10, 11, 12}
        };
        busquedaNumeros ( matriz );

    }// fin ejecutarPrograma

    /**
     * Función que pide un número entero por teclado para buscarlo dentro de la matriz
     * ingresada por parámetro. Si deseas seguir buscando números presiona 's'
     * @param matrixNumeros matriz donde se realiza la busqueda
     */
    private static void busquedaNumeros(int [][] matrixNumeros){
        char s;
        do {
            System.out.printf ( "Ingresa el número que quieres buscar = " );
            int nIn = lector.nextInt ();

            int contVeces = aparicionesNumero ( matrixNumeros , nIn );

            if ( contVeces > 1 ) {
                System.out.printf ( "El número %d ha sido encontrado %d veces.%n" , nIn , contVeces );
            } else if (contVeces == 1){
                System.out.printf ( "El número %d ha sido encontrado %d vez.%n" , nIn , contVeces );
            } else {
                System.out.printf ( "El número %d NO sido encontrado.%n" , nIn );
            }

            for ( int i = 0 ; i < matrixNumeros.length ; i++ ) {
                for ( int j = 0 ; j < matrixNumeros[i].length ; j++ ) {
                    if ( matrixNumeros[i][j] == nIn ){
                        System.out.printf ( "Se ha encontrado en la fila : %d | columna : %d%n" , i+1 , j+1);
                    }
                }
            }

            System.out.printf ( "¿Deseas seguir buscando? (s/n) = " );
            s = obtenerCharMinuscula ();

        } while ( s != 'n' );

    }// fin busquedaNumeros

    /**
     * Función que cuenta cuantas veces se encuentro un número dentro de una matriz
     * @param matrixNumeros matriz a analiza
     * @param numero numero que se buscará
     * @return cantidad de veces que se repìte
     */
    private static int aparicionesNumero(int [][] matrixNumeros, int numero){

        int cont = 0;
        for ( int i = 0 ; i < matrixNumeros.length ; i++ ) {
            for ( int j = 0 ; j < matrixNumeros[i].length ; j++ ) {
                if ( matrixNumeros[i][j] == numero ){
                    cont++;
                }
            }
        }

        return cont;

    }// fin aparicionesNumero

    private static char obtenerCharMinuscula(){
        char n = lector.next ().charAt ( 0 );
        n = Character.toLowerCase ( n );
        return n;
    }

}// fin-clas Ejercicio21
