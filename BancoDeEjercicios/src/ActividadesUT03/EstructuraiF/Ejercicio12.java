package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio12 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    // <-- metodos principales --> //
    public static void ejecutarPrograma(){
        int dIn ,mIn , aIn;
        System.out.printf ( "%nComprueba si una fecha es correcta%n" );
        System.out.printf ( "Ingresa el dia en formato dd = " );
        dIn = obEntero ();
        System.out.printf ( "Ingresa el mes en formato mm = " );
        mIn = obEntero ();
        System.out.printf ( "Ingresa el año en formato aaaa = " );
        aIn = obEntero ();

        if ( esFechaCorrecta ( dIn , mIn , aIn ) ){
            System.out.printf ( "La fecha ingresada %d-%d-%d es correcta." , dIn , mIn , aIn );
        } else {
            System.out.printf ( "La fecha ingresada %d-%d-%d es no correcta." , dIn , mIn , aIn );
        }

        lector.close ();
    }// fin ejecutarPrograma


    private static boolean esFechaCorrecta (int dia, int mes, int anio){
        boolean esCierto = false;
        if ( dia >= 1 && dia <= 31 ){
            if ( mes >= 1 && mes <= 12 ){
                if ( anio >=1 ){
                    esCierto = true;
                }
            }
        }
        return esCierto;
    } // fin esFechaCorrecta


    // <-- metodos secundarios --> //
    private static int obEntero(){
        int n = lector.nextInt();
        return n;
    }// fin obEntero


}// fin-class Ejercicio 12