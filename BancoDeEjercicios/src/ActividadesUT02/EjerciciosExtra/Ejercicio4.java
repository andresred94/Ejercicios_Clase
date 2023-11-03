package ActividadesUT02.EjerciciosExtra;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    private static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma(){
        double lado , aTotal , pTotal;
        System.out.printf ( "%nIngresa el lado de un triángulo equilatero = " );
        lado = obDecimal ();
        aTotal = (Math.sqrt ( 3 )  / 4) * (Math.pow ( lado , 2 ));
        pTotal = lado * 3;
        System.out.printf ( "El área total del triángulo equilatero es = %.2f" , aTotal );
        System.out.printf ( "%nEl perímetro total del triángulo equilatero es = %.2f%n" , pTotal );
    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        lector.close ();
        return n;
    }// fin obDecimal

}// fin-class Ejercicio4
