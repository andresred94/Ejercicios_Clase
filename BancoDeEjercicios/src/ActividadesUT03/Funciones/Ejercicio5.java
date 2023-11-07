package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma (){
        double rIngresado , aTotal;
        System.out.printf ( "%nBienvenid@ a la calculadora del area de un circulo%n" );
        System.out.printf ( "Ingresa el radio del circulo para calcular su longitud = " );
        rIngresado = obDecimal ();

        // control errores
        while ( areaCirculo ( rIngresado ) == -1 ){
            System.out.printf ( "Error : el radio ingresado no es válido." );
            System.out.printf ( " Ingresa el radio del circulo para calcular su longitud = " );
            rIngresado = obDecimal ();
        }

        // realiza el calculo
        aTotal = areaCirculo ( rIngresado );

        System.out.printf ( "El área del circulo es: %.0f%n" , aTotal );

    }// fin ejecutarPrograma


    //<-- métodos secundarios -->//
    private static double areaCirculo(double radio){
        if ( radio < 0 ){
            return -1;
        }
        return Math.PI * Math.pow ( radio , 2 );
    }// fin areaCirculo

    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal

}// fin-class Ejercicio5
