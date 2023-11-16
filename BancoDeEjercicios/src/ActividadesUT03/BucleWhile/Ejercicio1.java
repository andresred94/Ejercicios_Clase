package ActividadesUT03.BucleWhile;

import java.util.Scanner;

public class Ejercicio1 {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma (){
        System.out.printf("%nComprueba si un numero es primo o no%n");
        System.out.printf("ingresa un número = ");
        int nIn = obtenerNumero();
        // control errores
        while (nIn == -1){
            System.out.printf("Error : valor ingresado no válido.");
            System.out.printf("ingresa un número = ");
            nIn = obtenerNumero();
        }
        System.out.printf("%b" , esPrimo(nIn));

    }// fin ejecutarPrograma

    private static boolean esPrimo (int numero){
        boolean esCierto = true;
        int cont = 2;
        // bucle que comprueba que las divisiones sean exactas
        // cuando tiene mas de una división exacta sale del bucle
        while (cont < numero && esCierto){
            if (numero % cont == 0){
                esCierto = false;
            }
            cont++;
        }
        return esCierto;
    }// fin esPrimo

    private static int obtenerNumero () {
        int n = lector.nextInt();
        while (n < 0){
            n = -1;
        }
        return n;
    }// fin obtenerNumero

}// fin-class Ejercicio1
