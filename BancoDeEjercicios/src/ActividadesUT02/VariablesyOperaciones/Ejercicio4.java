package ActividadesUT02.VariablesyOperaciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    protected static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double peso , estatura , result;

        System.out.printf ( "%nBienvenido a la calculadora de IMC" );
        System.out.printf ( "%nIngresa tu peso en Kg = " );
        peso = obDecimal ();
        System.out.printf ( "%nIngresa tu estatura en metros = " );
        estatura = obDecimal ();

        result = peso / Math.pow ( estatura , 2 );

        System.out.printf ( "Tu IMC es de = %.2f%%" , result );

    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    private static double obDecimal (){
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin-obDecimal

}// fin-class Ejercicio4
