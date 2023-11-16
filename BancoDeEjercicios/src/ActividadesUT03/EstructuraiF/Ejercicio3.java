package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio3 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        int nIngresado;
        System.out.printf ( "%nComprueba si es par o impar%n" );
        System.out.printf ( "Ingresa un número = " );
        nIngresado = obEntero ();
        System.out.println (parOimpar ( nIngresado ));


    }// fin ejecutarPrograma

    private static String parOimpar (int numero){
        String resp;
        int resto = numero % 2;
        if ( resto == 0 ){
            resp = "Es par";
        } else {
            resp = "Es impar";
        }
        return resp;
    }// fin parOimpar

    //<-- métodos secundarios -->//
    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio3
