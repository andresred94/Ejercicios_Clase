package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio9 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){
        int nIngresado;
        System.out.printf ( "%nComprueba si el número es capicúa = " );
        nIngresado = obEntero09999 ();

        // control de errores
        while ( nIngresado <= -1 ){
            System.out.printf("Error : número ingresado no válido.");
            System.out.printf("%nIngresa otro número = ");
            nIngresado = obEntero09999 ();
        }

        // comprueba que en número es igual si es invertido
        if (esCapicua(nIngresado)){
            System.out.printf("%d es un número capicúa." , nIngresado);
        } else {
            System.out.printf("%d no es un número capicúa." , nIngresado);
        }

    }// fin ejecutarPrograma

    private static boolean esCapicua ( int numero) {
        boolean capi = false;
        int nInvertido = invertirCifras( numero );
        if (numero == nInvertido) {
            capi = true;
        }
        return capi;

    }// fin esCapicua

    private static int invertirCifras (int numero){
        int cifra , nNumero = 0;
        while (numero != 0){
            cifra = numero % 10 ;
            numero = numero / 10;
            nNumero = nNumero * 10 + cifra;
        }

        return nNumero;
    }// fin invertirCifras

    private static int obEntero09999 (){
        int n = lector.nextInt ();
        // control errores
        while ( n < 0 && n > 9999 ){
            n = -1;
        }
        return n;
    }// fin obEntero

}// fin-class Ejercicio9