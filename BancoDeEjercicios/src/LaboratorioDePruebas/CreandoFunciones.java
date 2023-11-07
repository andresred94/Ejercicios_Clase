package LaboratorioDePruebas;

import java.util.Scanner;

public class CreandoFunciones {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    // <-- métodos principales --> //
    public static void ejecutarPrograma() {
        String nomCompleto , nom , ape1 , ape2;

        System.out.printf ( "%nIngresa tu nombre = " );
        nom = leerPalabra ();
        System.out.printf ( "Ingresa tu primer apellido = " );
        ape1 = leerPalabra ();
        System.out.printf ( "Ingresa tu segundo apellido = " );
        ape2 = leerPalabra ();
        nomCompleto = saludo(nom , ape1 , ape2);
        System.out.printf ( "%nBienvenido a mi programa %s.%n" ,  nomCompleto);

        int num1 = pedirEntero ();
        int num2 = pedirEntero ();
        int respSuma = sumarEnteros ( num1 , num2 );
        int respResta = Math.abs(restarEnteros ( num1 , num2 ));
        int respMulti = multiplicarEnteros ( num1 , num2 );

        System.out.printf ( "%nLa suma de ambos números es = %d" , respSuma );
        System.out.printf ( "%nLa resta de ambos números es = %d" , respResta );
        System.out.printf ( "%nLa multiplicacion de ambos números es = %d%n" , respMulti );
        lector.close ();

    }// fin ejecutarPrograma

    private static String saludo (String nombre , String apellido1 , String apellido2){
        String frase = nombre + " " + apellido1 + " " + apellido2;
        return frase;
    }// fin saludo

    private static int multiplicarEnteros (int a , int b){
        return a * b;
    }// fin multiplicarEnteros

    private static int restarEnteros (int a , int b){
        return Math.abs ( a - b );
    }// fin restarEnteros

    // <-- funciones secundarias -->//
    private static int sumarEnteros (int a , int b){
        return a + b;
    }// fin sumarEnteros

    private static String leerPalabra () {
        String palabra = lector.nextLine ();
        return palabra;
    }// fin pedirNombre

    private static int pedirEntero (){
        System.out.printf ( "%nIngresa un número entero = " );
        int n = lector.nextInt ();
        return  n;
    }// fin pedirEntero

}// fin-class CreandoFunciones