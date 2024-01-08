package ActividadesUT04_Strings;

import java.util.Arrays;

public class EjercicioTexto12 {

    public static void main ( String[] args ) {

        String [] palabras = {"uno","dos","tresa"};
        System.out.println (palabraMasLarga ( palabras ));

    }// fin main

    private static String palabraMasLarga(String [] palabras){

        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = 0; j < palabras.length - 1 - i; j++) {
                // Comparar elementos adyacentes y intercambiar si están en el orden incorrecto
                if (palabras[i].length () <  palabras[j + 1].length ()) {
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;
                }
            }
        }

        for ( int i = 0 ; i < palabras.length ; i++ ) {
            System.out.printf ("%s " , palabras[i]);
        }

        return palabras[0];
    }//fin palabraMasLarga

}// fin-class EjercicioTexto12
