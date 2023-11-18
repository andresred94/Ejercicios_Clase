package ActividadesUT03.BucleFor;

public class Ejercicio7 {
    public static void imprimirTrianguloDescendente ( int n ) {
        System.out.printf ( "%nImprime un triángulo de asteriscos descendente%n" );

        // Control de errores

        if ( n >= 0 ) {

            for ( int i = 0 ; i <= n ; i++ ) {
                // Asteriscos decrecientes
                for ( int j = 0 ; j < n - i ; j++ ) {//(j < n - 1) para que en la siguiente vuelta imprima uno menos
                    System.out.printf ( "*" );
                }

                System.out.printf ("%n");
            }// fin-for

        } else {
            System.out.printf ( "Error: parámetro no válido." );
        }


    }// fin imprimirTrianguloDescendente

}// fin-class Ejercicio7
