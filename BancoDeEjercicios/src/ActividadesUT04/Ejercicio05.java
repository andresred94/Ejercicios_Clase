package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio05 {
    // Apuestas simples:
    // Cuando seleccionas los 6 números solamente.
    // De este modo puedes jugar cada vez antes de pagar hasta un máximo de 8 apuestas en un mismo boleto.
    // Apuestas múltiples:
    // Cuando seleccionas más de 6 números (hasta 11) o solamente 5 números en cada apuesta.
    // El importe de la apuesta depende en este caso del número de combinaciones que marques.

    public static void ejecutarPrograma() {
        int [][] apuesta1 = generarPrimitiva ( 5 );

        for ( int i = 0 ; i < apuesta1.length ; i++ ) {
            System.out.println (Arrays.toString ( apuesta1[i] ));
        }

    }// fin ejecutarProgrma


    private static int [][] generarPrimitiva(int numeroApuestas) {
        int[][] primGen = new int[0][0];
        if ( numeroApuestas == 6 ) {
            primGen = new int[8][52];
            for ( int i = 0 ; i < primGen.length ; i++ ) {
                for ( int j = 0 ; j < primGen[i].length ; j++ ) {
                    System.out.printf ( "%d " , primGen[i][j] );
                }
            }

        }

        return primGen;

    }// fin generarPrimitiva

    private static int [] primitiva (){
        int [] primGen = new int [6];

        for ( int i = 0 ; i < primGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 50) + 1;
            primGen [i] = nRan;
        }
        return primGen;

    }// fin primitiva


}// fin-class Ejercicio05
