package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio09 {

    public static void ejecutarPrograma(){
        int [] primGenerada = primitiva ();
        imprimiArray ( primGenerada );
    }// fin ejecutarPrograma

    /**
     * Devuelve un array de 6 números aleatorio del 1 al 50 que no se repiten y en orden ascendente
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
        // ordenar el array antes de devolverlo
        Arrays.sort ( primGen );
        return primGen;

    }// fin primitiva

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
    }// fin contieneNumero

    /**
     * Imprime un array de 1D
     * @param numeros
     */
    private static void imprimiArray(int [] numeros){
        System.out.printf ( "%nEl contenido del Array es:%n" );
        System.out.println ( Arrays.toString (numeros));
    }// fin imprimirArray

}// fin-class Ejercicio09
