package ActividadesUT03.BucleWhile;

import java.util.Scanner;

public class Ejercicio3 {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    public static void menuOpciones (){
        int n = 1;
        do {
            System.out.printf("1) Saludo%n");
            System.out.printf("2) Nombre%n");
            System.out.printf("0) Salir%n");
            System.out.printf("Introduce una opción = ");
            n = obtenerEnetero1_2();
            if ( n == 1 ){
                System.out.printf("Hola%n");
            } else if ( n == 2 ){
                System.out.printf("Soy java%n");
            } else if ( n == 0 ){
                System.out.printf("Adios%n");
            } else if ( n == -1 ){
                System.out.printf("Orden desconocida%n");
            }
        } while (n == 1 || n == 2 || n == -1);

    }// fin menuOpciones

    private static int obtenerEnetero1_2(){
        int n = lector.nextInt();
        if (n < 0 || n > 2){
            n = -1;
        }
        return n;
    }// fin obtenerEntero1_3

}// fin-class Ejercicio3
