package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio04 {

    public static void ejecutarPrograma(){
        primitiva ();
    }// fin ejecutarPrograma


    private static int [] primitiva (){
        int [] primGen = new int [6];
        System.out.printf ( "Primitiva generada:%n" );
        for ( int i = 0 ; i < primGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 50) + 1;
            primGen [i] = nRan;
        }
        System.out.printf ( Arrays.toString ( primGen ) );
        return primGen;

    }// fin primitiva

}// fin-class Ejercicio05
