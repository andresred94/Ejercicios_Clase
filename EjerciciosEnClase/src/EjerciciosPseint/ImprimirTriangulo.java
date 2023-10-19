package EjerciciosPseint;

import java.util.Scanner;

public class ImprimirTriangulo {

    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma () {
        int tamTriangulo;
        System.out.println("Ingresa el tamaño de la base del triangulo");

        tamTriangulo = pedirNumero();

        for (int contAste = 1; contAste < tamTriangulo; contAste++) {

            for (int contBla = 1; contBla < (contAste - 1) ; contBla++) {
                System.out.print("*");
            }
            for (int contBla = 1; contBla < (tamTriangulo - 1) ; contBla++) {
                System.out.print(" ");
            }
            System.out.println(" ");

        }


    }

    //-- METODOS SECUNDARIOS --//
    public static int pedirNumero() {

        int nIngresado;
        nIngresado = lector.nextInt();

        while (nIngresado <= 0) {
            System.out.println("Error: no puede ser menor o igual a 0");
            nIngresado = lector.nextInt();
        }
        return nIngresado;

    }// fin pedirNumero



}// fin ImprimirTriangulo
