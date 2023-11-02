package ActividadesUT02.VariablesyOperaciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double dist , precio = 2.5 , total;
        int dias;

        System.out.printf ( "%nPara calcular el precio del billete primero ingresa la distancia a recorrer en Km = " );
        dist = obDecimal ();
        System.out.printf ( "Ingresa el número de días que vas a estar = " );
        dias = obEntero ();
        total = precio * dist;
        if ( dist > 800 && dias > 7 ){
            total = total - total * 0.3;
            System.out.printf ( "%nSe aplica una reducción del 30%% porque supera los 800km y los 7 dias" );
            System.out.printf ( "%nel precio del billete con la reducción es de = %.2f" , total );
        } else {
            System.out.printf ( "%nEl precio del billete es de = %.2f€" , total );
        }
    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal

    private static int obEntero () {
        int n;
        n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio5
