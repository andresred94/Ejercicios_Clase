package LaboratorioDePruebas;

import java.util.Scanner;

public class CreandoFunciones {

    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma() {
        String nom , ape1 , ape2;
        System.out.printf ( "%nIngresa tu nombre = " );
        nom = pedirPalabra ();
        System.out.printf ( "Ingresa tu primer apellido = " );
        ape1 = pedirPalabra ();
        System.out.printf ( "Ingresa tu segundo apellido = " );
        ape2 = pedirPalabra ();
        System.out.printf ( "%nBienvenido a mi programa,  %s %s %s.%n" ,  nom , ape1 , ape2 );
        int num1 = pedirEntero ();
        int num2 = pedirEntero ();
        int respSuma = sumarEnteros ( num1 , num2 );
        int respResta = restarEnteros ( num1 , num2 );
        int respMulti = multiplicarEnteros ( num1 , num2 );
        lector.close ();
        System.out.printf ( "%nLa suma de ambos números es = %d" , respSuma );
        System.out.printf ( "%nLa resta de ambos números es = %d" , respResta );
        System.out.printf ( "%nLa multiplicacion de ambos números es = %d%n" , respMulti );


    }// fin ejecutarPrograma

    private static int multiplicarEnteros (int a , int b){
        return a * b;
    }// fin multiplicarEnteros

    private static int restarEnteros (int a , int b){
        return a - b;
    }// fin restarEnteros


    // <-- funciones secundarias -->//
    private static int sumarEnteros (int a , int b){
        return a + b;
    }// fin sumarEnteros

    private static String pedirPalabra () {
        String palabra = lector.nextLine ();
        return palabra;
    }// fin pedirNombre

    private static int pedirEntero (){
        System.out.printf ( "%nIngresa un número entero = " );
        int n = lector.nextInt ();
        return  n;
    }// fin pedirEntero



}// fin-class CreandoFunciones
