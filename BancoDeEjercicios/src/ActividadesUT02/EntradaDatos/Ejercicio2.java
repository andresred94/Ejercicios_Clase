package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio2 {

    //atributos
    static Scanner lector = new Scanner ( System.in );

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma(){
        char caracter;
        caracter = obtChar ();

        System.out.printf ( "%nEl caracter introducido es %c",caracter );

    }//fin-ejecutarPrograma

    // <-- Metodos secundarios -->
    public static char obtChar (){

        char charIntroducido;

        System.out.printf ("%nIntroduce un caracter ");
        charIntroducido = lector.next ().charAt ( 0 );

        return charIntroducido;
    }// fin-obtenerNombre


}// fin-class LeerCaracter

