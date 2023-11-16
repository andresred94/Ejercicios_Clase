package ActividadesUT03.OperadorCondicional;

import java.util.Scanner;

public class Ejercicio3 {
    // atributos
    private static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){
        System.out.printf("%nComprueba si el número ingresado es par o no%n");
        System.out.printf("Ingresa el primer número = ");
        int n1 = obtenerEnteroPos();
        System.out.printf("%s " , parImpar(n1));

    }// fin ejecutarPrograma

    private static String parImpar (int numero){
        String resp = null;
        int resto = numero % 2;
        return resp = (resto == 0 ? "Es par" : "Es impar" );
    }// fin parOimpar

    //<-- métodos secundarios -->//
    private static int obtenerEnteroPos(){
        int n = lector.nextInt();
        while ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEnteroPos

}// fin-class Ejercicio3
