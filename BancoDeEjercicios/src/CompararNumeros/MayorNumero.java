package CompararNumeros;

import java.util.Scanner;

public class MayorNumero {
    // atributos
    static Scanner lector = new Scanner(System.in);
    // <-- métodos principales ---> //

    public static void ejecutarPrograma () {
        int n1 , n2 ,  n3 , resp ;
        System.out.println("Ingresa tres numeros");

        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();

        resp = calcularElmayor (n1,n2,n3);
        System.out.println("El  numero mayor de los tres es: " + resp);
    }// fin ejecutarPrograma


    // <-- métodos secundarios --> //
    /**
     * funcion a la que se le ingresa tres números como parámetro
     * y comprueba cual es el mayor de los tres
     * @param n1
     * @param n2
     * @param n3
     */
    public static int calcularElmayor ( int n1, int n2, int n3){
        return n3 > ( n1 > n2 ? n1 : n2) ? n3 : ( n1 > n2 ? n1 : n2 );
        //return Math.max ( n3 , (Math.max ( n1 , n2 )) );//usando método max
    }// fin numeroMayor

}// fin MayorNumero