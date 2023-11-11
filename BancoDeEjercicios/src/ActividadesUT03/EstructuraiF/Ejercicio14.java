package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio14 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma () {
        int dIn, mIn, aIn;
        System.out.printf ( "%nComprueba si una fecha es correcta%n" );
        System.out.printf ( "y te devuelve el día siguiente en formato dd-mm-aaaa...%n" );

        System.out.printf ( "Ingresa el dia en formato dd = " );
        dIn = obEntero ();
        while ( dIn == -1 || dIn > 31) {// control de errores
            System.out.printf ( "Día no válido ingresa otro día = " );
            dIn = obEntero ();
        }

        System.out.printf ( "Ingresa el mes en formato mm = " );
        mIn = obEntero ();
        while ( mIn == -1 || mIn > 12) {// control de errores
            System.out.printf ( "Mes no válido ngresa otro mes = " );
            mIn = obEntero ();
        }

        System.out.printf ( "Ingresa el año en formato aaaa = " );
        aIn = obEntero ();
        while ( aIn == -1 ) {// control de errores
            System.out.printf ( "Año no válido ingresa otro año = " );
            aIn = obEntero ();
        }
        System.out.printf ( "%s" , obtenerDiaSiguiente ( dIn , mIn , aIn ) );

        lector.close ();

    }// fin ejecutarPrograma

    private static String obtenerDiaSiguiente ( int dia , int mes , int anio ) {
        String frase = "";
        if ( esFechaCorrecta ( dia , mes , anio ) ) {
            // if - calcularAnioBisiesto = true
            if ( calcularAnioBisiesto ( anio ) ) {
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
                }else {
                    dia++;
                    frase = dia + "-" + mes + "-" + anio;

                }

            } else {// if - calcularAnioBisiesto = false

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
            }
        }

        return frase;
    }// fin obtenerDiaSiguiente


    private static boolean esFechaCorrecta ( int dia , int mes , int anio ) {
        boolean esCierto = false;
        if ( dia >= 1 && dia <= 31 ) {
            if ( mes >= 1 && mes <= 12 ) {
                if ( anio >= 1 ) {
                    esCierto = true;
                }
            }
        }
        return esCierto;
    } // fin esFechaCorrecta

    public static boolean calcularAnioBisiesto ( int anio ) {
        int multi4, multi100, multi400;
        boolean esBisiesto;


        multi4 = anio % 4;
        multi100 = anio % 100;
        multi400 = anio % 400;

        if ( multi4 == 4 && multi100 != 0 ) {
            esBisiesto = true;
        } else if ( multi100 == 0 && multi400 == 0 ) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }

        return esBisiesto;

    }// fin ejecutarPrograma


    // <-- metodos secundarios --> //
    private static int obEntero () {
        int n = lector.nextInt ();
        if ( n < 0 ) {
            System.out.println ( "Error: no has ingresado un dato válido" );
            n = -1;
        }
        return n;
    }// fin obEntero

}// fin-class Ejercicio14
