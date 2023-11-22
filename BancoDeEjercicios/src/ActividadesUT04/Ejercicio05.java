package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {
    // Apuestas simples:
    // Cuando seleccionas los 6 números solamente.
    // De este modo puedes jugar cada vez antes de pagar hasta un máximo de 8 apuestas en un mismo boleto.
    // Apuestas múltiples:
    // Cuando seleccionas más de 6 números (hasta 11) o solamente 5 números en cada apuesta.
    // El importe de la apuesta depende en este caso del número de combinaciones que marques.

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

        imprimirArrayBidimensional ( apuesta1 );

    }// fin ejecutarProgrma

    /**
     * Genera un array bidimensional con 6 números marcados en un total de 8 apuestas
     * @param numeroApuestas cantidad de apuestas que va a realizar, máximo 8
     * @return array entero bidimensional
     */
    private static int[][] generarPrimitiva ( int numeroApuestas ) {
        // primGen = un boleto de 8 apuestas
        int[][] primGen = new int[8][50];

        // crea el boleto con 8 filas y números del 1 al 50
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                primGen[i][j] = j + 1;
            }// for-j
        }// for-i

        for ( int i = 0 ; i < numeroApuestas ; i++ ) {
            // guardamos los números que hemos generado en la primitiva
            int[] numsEsco = primitiva ();

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

        return primGen;

    }// fin generarPrimitiva

    /**
     * Imprime un array bidimensional y coloca una X donde este el valor -1
     * @param array2D - array a imprimir
     */
    private static void imprimirArrayBidimensional ( int[][] array2D ) {

        System.out.printf ( "Resultado apuestas de la primitiva:%n" );
        // recorremos el array2D que se ingresa por parámetro e imprime los valores que contiene la matriz
        for ( int fila = 0 ; fila < array2D.length ; fila++ ) {
            for ( int col = 0 ; col < array2D[fila].length ; col++ ) {

                // Si encuentra un valor -1 imprime una X
                if ( array2D[fila][col] == -1 ) {
                    System.out.print ( "(X) " );
                } else {// sino deja el valor que contiene la matriz en ese punto
                    System.out.print ( array2D[fila][col] + " " );
                }

            }// fin for-j
            System.out.println ();// salto despues del 50
        }// fin for-i

    }// fin imprimirArrayBidimensional

    /**
     * Devuelve un array de 6 números aleatorio del 1 al 50 que no se repiten
     * @return array entero con 5 indices
     */
    private static int[] primitiva () {
        int[] primGen = new int[6];
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            // genera un número aleatorio del 1 al 50 incluido
            int nRan = (int) (Math.random () * 50) + 1;

            // Verificar si nRan ya está en posiciones anteriores
            while ( contieneNumero ( primGen , nRan ) ) {
                nRan = (int) (Math.random () * 50) + 1;
            }
            primGen[i] = nRan;
        }

        //Arrays.sort ( primGen );
        //System.out.println ( Arrays.toString ( primGen ) );
        return primGen;

    }// fin primitiva

    // <-- métodos secundarios --> //

    /**
     * @param array1D - array que queremos comprobar
     * @param numero - número entero que queremos que compruebe que está dentro del array
     * @return true si ambos son iguales
     */
    private static boolean contieneNumero ( int[] array1D , int numero ) {
        for ( int i = 0 ; i < array1D.length ; i++ ) {
            if ( array1D[i] == numero ) {
                return true;
            }
        }
        return false;
    }

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
