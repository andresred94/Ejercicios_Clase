package LaboratorioDePruebas.PrimeraEva;

import java.util.Scanner;

public class CalcularEdad {

    //atributos
    static Scanner lector = new Scanner(System.in);


    //<-- Metodo principal -->//
    public static void ejecutarPrograma() {
        int anioA, anioN, edad;
        System.out.printf("Ingresa el año actual = ");
        anioA = lector.nextInt();

        System.out.printf("Ingresa el año en el que naciste = ");
        anioN = lector.nextInt();

        edad = anioA - anioN;

        System.out.printf("Tu edad actual es %d", edad);

        if (edad > 18) {
            System.out.printf(", eres mayor de edad");
        } else {
            System.out.printf(", no eres mayor de edad");
        }

        lector.close();

    }// fin ejecutarPrograma

}// fin-class CalcularEdad
