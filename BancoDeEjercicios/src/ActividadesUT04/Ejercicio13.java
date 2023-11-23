package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio13 {

    public static void ejecutarPrograma(){

        System.out.println (filtrarPares ( new int [] {2,3,4,5,6,7,8} ) );

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
        int [] contPares = new int [contPar];


        for ( int i = 0 ; i < numeros.length ; i++ ) {

            if ( n % 2 == 0 ){
                for ( int j = 0 ; j < contPares.length ; j++ ) {
                    contPares[j] = n;
                }
                esCierto = true;
            } else {
                esCierto = false;
            }
            if ( esCierto ){
                n = numeros[i];

            }

        }



        //System.out.println ( Arrays.toString ( contPares ) );

        return contPares;
    }// filtrarPares

    //private static int contarTarrays1D ()

}// fin-class Ejercicio13
