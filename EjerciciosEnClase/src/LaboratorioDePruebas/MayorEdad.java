package LaboratorioDePruebas;

import java.util.Locale;
import java.util.Scanner;

public class MayorEdad {

    // atributos
    static Scanner lector = new Scanner(System.in);


    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        int edad;
        boolean mayorEdad;
        System.out.println( "Ingrea tu edad para comprobar si eres mayor de edad" );
        edad = obtNumero();

        System.out.println(esMayorDeEdad(edad));



    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    public static int obtNumero (){

        int nIngresado;
        nIngresado = lector.nextInt ();
        return nIngresado;

    }// fin-obtNumero

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }


}// fin-class MayorEdad
