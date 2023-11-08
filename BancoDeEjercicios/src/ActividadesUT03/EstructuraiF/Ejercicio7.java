package ActividadesUT03.EstructuraiF;

import java.util.Scanner;

public class Ejercicio7 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- métodos principales --> //
    public static void ejecutarPrograma () {
        int numCalc , nIngresado;

        System.out.println ("Ingresa el número que deseas calcular sus cifras = ");
        numCalc = obNumero ();
        nIngresado = numCalc;

        int cantCifras = contarCifras ( numCalc );

        // mensaje de salida singular y plural
        if ( cantCifras > 1 ) {
            System.out.printf ( "%nEl número %d tiene %d cifras." , nIngresado , cantCifras);
        } else if ( cantCifras == 1 ) {
            System.out.printf ( "%nEl número %d tiene %d cifra." , nIngresado , cantCifras);
        }


    }// fin ejecutarPrograma

    private static int contarCifras ( int numero ){
        int cifras = 0;
        while ( numero >= 1 ) {
            numero = Math.round ( numero / 10 );// sale del bucle cuando es menor que 1
            cifras++;// aumenta en 1 cada division que se hace
        }

        if ( numero < 0 ){
            cifras = -1;
        }
        return cifras;
    }// fin contarCifras


    // <-- métodos secundarios --> //
    private static int obNumero () {
        int n;
        n = lector.nextInt ();
        return  n;
    }// fin obNumero


}// fin-class Ejercicio7
