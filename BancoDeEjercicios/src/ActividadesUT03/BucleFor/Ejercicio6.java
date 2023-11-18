package ActividadesUT03.BucleFor;

import java.util.Scanner;

public class Ejercicio6 {
    //atributos
    private static final Scanner lector = new Scanner(System.in);

    public static void imprimirCuadrado (int n){

        System.out.printf ( "%nImprime un cuadrado de asteriscos%n" );

        if ( n >= 0 ){
            if ( n >= 0 ){
                for ( int i = 0 ; i < n ; i++ ) {
                    for ( int j = 0 ; j < n  ; j++ ) {/// j < n porque cada fila tiene 5 asteriscos
                        System.out.printf ( "*" );
                    }
                    System.out.printf ( "%n" );// cuando imprime los 5 * hace el salto de página
                }
            }
        }

    }// fin imprimirCuadrado

}// fin-class Ejercicio6
