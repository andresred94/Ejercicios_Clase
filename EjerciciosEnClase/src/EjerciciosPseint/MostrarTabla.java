package EjerciciosPseint;

import java.util.Scanner;

public class MostrarTabla {
    public static Scanner entrada = new Scanner(System.in);


    public static void calcularTabla (){
        int numIngresado , multi ;
        numIngresado = obtenerMultiplicador();

        for (int i = 1; i <= 10; i++) {
            multi = numIngresado * i;
            System.out.println( i + " x " + numIngresado + " = " + multi);
        //prueba

        }


    }// fin calcularTabla
    public static int obtenerMultiplicador () {
        int resp;
        System.out.println( "Ingresa el número que quieras obtener la tabla") ;
        resp = entrada.nextInt();
        return resp;

    }// fin obtenerMultiplicador
}// fin MostrarTabla
