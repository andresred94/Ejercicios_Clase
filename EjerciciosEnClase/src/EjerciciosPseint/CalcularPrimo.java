package EjerciciosPseint;

import java.util.Scanner;

public class CalcularPrimo {

    //atributos
    static Scanner lector = new Scanner(System.in);

    // metodos principales

    public static void ejecutarPrograma () {
        int numUser;

        boolean esPrimo = true;

        numUser = obtenerNumero();
        System.out.println("El número ingresado es "+ numUser);

        if (numUser <= 1) {
            System.out.println("No es un número primo.");
            return;
        }

        for (int i = 2; i < numUser; i++) {
            if (numUser % i == 0) {
                esPrimo = false;
                break; // Salimos del bucle al encontrar un divisor
            }
        }

        if (esPrimo) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }

    }


    // metodos secundarios

    /**
     * metodo para pedir un numero entero al usuari
     * @return entero (num)
     */
    public static int obtenerNumero () {
        int num;
        System.out.println("Ingresa un número entero");
        num  = lector.nextInt();
        return num;
    }

}
