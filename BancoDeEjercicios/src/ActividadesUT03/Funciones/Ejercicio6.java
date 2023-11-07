package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        double nUno , nDos , nTres ;
        System.out.printf ( "%nCalculadora de media de las notas" );
        System.out.printf ( "%nIngresa la primera nota = " );
        nUno = obDecimal ();
        System.out.printf ( "Ingresa la segunda nota = " );
        nDos = obDecimal ();
        System.out.printf ( "Ingresa la tercera nota = " );
        nTres = obDecimal ();
        System.out.printf ( "La nota media es = %.1f%n" , mediaNotas ( nUno , nDos , nTres ) );


    }// fin ejecutarPrograma

    //<-- métodos secundarios -->//

    private static double mediaNotas(double n1 , double n2 , double n3){
        return (n1+n2+n3) / 3;
    }// fin mediaNotas

    private static double obDecimal () {
        double n;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        n = lector.nextDouble ();
        return n;
    }// fin obDecimal



}// fin-class Ejercicio6
