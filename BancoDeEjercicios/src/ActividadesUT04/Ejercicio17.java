package ActividadesUT04;

import java.util.Scanner;

public class Ejercicio17 {

    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        int [] conjNum = {1,2,3,4,5,6,1,2,7,8,1};
        busquedaNumeros ( conjNum );

    }// fin ejecutarPrograma

    /**
     * Función que busca un número ingresado por teclado dentro de un array ingresado por parámetro.
     * Finaliza la busqueda cuando se ingresa 'n'
     * @param numeros array donde se buscará el número
     */
    private static void busquedaNumeros(int [] numeros){
        char s = 'n';
        do {
            System.out.printf ( "Ingresa el número que quieres buscar = " );
            int nIn = lector.nextInt ();
            boolean encontrado = false;
            int vecesEncontrado = 0;

            // recorrer cada indice y cuenta cuantas veces es igual al número ingresado por teclado
            for ( int i = 0 ; i < numeros.length ; i++ ) {
                if ( numeros[i] == nIn  ){
                    encontrado = true;
                    vecesEncontrado++;
                }
            }

            if ( encontrado ){// En caso de que se encuentre el número
                // mensaje en singular y plural
                if ( vecesEncontrado > 1 ) {
                    System.out.printf ( "El número %d ha sido encontrado %d veces%n", nIn , vecesEncontrado );
                } else if ( vecesEncontrado == 1) {
                    System.out.printf ( "El número %d ha sido encontrado %d vez%n", nIn , vecesEncontrado );
                }// fin if

            } else {// En caso de que NO se encuentre el número
                System.out.printf ( "%d no ha sido encontrado.%n" , nIn );
            }// fin if

            System.out.printf ( "¿Deseas seguir buscando?(s/n) = " );
            s = obtenerCharMinuscula ();

        } while ( s != 'n' );

    }// busquedaNumeros

    private static char obtenerCharMinuscula(){
        char n = lector.next ().charAt ( 0 );
        n = Character.toLowerCase ( n );
        return n;
    }

}// fin-class Ejercicio17
