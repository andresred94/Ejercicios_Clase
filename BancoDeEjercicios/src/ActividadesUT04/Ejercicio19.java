package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {

    private static Scanner lector = new Scanner ( System.in );


    public static void ejecutarPrograma(){
        int tamArray = 6;
        int [] seisNumeros = new int[tamArray];
        System.out.printf ( "Ingresa %d números para rellenar el array.%n" , tamArray );
        rellenarArraySinRepetir ( seisNumeros );


    }// fin ejecutarPrograma

    /**
     * Función que rellena un array con enteros sin repetir
     * @param numeros Array a rellenar.
     */
    private static void rellenarArraySinRepetir(int [] numeros){
        int nIn;
        for ( int i = 0 ; i < numeros.length ; i++ ) {
            System.out.printf ( "Ingresa un número = " );
            nIn = obtenerEneroPos ();
            numeros[i] = nIn;
            boolean esCierto = estaDentroDe1D ( numeros , nIn , i );
            if ( esCierto ){
                System.out.printf("Error : Valor repetido.%n");
                i--;
            }
        }// fin for

        System.out.printf ( "Contenido del array:%n" );
        System.out.println (Arrays.toString ( numeros ));

    }// fin rellenarArraySinRepetir

    private static int obtenerEneroPos(){
        int n = lector.nextInt ();
        if ( n < 0 ) n = -1;
        return n;
    }// fin obtenerEneroPos

    /**
     * Función que comprueba que num está dentro del numeros.
     * @param numeros Array que se va a recorrer para comprobarlo
     * @param num Número entero que se va a buscar
     * @param indFin Tamaño del indice del array que se ingresa
     * @return true = si se encuentra dentro del Array
     */
    private static boolean estaDentroDe1D ( int[] numeros, int num, int indFin){
        for (int i = 0; i < indFin; i++) {
            if (numeros[i] == num) {
                return true;
            }
        }
        return false;
    }// fin estaDentroDe1D



}// fin-class Ejercicio19
