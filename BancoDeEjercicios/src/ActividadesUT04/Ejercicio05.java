package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
     // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma () {
        System.out.printf ( "¿Cuantas veces quieres apostar? (max 8) = " );
        int cantApu = obtenerEnteropos1_8 ();
        // control de errores
        while ( cantApu == -1 ) {
            System.out.printf ( "Error : valor no válido.%n" );
            System.out.printf ( "¿Cuantas veces quieres apostar? (max 8)= " );
            cantApu = obtenerEnteropos1_8 ();
        }

        int[][] apuesta1 = generarPrimitiva ( cantApu );
        /*for ( int i = 0 ; i < apuesta1.length ; i++ ) {
            System.out.printf ( "Apuesta %d = " , i + 1);
            for ( int j = 0 ; j < apuesta1[i].length ; j++ ) {
                System.out.printf ( "%d " , apuesta1[i][j] );
            }
            System.out.println ();
        }*/

        //imprimirArrayBidimensional ( apuesta1 );

    }// fin ejecutarProgrma

    /**
     * Genera un array bidimensional de 8 filas y 49 columnas. Reemplaza -1 por cada valor repetido
     * a cualquiera de los  6 números generados aleatoriamente y que no se repiten en cada una de las 8 filas.
     * @param numeroApuestas cantidad de apuestas que va a realizar, máximo 8
     * @return array entero bidimensional con 6 'X' en cada fila
     */
    private static int[][] generarPrimitiva ( int numeroApuestas ) {
        // primGen = un boleto de 8 apuestas
        int[][] primGen = new int[8][49];

        // crea el boleto con 8 filas y números del 1 al 50
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                primGen[i][j] = j + 1;
            }// for-j
        }// for-i

        // Recorre la cantidad de apuestas ingresadas.
        for ( int i = 0 ; i < numeroApuestas ; i++ ) {
            // guardamos los números que hemos generado en la primitiva
            int[] numsEsco = Ejercicio04.primitiva ();

            // recorremos la primitiva generada anteriormente
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {

                // recorre el array generado en primitiva()
                for ( int k = 0 ; k < numsEsco.length ; k++ ) {
                    // Si coincide con el valor aleatorio generado en la primitiva
                    // con el número de columna, el valor cambia a -1
                    if ( primGen[i][j] == numsEsco[k] ) {
                        primGen[i][j] = -1;
                    }

                }// for-k
            }// for-j
        }// for-i

        for ( int i = 0 ; i < primGen.length ; i++ ) {
            System.out.printf ( "Apuesta %d = " , i + 1);
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                if ( primGen[i][j] == -1 ){
                    System.out.printf ( "X " );
                } else {
                    System.out.printf ( "%d " , primGen[i][j] );
                }
            }
            System.out.println ();
        }

        return primGen;

    }// fin generarPrimitiva

    // <-- métodos secundarios --> //

    /**
     * Lee y devuelve un número entero del 1 al 8 ingresado por teclado
     * @return devuelve -1 en caso de que se encuentre fuera del rango
     */
    private static int obtenerEnteropos1_8 () {
        int n = lector.nextInt ();
        if ( n < 1 || n > 8 ) n = -1;
        return n;
    }// fin obtenerEnteropos1_8


}// fin-class Ejercicio05
