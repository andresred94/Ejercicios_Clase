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
        System.out.print(comprobarBisiesto(aIn));

        if ( esFechaCorrecta ( dIn , mIn , aIn ) ){
            System.out.printf ( "La fecha ingresada %d-%d-%d es correcta." , dIn , mIn , aIn );
        } else {
            System.out.printf ( "La fecha ingresada %d-%d-%d no correcta." , dIn , mIn , aIn );
        }

        lector.close ();
    }// fin ejecutarPrograma


    private static boolean esFechaCorrecta (int dia, int mes, int anio){
        boolean esCierto = false;

        if (comprobarBisiesto(anio)){// comprobarBisiesto == true
            // año bisiesto con meses con 30 dias
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30){
                esCierto = true;
            }
            // año bisiesto con meses con 31 dias
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia > 0 && dia <= 31) {
                esCierto = true;
            }
            // año bisiesto febrero
            if (mes == 2 && dia > 0 && dia <= 29){
                esCierto = true;
            }

        } else {// comprobarBisiesto == false
            // mes febrero
            if (mes == 2 && dia > 0 && dia <= 28){
                esCierto = true;
            }
            // meses con 30 dias
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 0 && dia <= 30){
                esCierto = true;
            }
            // meses con 31 dias
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia > 0 && dia <= 31) {
                esCierto = true;
            }

        }// fin-if comprobarBisiesto

        return esCierto;
    } // fin esFechaCorrecta

    private static boolean comprobarBisiesto(int anio){
        boolean esCierto;
        int multi4 , multi100 , multi400;
        multi4 = anio % 4;
        multi100 = anio % 100;
        multi400 = anio % 400;

        if (multi400 == 0){
            esCierto = true;
        } else if (multi4 == 0 && multi100 != 0) {
            esCierto = true;
        } else {
            esCierto = false;
        }
        return esCierto;
    }// fin comprobarBisiesto

    // <-- metodos secundarios --> //
    private static int obEntero(){
        int n = lector.nextInt();
        return n;
    }// fin obEntero


}// fin-class Ejercicio 12