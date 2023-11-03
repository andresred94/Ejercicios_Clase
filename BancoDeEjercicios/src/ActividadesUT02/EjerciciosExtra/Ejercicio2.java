package ActividadesUT02.EjerciciosExtra;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    // atributos
    static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double radio , aTotal;

        System.out.printf ( "%nIngresa el radio del circulo para calcular su área = " );
        radio = obDecimal ();
        aTotal = Math.PI * (Math.pow ( radio , 2 ));
        System.out.printf ( "El área del circulo es: %.2f%n" , aTotal );

    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal

}// fin-class Ejercicio2
