package EjerciciosPseint;

import java.util.Scanner;

public class SecuenciaFibonacci {
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma() {
        int num;


        System.out.println("Ingresa un número para mostrar la secuencia de Fibonacci hasta ese número");
        num = pedirNumero();

        calcularSecuencia(num);


    }

    //-- METODOS SECUNDARIOS --//
    public static int pedirNumero() {
        int nIngresado;
        nIngresado = lector.nextInt();
        while (nIngresado < 0) {
            System.out.println("Error: no has ingresado un año válido");
            nIngresado = lector.nextInt();
        }
        return nIngresado;
    }// fin pedirNumero


    /**
     * funcion que calcula y muestra la secuencia de fibonacci
     * hasta el número ingresado por teclado
     * @param numIngresado entero
     */
    public static void calcularSecuencia(int numIngresado){
        int numFibo = 1, valTope = 1;

        do {
            System.out.print(numFibo + " ");
            valTope = numFibo + valTope;
            numFibo = valTope - numFibo;

        } while (numFibo < numIngresado);



    }




}// fin SecuenciaFibonacci
