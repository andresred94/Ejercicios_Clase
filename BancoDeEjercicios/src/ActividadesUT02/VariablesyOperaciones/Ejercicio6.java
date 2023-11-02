package ActividadesUT02.VariablesyOperaciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

    // atributos
    private static Scanner lector = new Scanner(System.in);
    private static final double FConversion = 11.70;

    public static void ejecutarPrograma (){
        double consumo , precio , total;
        System.out.printf ( "%nIngresa los metros cúbicos que has consumido = " );
        consumo = obDecimal ();
        System.out.printf ( "¿Cual es el precio por kWh? =  " );
        precio = obDecimal ();
        total = (consumo * FConversion) * precio;
        System.out.printf ( "%nEl total a pagar en tu factura es de %.2f" , total );

    }// fin ejecutarPrograma

    //<-- metodos principales -->//

    //<-- metodos secundarios -->//
    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal


}// fin-class Ejercicio6
