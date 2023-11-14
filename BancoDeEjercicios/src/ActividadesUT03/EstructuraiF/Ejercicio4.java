package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        int n1 , n2;
        System.out.printf ( "%nComprueba si dos numeros son multiplos%n" );
        System.out.printf ( "Ingresa el primer número = " );
        n1 = obEntero ();
        System.out.printf ( "Ingresa el segundo número = " );
        n2 = obEntero ();
        if ( sonMultiplos ( n1 , n2 ) ){
            System.out.printf ( "%d y %d son múltiplos" , n1 , n2 );
        } else {
            System.out.printf ( "%d y %d no son múltiplos" , n1 , n2 );
        }

    }// fin ejecutarPrograma

    private static boolean sonMultiplos (int a , int b){
        boolean resp = false;

        // control errores
        int dividendo = (a > b) ? a : b;
        int divisor = (a > b) ? b : a;

        // resp = true en caso de que la division sea exacta entre ambos
        if ( dividendo % divisor == 0 ){
            resp = true;
        }
        return resp;

    }// fin sonMultiplos

    //<-- métodos secundarios -->//
    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio4
