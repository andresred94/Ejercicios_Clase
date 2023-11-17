package ActividadesUT03.BucleWhile;

import java.util.Scanner;

public class Ejercicio4 {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    public static void menuCalculadora(){
        int n = 1 , ope1 , ope2;
        do {
            System.out.printf("%n1) Sumar%n");
            System.out.printf("2) Restar%n");
            System.out.printf("3) Dividir%n");
            System.out.printf("4) Multiplicar%n");
            System.out.printf("5) Salir%n");

            System.out.printf("Introduce una opción = ");
            n = obtenerEnetero1_5();
            if ( n == 1 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                System.out.printf("La suma de %d y %d es %d" , ope1 , ope2 , ope1 + ope2);
            } else if ( n == 2 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                System.out.printf("La resta de %d y %d es %d%n " , ope1 , ope2 , Math.abs(ope1 - ope2));
            } else if ( n == 3 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                int divisor = Math.min(ope1,ope2);
                int dividendo = Math.max(ope1,ope2);
                double result = dividendo / divisor;
                System.out.printf("La división entre %d y %d es %.1f%n" , dividendo , divisor , result);
            } else if ( n == 4 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                System.out.printf("La multiplicación entre %d y %d es %d%n" , ope1 , ope2 , ope1 * ope2);
            } else if (n == -1) {
                System.out.printf("Orden desconocida%n");
            }
        } while (n == 1 || n == 2 || n == 3 || n == 4 || n == -1);

    }// fin menuCalculadora

    // <-- métodos secundarios --> //


    private static int obtenerEnetero1_5(){
        int n = lector.nextInt();
        if (n < 0 || n > 5){
            n = -1;
        }
        return n;
    }// fin obtenerEntero1_5

}// fin-class Ejercicio4
