package EjerciciosCadenas;

public class Ejercicio1 {

    public static void main ( String[] args ) {

        String cad = "Hola a todos";
        cad.toLowerCase ();
        int cont = 0;

        for ( int i = 0 ; i < cad.length () ; i++ ) {
            if ( cad.charAt ( i ) == 'a' || cad.charAt ( i ) == 'e' || cad.charAt ( i ) == 'i' || cad.charAt ( i ) == 'o' || cad.charAt ( i ) == 'u' ){
                cont ++;
            }
        }

        System.out.printf ( "La cantidad de vocales es %d." , cont );

    }// fin main

}// fin-class Ejercicio1
