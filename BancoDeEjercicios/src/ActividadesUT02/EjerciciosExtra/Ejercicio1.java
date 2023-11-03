package ActividadesUT02.EjerciciosExtra;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double a , b , c;
        System.out.println ("Programa que calcula las soluciones de una ecuación cuadrática");

        System.out.printf ( "Ingresa el valor de a = " );
        a = obDecimal ();
        System.out.printf ( "Ingresa el valor de b = " );
        b = obDecimal ();
        System.out.printf ( "Ingresa el valor de c = " );
        c = obDecimal ();

        // calcular el discriminante (b^2 - 4*a*c)
        double discriminante = b * b - 4 * a * c;

        if ( discriminante > 0 ) {
            double x1 = (-b + Math.sqrt ( discriminante )) / ( 2 * a );
            double x2 = (-b - Math.sqrt ( discriminante )) / ( 2 * a );
            System.out.printf ( "%nLas soluciones son: x1 = %.0f , x2 = %.0f" , x1 , x2 );
        } else if ( discriminante == 0 ) {
            double x1 = -b / ( 2 * a );
            System.out.printf ( "%nLa solución doble es: x = %.0f" , x1 );
        } else {
            System.out.printf ( "%nEl discriminante es negativo por lo tanto tiene soluciones con números reales" );
        }

    }// fin ejecutarPrograma


    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal
}// fin-class Ejericio1
