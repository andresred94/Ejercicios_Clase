package ActividadesUT03.BucleFor;

public class Ejercicio8 {
    public static void imprimirTrianguloAscendente ( int n ) {

        System.out.printf ( "%nImprime un triangulo de asteriscos ascendente%n" );


        if ( n >= 0 ){

            for ( int i = 0 ; i <= n ; i++ ) {
                for ( int j = 0 ; j < i  ; j++ ) {//(j < i) j siempre es menor que i por lo tanto imprime hasta i - 1
                    System.out.printf ( "*" );
                }
                System.out.printf ( "%n" );
            }

        } else {
            System.out.printf ( "Error : has ingresado un valor no válido." );
        }

    }// fin imprimirTrianguloDescendente
}// fin-class Ejercicio8
