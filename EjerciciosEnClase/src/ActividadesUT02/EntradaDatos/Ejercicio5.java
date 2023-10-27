package ActividadesUT02.EntradaDatos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    static Scanner lector = new Scanner(System.in);


    // <-- Metodos pricipales -->
    public static void ejecutarPrograma(){
        double gCent , gKelvin , gFaren , gReamur;

        System.out.printf ( "Introduce la temperatura en grados centigrados para mostrar su equivalente en Fahrenheit, Kelvin y Reamur%n" );

        gCent = obtNumero();
        // de celcius a kelvin
        gKelvin = gCent + 273.15;

        // de celcius a Fahrenhait
        gFaren = gCent * 1.8 + 32;

        // de celcius a Reamur
        gReamur = gCent * 0.8;

        System.out.printf ( "El equivalente en grados Kelvin es: %.2f%n" , gKelvin );
        System.out.printf ( "El equivalente en grados Fahrenhait es: %.2f%n" , gFaren );
        System.out.printf ( "El equivalente en grados Reamur es: %.2f%n" , gReamur );

    }// fin-ejecutarPrograma

    //-- METODOS SECUNDARIOS --//
    public static double obtNumero (){

        double nIngresado;

        lector.useLocale(Locale.ENGLISH);// permite leer un double con punto

        nIngresado = lector.nextDouble ();

        return nIngresado;

    }// fin-obtNumero

}// fin-class Ejercicio5
