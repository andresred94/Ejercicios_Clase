package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio13 {

    public static void ejecutarPrograma(){

        filtrarPares ( new int [] {2,3,4,5,6,7,8} );

    }

    private static int [] filtrarPares(int [] numeros){

        int contPar = 0 , n = 0;
        boolean esCierto = false;


        for ( int i = 0 ; i < numeros.length ; i++ ) {
            n = numeros[i];
            System.out.printf ("%d ",n);
             if ( n % 2 == 0 ){
                 contPar++;
             }
        }
        System.out.printf ( "%n%d %n",contPar );
        int[] contienePares = new int[contPar];
        int indiceContPares = 0;

        // Segundo bucle para almacenar números pares en contPares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contienePares[indiceContPares] = numeros[i];
                indiceContPares++;
            }
        }
        System.out.println ( Arrays.toString ( contienePares ) );

        return contienePares;

    }// filtrarPares

}// fin-class Ejercicio13
