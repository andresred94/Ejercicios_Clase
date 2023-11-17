package ActividadesUT03.BucleWhile;

import java.util.Scanner;

public class Ejercicio4 {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    public static void menuCalculadora(){
        int n  , ope1 , ope2;
        do {
            System.out.printf("1) Sumar%n");
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
                System.out.printf("La suma de %d y %d es %.0f%n" , ope1 , ope2 , calculadora(ope1 , n , ope2));
            } else if ( n == 2 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                System.out.printf("La resta de %d y %d es %.0f%n" , ope1 , ope2 , calculadora(ope1 , n , ope2));
            } else if ( n == 3 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                int divisor = Math.min(ope1,ope2);
                int dividendo = Math.max(ope1,ope2);
                double result = calculadora(ope1 , n , ope2);
                System.out.printf("La división entre %d y %d es %.0f%n" , dividendo , divisor , result);
            } else if ( n == 4 ){
                System.out.printf("Ingresa el primero operador = ");
                ope1 = lector.nextInt();
                System.out.printf("Ingresa el segundo operador = ");
                ope2 = lector.nextInt();
                System.out.printf("La multiplicación entre %d y %d es %.0f%n" , ope1 , ope2 , calculadora(ope1 , n , ope2));
            } else if (n == -1) {
                System.out.printf("Orden desconocida%n");
            }
        } while (n == 1 || n == 2 || n == 3 || n == 4 || n == -1);

    }// fin menuCalculadora

    // <-- métodos secundarios --> //
    private static double calculadora ( double op1 ,int operacion , double op2 ){
        double result;

        switch ( operacion ){
            case 1:
                result = op1 + op2;
                break;
            case 2:
                result = Math.abs ( op1 - op2 );
                break;
            case 3:
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = (Math.max ( op1 , op2 )) / Math.min ( op1 , op2 );
                }
                break;
            case 4:
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = op1 * op2;
                }
                break;
            case 5:
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = (Math.max ( op1 , op2 )) % Math.min ( op1 , op2 );
                }
                break;
            default:
                result = -1;
                return result;
        }// fin switch (operacion)

        return result;
    }// fin calculadora

    private static int obtenerEnetero1_5(){
        int n = lector.nextInt();
        if (n < 0 || n > 5){
            n = -1;
        }
        return n;
    }// fin obtenerEntero1_5

}// fin-class Ejercicio4
