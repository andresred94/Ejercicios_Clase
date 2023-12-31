package ActividadesUT04;

import java.util.Scanner;

public class Ejercicio20 {

    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        int[][] matriz = {
                {1, 2, 3, 4},
                {13, 0, 6, 9},
                {45, 1, 4, 1},
                {5, 6, 4, 8},
                {9, 10, 11, 12}
        };
        int num = 20;
        int cantVeces = aparicionesNumero ( matriz, num);

        // mensaje en singular y plural
        if ( cantVeces > 1 ) {
            System.out.printf ( "El número %d ha sido encontrado %d veces%n", num , cantVeces );
        } else if ( cantVeces == 1) {
            System.out.printf ( "El número %d ha sido encontrado %d vez%n", num , cantVeces );
        } else {
            System.out.printf ( "El número %d no ha sido encontrado ni una vez.%n", num );
        }// fin if


    }// ejecutarPrograma

    /**
     * Funcón que cuentas cuantas veces se repite un número en un Array 2D
     * @param matrixNumeros matriz a analizar
     * @param numero entero que se buscará
     * @return entero cantidad de veces repetidas
     */
    private static int aparicionesNumero(int [][] matrixNumeros, int numero){

        int vecesRepetido = 0;
        for ( int i = 0 ; i < matrixNumeros.length ; i++ ) {
            for ( int j = 0 ; j < matrixNumeros[i].length ; j++ ) {
                if ( matrixNumeros[i][j] == numero ){
                    vecesRepetido++;
                }
            }
        }
        return vecesRepetido;

    }// fin aparicionesNumero


}// fin-class Ejercicio20
