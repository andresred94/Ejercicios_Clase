package ActividadesUT03.EstructuraSwitch;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Ejercicio3 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    private enum Dias {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO, ERROR}

    public static void ejecutarPrograma (){

        System.out.printf ( "%nDevuelve el día de la semana correspondiente%n" );
        System.out.printf ( "Ingresa un dia = " );
        int nIng = obenteroPositivo1_7 ();

        while ( nIng == -1 ){
            System.out.printf ( "Error : valor ingresa no válido." );
            System.out.printf ( "Ingresa un dia = " );
            nIng = obenteroPositivo1_7 ();
        }

        System.out.print ( "El dia de la semana es... " + diaSemana ( nIng ) );

        lector.close ();

    }// ejecutarPrograma

    private static Dias diaSemana ( int dia ){
        switch ( dia ){
            case 1:
                return Dias.LUNES;
            case 2:
                return Dias.MARTES;
            case 3:
                return Dias.MIERCOLES;
            case 4:
                return Dias.JUEVES;
            case 5:
                return Dias.VIERNES;
            case 6:
                return Dias.SABADO;
            case 7:
                return Dias.DOMINGO;
            default:
                return Dias.ERROR;
        }

    }// fin diaSemana

    private static int obenteroPositivo1_7 () {
        int n = lector.nextInt ();
        if ( n <= 0 || n > 7 ) {
            n = -1;
        }
        return n;
    }// fib obenteroPositivo1_7

}// fin-class Ejercicio3
