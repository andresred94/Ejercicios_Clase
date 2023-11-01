package EjerciciosPseint;

import java.util.Scanner;

public class DecimalBinario {

    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma (){
        int nUser , resto = 0;
        String binario = "";

        System.out.println("Ingresa un número decimal para convertir a binario");
        nUser = pedirNumero();

        while (nUser > 0) {
            resto = nUser % 2;
            binario = resto + binario;
            nUser = (int) Math.floor(nUser / 2);
        }

        System.out.println(binario);

    }// fin ejecutarPrograma

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


}// final DecimalBinario
