package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio1 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    private enum Notas {INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE,ERROR}

    public static void ejecutarPrograma(){

        System.out.printf ( "%nComprueba si has aprobado o suspendido%n" );
        System.out.printf ( "Ingresa tu nota = " );
        int nIngresada = obEntPos010 ();

        // control errores
        while ( nIngresada == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido.%n" );
            System.out.printf ( "Ingresa tu nota = " );
            nIngresada = obEntPos010 ();
        }

        System.out.print ( "Tu nota es = " + obtenerNota ( nIngresada ) );


    }// fin ejecutarPrograma

    private static Notas obtenerNota (int nota){
        switch ( nota ){
            case 0,1,2,3,4:
                return Notas.INSUFICIENTE;
            case 5:
                return Notas.SUFICIENTE;
            case 6:
                return Notas.BIEN;
            case 7,8:
                return Notas.NOTABLE;
            case 9,10:
                return Notas.SOBRESALIENTE;
            default:
                return Notas.ERROR;
        }


    }// fin obtenerNota

    private static int obEntPos010 (){
        int n = lector.nextInt ();
        // control errores
        if ( n < 0 || n > 10){
            n = -1;//ToDo ¿valor centinela?
        }
        return n;
    }// fin onEntPos010

}// fin-class Ejercicio1
