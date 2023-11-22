package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio04 {

    public static void ejecutarPrograma(){
        int [] primGenerada = primitiva ();
        imprimiArray ( primGenerada );
    }// fin ejecutarPrograma

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
        // otra manera de imprimir un array
        // System.out.println ( Arrays.toString ( primGen ) );
        return primGen;

    }// fin primitiva

    /**Función que comprueba que un número es igual a otro número dentro del array
     * @param array1D - array que queremos comprobar
     * @param numero - número entero que queremos que compruebe que está dentro de array1D
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
     * Función que imprime un array 1D
     * @param numeros array que queremos imprimir
     */
    private static void imprimiArray(int [] numeros){
        System.out.printf ( "%nEl contenido del Array es:%n" );
        System.out.println ( Arrays.toString (numeros));
    }// fin imprimirArray

}// fin-class Ejercicio05
