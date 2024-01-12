package LaboratorioDePruebas.PrimeraEva;

import java.util.Scanner;

public class MostrarEdad {

    static Scanner lector = new Scanner(System.in);

    //<-- Metodos Principales -->//

    public static void  ejecutarPrograma () {
        int edad , anioF , anioAct = 2023 , anioN;


        System.out.printf( "Ingresa tu edad = " );
        edad = lector.nextInt();
        edad ++;

        System.out.printf( "Tu edad el año que viene será %d%n" , edad );

        System.out.printf( "Ingresa otro año que sea mayor de 2023 = " );
        anioF = lector.nextInt();

        anioN = anioAct - edad;

        edad = anioF - anioN;

        System.out.printf( "Tu edad en el año %d será = %d" , anioF , edad );

        lector.close();

    }// fin ejecutarPrograma

}// fin-class MostrarEdad
