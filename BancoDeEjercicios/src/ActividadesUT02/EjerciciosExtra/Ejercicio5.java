package ActividadesUT02.EjerciciosExtra;

import java.util.Scanner;

public class Ejercicio5 {

    // atributos
    private static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        int a , b , c , d , media;
        System.out.printf ( "%nIntroduce 4 valores enteros para calcular su media%n" );
        System.out.printf ( "%nvalor 1 = " );
        a = obEntero ();
        System.out.printf ( "%nvalor 2 = " );
        b = obEntero ();
        System.out.printf ( "%nvalor 3 = " );
        c = obEntero ();
        System.out.printf ( "%nvalor 4 = " );
        d = obEntero ();

        media =  (a + b + c + d) / 4;

        System.out.printf ( "%nLa media de los 4 valores es = %d" , media );

    }// fin ejecutarPrograma


    //<-- metodos secundarios -->//
    private static int obEntero () {
        int n;
        n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio5
