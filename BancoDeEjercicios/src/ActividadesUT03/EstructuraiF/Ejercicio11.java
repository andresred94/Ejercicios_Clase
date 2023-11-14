package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio11 {
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
        if (mes == 2 && dia > 0 && dia <= 28){
            if (anio > 0){
                esCierto = true;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30){
            if (anio > 0){
                esCierto = true;
            }
        }
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia > 0 && dia <= 31) {
            if (anio > 0) {
                esCierto = true;
            }
        }
        return esCierto;
    } // fin esFechaCorrecta


    // <-- metodos secundarios --> //
    private static int obEntero(){
        int n = lector.nextInt();
        return n;
    }// fin obEntero

}// fin-class Ejercicio11
