package EjerciciosPseint;

import java.util.Scanner;

public class MostrarCuadrados {
    public static Scanner entrada = new Scanner(System.in);


    public static void calcularCuadrado () {

        int resp;
        int numTope;

        System.out.println( "Ingresa en número" );
        numTope = entrada.nextInt();

        for ( int i = numTope ;  i > 0 ; i-- ) {
            resp = i * i;
            System.out.println(i + " x " + i + " = " + resp);
        }
    }// fin calcularCuadrado
}// fin mostrarCuadrados
