package EjerciciosArray2D.PDFuno;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main ( String[] args ) {
        int [][] matrix3x3 = new int[3][3];

        // Recorre cada fila
        for ( int i = 0 ; i < matrix3x3.length ; i++ ) {
            // Recorre cada columna de cada fila
            for ( int j = 0 ; j < matrix3x3[i].length ; j++ ) {
                // Se genera y se ingrea un número aleatorio del 1 al 9
                int nRan = azar ();
                matrix3x3[i][j] =  nRan;
                /*// recorre cada fila y verifica si ya existe ese número en la fila actual
                for (int k = 0; k < j; k++) {
                    if (matrix3x3[i][j] == matrix3x3[i][k]) {
                        matrix3x3[i][j] = azar ();
                        j--; // Reintentar generar un nuevo número en la misma posición
                        break;
                    }
                }// for-k*/

                /*// Recorre cada posición de la matriz y verifica si la posición anterior es igual a la siguiente
                for (int m = 0; m < i; m++) {// filas
                    for (int n = 0; n < matrix3x3[m].length; n++) {// colum
                        // Si son iguales
                        if (matrix3x3[i][j] == matrix3x3[m][n]) {
                            matrix3x3[i][j] = azar(); // Genera un nuevo número
                            m = -1; // Reinicia la verificación desde la primera fila
                            break;
                        }

                    }// for-n
                }// for-m*/

                // Verificar el nuevo número generado en todas las filas anteriores
                for (int m = 0; m < i ; m++) {
                    for (int n = 0; n < matrix3x3[m].length; n++) {
                        if (matrix3x3[m][n] == nRan) {
                            matrix3x3[i][j] = azar ();
                        }
                    }
                }


            }// for-j
        }// for-i

        for ( int i = 0 ; i < matrix3x3.length ; i++ ) {
            System.out.println ( Arrays.toString ( matrix3x3[i] ) );
        }

    }// fin main

    private static int azar (){
        return (int) (Math.random () * 9);
    }// fin azar

}// fin-class Ejercicio4
