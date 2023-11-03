package ActividadesUT02.EjerciciosExtra;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    // atributos
    private static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double radio , aTotal;

        System.out.printf ( "%nIngresa el radio del circulo para calcular si longitud = " );
        radio = obDecimal ();
        aTotal = 2 * Math.PI * radio;
        System.out.printf ( "La longitud del circulo es: %.2f%n" , aTotal );

    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        lector.close ();
        return n;
    }// fin obDecimal


}// fin-class Ejercicio3
