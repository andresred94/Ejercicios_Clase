package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio2 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        int n;
        System.out.printf ( "%nCompueba si un número es negativo...%n" );
        System.out.printf ( "Ingresa un número = " );
        n = obEntero ();

        if ( esPositivo ( n ) ){
            System.out.printf ( "El número %d es positivo" , n );
        } else {
            System.out.printf ( "El número %d es negativo" , n );
        }

    }// fin ejecutarPrograma

    private static boolean esPositivo (int numero){
        boolean resp = false;
        if ( numero > 0 ){
            resp = true;
        }
        return resp;
    }// fin esPositivo

    //<-- métodos secundarios -->//
    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio2
