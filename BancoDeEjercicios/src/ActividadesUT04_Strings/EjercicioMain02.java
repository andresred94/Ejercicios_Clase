package ActividadesUT04_Strings;

import java.util.Arrays;

public class EjercicioMain02 {

    public static void main ( String[] args ) {
        System.out.println (comprobarPosicion ( args ));
    }// fin main

    private static int comprobarPosicion (String[] cad){
        // si el array tiene 3 posiciones devuelve el número mayor de los 3
        if ( cad.length == 3 ){
            int n1 = Integer.parseInt ( cad[0] );
            int n2 = Integer.parseInt ( cad[1] );
            int n3 = Integer.parseInt ( cad[2] );
            if ( n1 < 0 || n2 < 0 || n3 < 0 ){
                return -1;
            }
            return Math.max ( n3 , (n1 > n2 ? n1 : n2) );
        } else { // si es distinto de 3 devuelve -1
            return -1;
        }

    }// fin comprobarPosicion

}// fin-class EjercicioMain02
