package ActividadesUT03.BucleFor;

import java.util.Scanner;

public class Ejercicio4 {
    //atributos
    private static final Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma (){

        System.out.printf ( " %nCuenta ovejas...%n" );
        System.out.printf ( "Ingresa la cantidad de ovejas = " );
        int cantOvejas = obtenerEnetero ();
        // control de errores
        while ( cantOvejas == -1 ){
            System.out.printf ( "No puede haber un número negativo de ovejas...%n" );
            System.out.printf ( "Ingresa otra cantidad = " );
            cantOvejas = obtenerEnetero ();
        }

        contarOvejas ( cantOvejas );


    }// fin ejecutarPrograma

    private static void contarOvejas( int numOvejas){

        for ( int i = 1 ; i <= numOvejas  ; i++ ) {
            if ( i == 1 ){
                System.out.printf ( "%d oveja...%n" , i );
            } else {
                System.out.printf ( "%d ovejas...%n" , i );
            }
        }

    }// fin contarOvejas

    private static int obtenerEnetero(){
        int n = lector.nextInt();
        if ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEntero1_3

}// fin-class Ejercicio4
