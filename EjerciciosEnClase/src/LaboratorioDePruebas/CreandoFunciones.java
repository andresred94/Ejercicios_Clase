package LaboratorioDePruebas;

import java.util.Scanner;

public class CreandoFunciones {

    static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma() {
        String nombre = "Andres " , apellido = "Bravo";


        System.out.println (pedirNombre ( nombre , apellido ));

    }// fin ejecutarPrograma

    public static String pedirNombre ( String nom , String ape) {

        return nom + ape;
    }// fin pedirNombre

    public static void imprimirNombre ( String nombre ){

        System.out.printf ( "El nombre ingresado es %s", nombre );

    }// fin imprimirNombre

}// fin-class CreandoFunciones
