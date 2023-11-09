package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio1 {

    //atributos
    protected static Scanner lector = new Scanner ( System.in );

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma (){
        // atributos
        String nombre;

        System.out.printf ( "Hola, bienvenido a mi programa" );
        nombre = obtString ();
        System.out.printf ( "%n¡Saludos! %s",nombre );

    }// fin-ejecutarPrograma


    // <-- Metodos secundarios -->
    private static String obtString (){

        String nomIntroducido;

        System.out.printf ("%n¿Como te llamas? ");
        nomIntroducido = lector.nextLine ();

        return nomIntroducido;
    }// fin-obtenerNombre


}// fin-class LeeTuNombre
