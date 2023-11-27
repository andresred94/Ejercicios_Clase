package ActividadesUT04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio22 {

    public static void ejecutarPrograma(){

    int [][] numEscogidos = loterialNavidad ();

        // imprimimos el billete
        for ( int i = 0 ; i < numEscogidos.length ; i++ ) {
            System.out.println ( Arrays.toString ( numEscogidos[i] ) );
        }

    }// fin ejecutarPrograma

    /**
     * Función que genera 1807 números aleatorios del 00000 al 99999 que no se repiten
     * y devuelve en un array 2D los 5 primeros números
     * @return int [][] array que contiene 5 filas con los números premiados
     */
    private static int [][] loterialNavidad(){
        int [] numAlea = new int[1807];

        // genera un número aleatorio que no se repite
        for ( int i = 0 ; i < numAlea.length ; i++ ) {
            int nRan = (int) (Math.random () * 99999 + 1);
            numAlea[i] = nRan;
            while ( contieneNumero ( numAlea , nRan ) ) {
                nRan = (int) (Math.random () * 99999 + 1);
            }
        }// fin for

        // creación del array 2D que contiene los números ganadores
        int [][] premiados = new int [5][2];
        int numPremiados = 5;

        // rellena el array 2D con los números premiados
        for (int i = 0; i < numPremiados; i++) {
            premiados[i][0] = i + 1;
            premiados[i][1] = numAlea[i];
        }

        return premiados;
    }// fin-class loterialNavidad

    /**
     * Función que comprueba que un número está dentro de un array 1D
     * @param array1D array donde se buscará el número
     * @param numero número que se va a buscar
     * @return true si se encuentra el número
     */
    private static boolean contieneNumero ( int[] array1D , int numero ) {
        for ( int i = 0 ; i < array1D.length ; i++ ) {
            if ( array1D[i] == numero ) {
                return true;
            }
        }
        return false;
    }// fin contieneNumero

}// fin-class Ejercicio22
