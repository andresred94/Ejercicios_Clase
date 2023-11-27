package ActividadesUT04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {

    private static Scanner lector = new Scanner ( System.in );


    public static void ejecutarPrograma () {

        int[] misDecimos = {26708 , 13904 , 3306 , 22344 , 99593};
        int[][] numPremiados = loterialNavidad ();
        comprobarSorteoNavidad ( numPremiados , misDecimos );

    }// ejecutarPrograma

    private static void comprobarSorteoNavidad ( int[][] premios , int[] decimos ) {

        System.out.printf ( "Decimos ganadores:%n" );
        for ( int i = 0 ; i < premios.length ; i++ ) {
            System.out.println ( Arrays.toString ( premios[i] ) );
        }

        System.out.printf ( "¿Cuantos décimos has comprado? = " );
        int cantDecimos = lector.nextInt ();

        int[][] decComprados = new int[cantDecimos][2];

        for ( int i = 0 ; i < cantDecimos ; i++ ) {
            System.out.printf ( "Ingresa un décimo = " );
            int nIn = lector.nextInt ();
            decComprados[i][0] = i + 1;
            decComprados[i][1] = nIn;
        }
        System.out.printf ( "Decimos comprados:%n" );
        for ( int i = 0 ; i < decComprados.length ; i++ ) {
            System.out.println ( Arrays.toString ( decComprados[i] ) );
        }

        int encontrados = 0;

        // Cuanta las veces que un decimo tiene premio
        for ( int i = 0 ; i < premios.length ; i++ ) {
            for ( int j = 0 ; j < decComprados.length ; j++ ) {
                if ( decComprados[j][1] == premios[i][1] ){
                    encontrados++;
                }
            }
        }

        int [][] decPremiados = new int[encontrados][2];
        int fila = 0;

        // almacena cada número premiado con la posiciçon que ha ganado
        for ( int i = 0 ; i < premios.length ; i++ ) {
            for ( int j = 0 ; j < decComprados.length ; j++ ) {
                if ( premios[i][1] == decComprados[j][1] ){
                    decPremiados[fila][0] = premios[i][0];
                    decPremiados[fila][1] = premios[i][1];
                    fila++;
                }
            }
        }


        System.out.printf ( "Decimos premiados:%n" );
        for ( int i = 0 ; i < decPremiados.length ; i++ ) {
            System.out.println ( Arrays.toString ( decPremiados[i] ) );
        }
        /*
            if ( decComprados[i][1] == decPremiados[i][1] ){
                    posicion = decPremiados[i][0];
                    numPrem = decPremiados[i][1];
                }

            if ( posicion == 1 ){
                System.out.printf ( "Tu decimo (%d) ha sido premiado con El Gordo con 400.000 €%n" , numPrem );
            } else if ( posicion == 2 ) {
                System.out.printf ( "Tu decimo (%d) ha sido premiado con el 2do premio de 125.000 €%n" , numPrem );
            } else if ( posicion == 3 ) {
                System.out.printf ( "Tu decimo (%d) ha sido premiado con el 3er premio de 50.000 €%n" , numPrem );
            } else if ( posicion == 4) {
                System.out.printf ( "Tu decimo (%d) ha sido premiado con el 4to premio de 20.000 €%n" , numPrem );
            } else  {
                System.out.printf ( "Tu decimo (%d) ha sido premiado con el 5to premio de 6.000 €%n" , numPrem );
            }*/



        /*if ( decComprados[i][1] == premios[i][1] ) {
                posicion = i + 1;
                numPrem = premios[i][1];
                switch ( posicion ) {
                    case 1:
                        System.out.printf ( "Tu decimo (%d) ha sido premiado con El Gordo con 400.000 €%n" , numPrem );
                        break;
                    case 2:
                        System.out.printf ( "Tu decimo (%d) ha sido premiado con el 2do premio de 125.000 €%n" , numPrem );
                        break;
                    case 3:
                        System.out.printf ( "Tu decimo (%d) ha sido premiado con el 3er premio de 50.000 €%n" , numPrem );
                        break;
                    case 4:
                        System.out.printf ( "Tu decimo (%d) ha sido premiado con el 4to premio de 20.000 €%n" , numPrem );
                        break;
                    case 5:
                        System.out.printf ( "Tu decimo (%d) ha sido premiado con el 5to premio de 6.000 €%n" , numPrem );
                        break;
                    default:
                        System.out.printf ( "Ninguno de los decimos apostados ha sido premiado.%n" );
                        break;
                }
            }*/


    }// comprobarSorteoNavidad

    /**
     * Función que genera 1807 números aleatorios del 00000 al 99999 que no se repiten
     * y devuelve en un array 2D los 5 primeros números
     *
     * @return int [][] array que contiene 5 filas con los números premiados
     */
    private static int[][] loterialNavidad () {
        int[] numAlea = new int[1807];

        // genera un número aleatorio que no se repite
        for ( int i = 0 ; i < numAlea.length ; i++ ) {
            int nRan = (int) (Math.random () * 99999 + 1);
            numAlea[i] = nRan;
            while ( contieneNumero ( numAlea , nRan ) ) {
                nRan = (int) (Math.random () * 99999 + 1);
            }
        }// fin for

        // creación del array 2D que contiene los números ganadores
        int[][] premiados = new int[5][2];
        int numPremiados = 5;

        // rellena el array 2D con los números premiados
        for ( int i = 0 ; i < numPremiados ; i++ ) {
            premiados[i][0] = i + 1;// prmio 1 , premio 2 ... hasta 5 filas
            premiados[i][1] = numAlea[i];
        }

        return premiados;
    }// fin-class loterialNavidad

    /**
     * Función que comprueba que un número está dentro de un array 1D
     *
     * @param array1D array donde se buscará el número
     * @param numero  número que se va a buscar
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

}// fin-class Ejercicio23
