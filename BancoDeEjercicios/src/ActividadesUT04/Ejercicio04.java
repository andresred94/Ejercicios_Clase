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
    protected static int[] primitiva () {
        // Crear el array
        int[] primGen = new int[6];

        // recorremos el array
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 49) + 1;
            primGen[i] = nRan;
            // volvemos a recorrer todas las posiciones hasta la penultima posicion = i - 1
            for ( int j = 0 ; j < i ; j++ ) {
                if ( primGen[i] == primGen[j] ){
                    nRan= (int) (Math.random () * 49) + 1;
                    primGen[i] = nRan;
                }
            }// fin for-j
        }// fin for-i

        return primGen;

    }// fin primitiva

    /**
     * Función que comprueba que un número es igual a otro número dentro del array
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

    private static boolean numerosDistintos ( int [] array ){
        for ( int i = 0 ; i < array.length ; i++ ) {
            for ( int j = 0 ; j < i ; j++ ) {
                if ( array[i] == array[j] ){
                    return true;
                }
            }
        }
        return false;
    }// numerosDistintos

    /**
     * Función que imprime un array 1D
     * @param numeros array que queremos imprimir
     */
    private static void imprimiArray(int [] numeros){
        System.out.printf ( "%nEl contenido del Array es:%n" );
        System.out.println ( Arrays.toString (numeros));
    }// fin imprimirArray

}// fin-class Ejercicio05
