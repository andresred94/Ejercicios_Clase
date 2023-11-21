package ActividadesUT03.EstructuraiF;

import java.util.Scanner;

public class Ejercicio1 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma (){
        int n1 , n2;
        System.out.printf ( "%nComprueba si dos números son iguales o no...%n" );
        System.out.printf ( "Ingresa el primer número = " );
        n1 = obEntero ();
        System.out.printf ( "Ingresa el segundo número = " );
        n2 = obEntero ();
        if ( sonIguales ( n1 , n2 ) ){
            System.out.printf ( "%d y %d son iguales%n" , n1 , n2 );
        } else {
            System.out.printf ( "%d y %d no son iguales%n" , n1 , n2 );
        }



    }// fin ejecutarPrograma

    private static boolean sonIguales (int a , int b){
        boolean resp = false;
        if ( a == b ){
            resp = true;
        }
        return resp;
    }// fin sonIguales

    //<-- métodos secundarios -->//
    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero


}// fin-class Ejercicio1
