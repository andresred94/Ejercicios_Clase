package EjerciciosArray2D.PDFuno;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main ( String[] args ) {
        int [][] matrix3x3 = generarMatrizAleatoria ();

        for ( int i = 0 ; i < matrix3x3.length ; i++ ) {
            System.out.println ( Arrays.toString ( matrix3x3[i] ) );
        }

    }// fin main

    // Función para generar una matriz de 3x3 con números aleatorios sin repetir
    public static int[][] generarMatrizAleatoria() {
        int[][] matriz = new int[3][3];

        // Array para llevar un registro de los números generados
        boolean[] numerosGenerados = new boolean[10];

        // Rellenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroAleatorio;
                // Genera un número aleatorio entre 0 y 9 mientras que el indice no este marcado como true
                do {
                    numeroAleatorio = azar ();
                } while (numerosGenerados[numeroAleatorio]);

                // Almacenar el número en la matriz y marcar como generado
                matriz[i][j] = numeroAleatorio;
                numerosGenerados[numeroAleatorio] = true;
                // No se almacenan repetidos porque al marcarse como false, no se almacenará en la matriz

            }// for-j
        }// for-i

        return matriz;
    }

    private static int azar (){
        return (int) (Math.random () * 9);
    }// fin azar

    private static boolean contieneNumero (int [][] array2D , int num){
        for ( int i = 0 ; i < array2D.length ; i++ ) {
            for ( int j = 0 ; j < array2D[i].length ; j++ ) {
                if ( array2D[i][j] == num ) {
                    return true;
                }
            }
        }
        return false;
    }// fin contieneNumero

}// fin-class Ejercicio4
