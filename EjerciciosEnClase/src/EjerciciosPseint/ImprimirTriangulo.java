package EjerciciosPseint;

import java.util.Scanner;

public class ImprimirTriangulo {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma () {
        int tamTriangulo;
        System.out.println("Ingresa el tamaño de la base del triangulo");

        // lectura de  datos
        tamTriangulo = pedirNumero();

        // imprime un salto de linea después de imprimir el asteriscto
        for (int contBla = 1; contBla <= tamTriangulo; contBla++) {

            // imprime asteriscos desde 0 hasta (n - 1) en cada fila
            for (int conAste = 0; conAste <= (contBla - 1) ; conAste++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }// fin for

    }// fin ejecutarPrograma

    //-- METODOS SECUNDARIOS --//

    /**
     * función que pide un número positivo
     * @return nIngresado entero
     */
    public static int pedirNumero() {

        // atributos
        int nIngresado;
        nIngresado = lector.nextInt();

        // compruebueba que el numero ingresado no es negativo
        while (nIngresado <= 0) {
            System.out.println("Error: no puede ser menor o igual a 0");
            nIngresado = lector.nextInt();
        }

        return nIngresado;

    }// fin pedirNumero

}// fin ImprimirTriangulo
