package CompararNumeros;

import java.security.PublicKey;
import java.util.Scanner;

public class MayorNumero {
    static Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma () {
        int n1 , n2 ,  n3 , resp ;
        System.out.println("Ingresa tres numeros");

        n1 = lector.nextInt();
        n2 = lector.nextInt();
        n3 = lector.nextInt();

        resp = algoritmo1(n1,n2,n3);
        System.out.println("El  numero mayor de los tres es: " + resp);
    }


    /**
     * funcion a la que se le ingresa tres números como parámetro
     * y comprueba cual es el mayor de los tres
     * @param n1
     * @param n2
     * @param n3
     */
    public static int  algoritmo1 (int n1, int n2, int n3){
        return n3 > ( n1 > n2 ? n1 : n2) ? n3 : ( n1 > n2 ? n1 : n2 );
    }// fin algoritmo2
}// fin MayorNumero
