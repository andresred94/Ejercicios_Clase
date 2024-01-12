package LaboratorioDePruebas.PrimeraEva;

import java.util.Scanner;

public class ContarCifras {
    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- métodos principales --> //
    public static void ejecutarPrograma () {
        int numCalc , cifras = 0 , nIngresado;

        System.out.println ("Ingresa el número que deseas calcular sus cifras: ");
        numCalc = obNumero ();
        nIngresado = numCalc;

        // mientras el número ingresado sea mayor a 1, realiza la división
        while ( numCalc >= 1 ) {
            numCalc = Math.round ( numCalc / 10 );// sale del bucle cuando es menor que 1
             cifras++;// aumenta en 1 cada division que se hace
        }

        // mensaje de salida singular y plural
        if ( cifras > 1 ) {
            System.out.printf ( "%nEl número %d tiene %d cifras." , nIngresado , cifras);
        } else if ( cifras == 1 ) {
            System.out.printf ( "%nEl número %d tiene %d cifra." , nIngresado , cifras);
        }


    }// fin ejecutarPrograma

    // <-- métodos secundarios --> //
    public static int obNumero () {
        int n;
        n = lector.nextInt ();
        return  n;
    }// fin obNumero

}// fin-class ContarCifras
