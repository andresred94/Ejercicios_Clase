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


    private static int[][] generarPrimitiva ( int numeroApuestas ) {
        // primGen = un boleto de 8 apuestas
        int[][] primGen = new int[8][50];

        // crea el boleto con 8 filas y números del 1 al 50
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                primGen[i][j] = j + 1;
            }// for
        }// for



        // Coloca -1 en 6 números de cada apuesta
        for ( int i = 0 ; i < numeroApuestas ; i++ ) {
            int [] numsEsco = primitiva ();// 6 numeros por cada fila
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {// colum 1 a l 50
                for ( int k = 0 ; k < numsEsco.length ; k++ ) {// recorre el array generado en primitiva()
                    // Si coinciden ambos valores cambia a -1
                    if ( primGen[i][j] == numsEsco[k] ){
                        primGen[i][j] = -1;
                    }

                }// for-k
            }// for-j
        }// for-i

        return primGen;

    }// fin generarPrimitiva

    private static void imprimirArrayBidimensional ( int[][] array ) {
        System.out.printf ( "Resultado apuestas de la primitiva:%n" );
        // recorremos el array que se ingresa por parámetro
        for ( int i = 0 ; i < array.length ; i++ ) {
            for ( int j = 0 ; j < array[i].length ; j++ ) {
                // Si encuentra un valor -1 lo cambiar por X
                if (array[i][j] == -1) {
                    System.out.print("(X) ");
                } else {// sino deja el valor intancto
                    System.out.print(array[i][j] + " ");
                }
            }// fin for-j
            System.out.println ();// salto despues del 50
        }// fin for-i

    }// fin imprimirArrayBidimensional


    private static int[] primitiva () {
        int[] primGen = new int[6];
        // Devuelve un array de 6 posiciones con un número aleatorio del 1 al 50
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 50) + 1;
            primGen[i] = nRan;
        }
        return primGen;

    }// fin primitiva

    // <-- métodos secundarios --> //
    private static int obtenerEnteropos1_8 () {
        int n = lector.nextInt ();
        if ( n < 1 || n > 8 ) n = -1;
        return n;
    }// fin obtenerEnteropos1_8


}// fin-class Ejercicio05
