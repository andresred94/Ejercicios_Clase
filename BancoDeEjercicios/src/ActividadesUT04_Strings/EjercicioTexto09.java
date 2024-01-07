package ActividadesUT04_Strings;

import java.util.Arrays;

public class EjercicioTexto09 {

    public static void main ( String[] args ) {

        String [] palabras = {"andres","martin","bravo","castro"};
        String [] resp = ordenarAlfabeticamente ( palabras );
        System.out.println (Arrays.toString ( resp ));


    }// fin main

    private static String [] ordenarAlfabeticamente(String [] palabras){
        int n = palabras.length;

        // Método de la burbuja para ordenar alfabéticamente
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // compareTo() Devuelve cero si las cadenas son iguales
                // devuelve un entero positivo si este objeto String sigue lexicográficamente a la cadena argumento
                if (palabras[j].compareTo(palabras[j + 1]) > 0) {
                    // Intercambia palabras[j] y palabras[j + 1]
                    String temp = palabras[j];
                    palabras[j] = palabras[j + 1];
                    palabras[j + 1] = temp;
                }
            }
        }
        //Arrays.sort ( palabras );
        return palabras;
    }// fin ordenarAlfabeticamente

}// fin-class EjercicioTexto09
