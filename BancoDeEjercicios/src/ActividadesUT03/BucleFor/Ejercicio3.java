package ActividadesUT03.BucleFor;

import java.util.Scanner;

public class Ejercicio3 {
    //atributos
    private static final Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma (){
        System.out.printf ( "%nCalcula la tabla de multiplicar del número ingresado%n" );
        System.out.printf ( "Ingresa un número = " );
        int nIn = obtenerEnetero1_10 ();

        tablasDeMultiplicar ( nIn );
    }// fin ejecutarPrograma

    private static void tablasDeMultiplicar (int n){
        int multi;
        System.out.printf ( "Tabla de multiplicar de %d%n" , n);
        for ( int i = 1 ; i <= 10 ; i++ ) {
            multi = n * i;
            System.out.printf ( "%d x %d = %d%n" , i , n , multi );
        }

    }// fin tablaDeMultiplicar

    private static int obtenerEnetero1_10(){
        int n = lector.nextInt();
        return n;
    }// fin obtenerEntero1_3

}// fin-class Ejercicio3
