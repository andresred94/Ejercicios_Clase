package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma(){
        double gCent , gKelvin , gFaren , gReamur;

        System.out.printf ( "Introduce la temperatura en grados centigrados para mostrar su equivalente en Fahrenheit, Kelvin y Reamur%n" );

        gCent = lector.nextDouble ();
        // de celcius a kelvin
        gKelvin = gCent + 273.15;

        // de celcius a Fahrenhait
        gFaren = gCent * 1.8 + 32;

        // de celcius a Reamur
        gReamur = gCent * 0.8;

        System.out.printf ( "%nEl equivalente en grados Kelvin es: %.2f%n" , gKelvin );
        System.out.printf ( "%nEl equivalente en grados Fahrenhait es: %.2f%n" , gFaren );
        System.out.printf ( "%nEl equivalente en grados Reamur es: %.2f%n" , gReamur );

    }

    public static double obtNumero (){

        double nIngresado;

        nIngresado = lector.nextDouble ();

        return nIngresado;
    }// fin-obtNumero





}// fin-class Ejercicio5
