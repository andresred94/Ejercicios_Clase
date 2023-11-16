package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        int n1 , n2;
        System.out.printf ( "%nComprueba cual es el mayor número%n" );
        System.out.printf ( "Ingresa el primero número = " );
        n1 = obEntero ();
        System.out.printf ( "Ingresa el segundo número = " );
        n2 = obEntero ();
        System.out.printf ( "El mayor entre %d y %d es = %d" , n1 , n2 , mayorNumero ( n1 , n2 ) );

    }// fin ejecutarPrograma

    private static int mayorNumero (int a , int b){
        int resp = a > b ? a : b;
        return resp;
    }// fin mayorNumero


    //<-- métodos secundarios -->//
    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio5
