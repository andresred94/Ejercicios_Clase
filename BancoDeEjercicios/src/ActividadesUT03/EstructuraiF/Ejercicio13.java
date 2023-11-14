package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio13 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){
        int dIn ,mIn , aIn;
        System.out.printf ( "%nComprueba si una fecha es correcta%n" );
        System.out.printf ( "Ingresa el dia en formato dd = " );
        dIn = obEntero ();

        // control errores
        while (dIn == -1){
            System.out.printf("Error : has ingreado un valor no válido");
            System.out.printf ( "Ingresa el dia en formato dd = " );
            dIn = obEntero ();
        }
        System.out.printf ( "Ingresa el mes en formato mm = " );
        mIn = obEntero ();

        // control errores
        while (mIn == -1){
            System.out.printf("Error : has ingreado un valor no válido");
            System.out.printf ( "Ingresa el mes en formato mm = " );
            mIn = obEntero ();
        }

        System.out.printf ( "Ingresa el año en formato aaaa = " );
        aIn = obEntero ();

        // control errores
        while (aIn == -1){
            System.out.printf("Error : has ingreado un valor no válido");
            System.out.printf ( "Ingresa el mes en formato mm = " );
            mIn = obEntero ();
        }
        System.out.printf ( "%s" , obtenerDiaSiguiente ( dIn , mIn , aIn ) );

        lector.close ();

    }// fin ejecutarPrograma

    private static String obtenerDiaSiguiente(int dia , int mes , int anio){
        String frase = "";
        if ( esFechaCorrecta ( dia , mes , anio ) ) {
            // if - calcularAnioBisiesto = true
            if ( comprobarBisiesto ( anio ) ) {
                if ( dia == 29 && mes == 2 ) {// febrero
                    dia = 0;
                    dia++;
                    mes++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( dia == 30 ) {// meses que tienen los dias 30
                    dia = 0;
                    mes = 0;
                    dia++;
                    mes++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( mes == 12 && dia == 31 ) {//meses que tienen los dias 31
                    dia = 0;
                    mes = 0;
                    dia++;
                    mes++;
                    anio++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( dia == 31 ) {// fin de año
                    mes = 0;
                    dia = 0;
                    mes++;
                    dia++;
                    frase = dia + "-" + mes + "-" + anio;
                } else {
                    dia++;
                    frase = dia + "-" + mes + "-" + anio;
                }
            } else {// if - comprobarBisiesto = false

                if ( dia == 28 && mes == 2 ) {// febrero
                    dia = 0;
                    dia++;
                    mes++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( dia == 30 ) {// meses que tienen los dias 30
                    dia = 0;
                    mes = 0;
                    dia++;
                    mes++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( mes == 12 && dia == 31 ) {//meses que tienen los dias 31
                    dia = 0;
                    mes = 0;
                    dia++;
                    mes++;
                    anio++;
                    frase = dia + "-" + mes + "-" + anio;
                } else if ( dia == 31 ) {// fin de año
                    mes = 0;
                    dia = 0;
                    mes++;
                    dia++;
                    anio++;
                    frase = dia + "-" + mes + "-" + anio;
                } else {
                    dia++;
                    frase = dia + "-" + mes + "-" + anio;
                }
            }// fin-if calcularBisiesto
        }
        return frase;
    }// fin obtenerDiaSiguiente


    private static boolean esFechaCorrecta (int dia, int mes, int anio){
        boolean esCierto = false;

        if (comprobarBisiesto(anio)){
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

        } else { // comprobarBisiesto == false
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
        if (n < 0){
            n = -1;
        }
        return n;
    }// fin obEntero

}// fin-class Ejercicio13
