package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf ( "%nComprueba si es un día laborable...%n" );
        System.out.printf ( "Ingresa un día (p.ej. 4) = " );
        int nIng = obenteroPositivo1_7 ();

        while ( nIng == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido." );
            System.out.printf ( "Ingresa un día (p.ej. 4) = " );
            nIng = obenteroPositivo1_7 ();
        }

        System.out.print (esLaborable ( nIng ));


    }// fin ejecutarPrograma

    private static boolean esLaborable ( int dia ){
        boolean esCierto;
        switch ( dia ){
            case 1,2,3,4,5:
                return esCierto = true;
            case 6,7:
                return esCierto = false;
            default:
                return esCierto = false;
        }

    }// fin esLaborable

    private static int obenteroPositivo1_7 () {
        int n = lector.nextInt ();
        if ( n <= 0 || n > 7 ) {
            n = -1;
        }
        return n;
    }// fib obenteroPositivo1_7

}// fin-class Ejercicio4
