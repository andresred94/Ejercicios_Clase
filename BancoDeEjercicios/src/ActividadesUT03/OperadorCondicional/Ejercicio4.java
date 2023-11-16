package ActividadesUT03.OperadorCondicional;

import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    private static final Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){
        System.out.printf("%nComprueba si dos números son divisores%n");
        System.out.printf("devuelve true en caso de ser cierto y false en caso contrario%n");
        System.out.printf("Ingresa el primero número = ");
        int n1 = obtenerEnteroPos();
        System.out.printf("Ingrea el segundo número = ");
        int n2 = obtenerEnteroPos();

        boolean esCierto = sonDivisores(n1 , n2);

        if (esCierto){
            System.out.printf("%b" , esCierto);
        } else {
            System.out.printf("%b",esCierto);
        }

    }// fin ejecutarPrograma

    private static boolean sonDivisores (int a , int b){
        int division;
        boolean esCierto;
        if (a > b){
            division = a % b;
        } else {
            division = b % a;
        }
        return esCierto = division == 0 ? true : false;

    }// fin sonDivisores

    //<-- métodos secundarios -->//
    private static int obtenerEnteroPos(){
        int n = lector.nextInt();
        while ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerEnteroPos

}// fin-class Ejercicio4
