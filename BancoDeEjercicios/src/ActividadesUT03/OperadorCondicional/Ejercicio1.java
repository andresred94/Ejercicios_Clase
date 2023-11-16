package ActividadesUT03.OperadorCondicional;

import java.util.Scanner;

public class Ejercicio1 {
    // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){
        System.out.printf("%nComprueba el mayor de dos números%n");
        System.out.printf("Ingresa el primer número = ");
        int n1 = obtenerEnteroPos();
        // control de errores
        System.out.printf("Ingresa el segundo número = ");
        int n2 = obtenerEnteroPos();
        // control de errores
        System.out.printf("El número %d es mayor " , esMayor( n1 , n2 ));

    }// fin ejecutarPrograma

    private static int esMayor ( int a , int b ){
        int resp = a > b ? a : b;
        return resp;
    }// fin esMayor

    private static int obtenerEnteroPos(){
        int n = lector.nextInt();
        while ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEnteroPos

}// fin-class Ejercicio1
