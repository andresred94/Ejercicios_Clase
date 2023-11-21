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



        // rellena la cantidad de apuestas de X
        for ( int i = 0 ; i < numeroApuestas ; i++ ) {
            for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                int numEscogido;
                int [] numsEsco = primitiva ();
                for ( int k = 0 ; k < numsEsco.length ; k++ ) {
                    numEscogido = numsEsco[i];
                    if ( primGen[i][j] == numEscogido ){
                        primGen[i][j] = 0;
                    }
                }

            }// for
        }// for

        return primGen;

    }// fin generarPrimitiva

    private static void imprimirArrayBidimensional ( int[][] array ) {
        System.out.printf ( "Resultado apuestas de la primitiva:%n" );
        for ( int i = 0 ; i < array.length ; i++ ) {
            for ( int j = 0 ; j < array[i].length ; j++ ) {
                System.out.print ( array[i][j] + " " );
            }
            System.out.println ();
        }
    }


    private static int[] primitiva () {
        int[] primGen = new int[6];

        for ( int i = 0 ; i < primGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 50) + 1;
            primGen[i] = nRan;
        }
        return primGen;

    }// fin primitiva

    // <-- métodos secundarios --> //
    private static int obtenerEnteropos1_8 () {
        int n = lector.nextInt ();
        ;
        if ( n < 1 || n > 8 ) n = -1;
        return n;
    }// fin obtenerEnteropos


}// fin-class Ejercicio05
