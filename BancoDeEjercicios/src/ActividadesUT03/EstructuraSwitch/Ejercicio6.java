package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio6 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf ( "%nDevuelve el mes y la estación a la que corresponden...%n" );
        System.out.printf ( "Ingresa un mes = " );
        int mIng = obenteroPos1Doce ();

        // control de errores
        while ( mIng == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido.%n" );
            System.out.printf ( "Ingresa un mes = " );
            mIng = obenteroPos1Doce ();
        }

        System.out.printf ( "%s" , mesDelanio ( mIng ) );

    }// fin ejecutarPrograma

    private static String mesDelanio ( int mes ){
        String resp ;
        switch ( mes ){
            case 1:
                resp = "Enero : Invierno";
                break;
            case 2:
                resp = "Febrero : Invierno";
                break;
            case 3:
                resp = "Marzo : Invierno";
                break;
            case 4:
                resp = "Abril : Primavera";
                break;
            case 5:
                resp = "Mayo : Primavera";
                break;
            case 6:
                resp = "Junio : Primavera";
                break;
            case 7:
                resp = "Julio : Verano";
                break;
            case 8:
                resp = "Agosto : Verano";
                break;
            case 9:
                resp = "Septiembre : Verano";
                break;
            case 10:
                resp = "Ocubre : Otoño";
                break;
            case 11:
                resp = "Noviembre : Otoñó";
                break;
            case 12:
                resp = "Diciembre : Otoño";
                break;
            default:
                resp = "Mes no válido";
                break;
        }
        return resp;
    }// fin mesDelanio

    private static int obenteroPos1Doce (){
        int n = lector.nextInt ();
        // control de errores
        if ( n < 0 || n > 12 ){
            n = -1;
        }
        return n;
    }

}// fin-class Ejercicio6
