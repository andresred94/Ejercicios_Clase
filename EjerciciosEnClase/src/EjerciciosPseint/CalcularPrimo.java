package EjerciciosPseint;

import java.util.Scanner;

public class CalcularPrimo {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//

    public static void ejecutarPrograma () {
        // atributos
        int numUser;
        // en principio todos son primos a no ser que se demuestre lo contrario
        boolean esPrimo = true;

        // lectura de datos
        numUser = obtenerNumero();

        // controlar que no sea negativo
        if (numUser <= 1) {
            System.out.println("No es un número primo.");
            return;
        }

        // comprobar todos los números hasta uno menor que el ingresado
        for (int i = 2; i < numUser; i++) {

            // Solo entra en este bucle si el resto es 0, sino continua comprobando
            if (numUser % i == 0) {
                esPrimo = false;//no es primo
                break; // Salimos del bucle al encontrar un divisor
            }

        }

        // en caso de que sea TRUE ejecuta lo primero
        if (esPrimo) {
            System.out.println("Es un número primo");
        } else {
            System.out.println("No es un número primo");
        }

    }// fin ejecutarPrograma

    //-- METODOS SECUNDARIOS --//

    /**
     * metodo para pedir un numero entero al usuari
     * @return entero (num)
     */
    public static int obtenerNumero () {
        int num;
        System.out.println("Ingresa un número entero");
        num  = lector.nextInt();
        return num;
    }// fin obtenerNumero

}// fin CalcularPrimo
