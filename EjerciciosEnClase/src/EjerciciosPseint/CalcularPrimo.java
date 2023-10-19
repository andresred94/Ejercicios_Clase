package EjerciciosPseint;

import java.util.Scanner;

public class CalcularPrimo {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//

    public static void ejecutarPrograma () {
        // atributos
        int numUser,contador = 2;

        // en principio todos son primos a no ser que se demuestre lo contrario
        boolean esPrimo = true;

        // lectura de datos
        numUser = obtenerNumero();

        // controlar que no sea negativo
        if (numUser <= 1) {
            System.out.println("Error: no es un número válido, vuelve a ingresar otro");
            numUser = obtenerNumero();
        }

        // mientras que el contador sea menor que el numero ingresado y esPrimo = true
        while ( contador < numUser && esPrimo) {

            // comprueba que el resto sea igual a 0
            if (numUser % contador == 0) {
               // si hay más de dos divisiones con resto 0 entonces NO es primo
                esPrimo = false;
            }

            contador++;

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
