package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio2 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf ( "Comprueba cuantos dias tiene el mes...%n" );
        System.out.printf ( "Ingresa un mes del 1 al 12 = " );
        int mes = obEntPos1doce ();

        // control de errores
        while ( mes == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido.%n" );
            System.out.printf ( "Ingresa un mes del 1 al 12 = " );
            mes = obEntPos1doce ();
        }

        System.out.printf("El mes ingresado tiene %d dias" , diasDelMes ( mes ));

    }// fin ejecutarPrograma

    private static int diasDelMes (int mes){
        int diasDelMes = 0;
        switch ( mes ){
            case 1,3,5,7,8,10,12:
                diasDelMes = 31;
                break;
            case 2:
                diasDelMes = 28;
                break;
            case 4,6,9,11:
                diasDelMes = 30;
                break;
        }
        return diasDelMes;


    }// fin diasDelMes

    private static int obEntPos1doce (){
        int n = lector.nextInt ();
        // control de errores
        if ( n < 0 || n > 12 ){
            n = -1;
        }
        return n;
    }


}// fin-class Ejercicio2
