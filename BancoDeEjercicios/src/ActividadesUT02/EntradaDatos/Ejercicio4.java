package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma(){
        // atributos
        int a , b , c;

        System.out.printf ( "Ingresa tres números para calcular la media de estos.%n" );

        a = lector.nextInt ();
        b = lector.nextInt ();
        c = lector.nextInt ();

        System.out.printf ( "%nLa media de los tres numeros es %d", ((a + b + c ) / 3) );


    }// fin-ejecutarPrograma



    // <-- Metodos secundarios -->
    public static int obtNumero (){

        int nIngresado;

        System.out.printf("%nIngresa un entero: ");
        nIngresado = lector.nextInt();
        lector.nextLine ();

        return nIngresado;
    }// fin-obtNumero



}// fin-class Ejercicio4
