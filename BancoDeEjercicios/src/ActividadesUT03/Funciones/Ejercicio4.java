package ActividadesUT03.Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        int iniUsuario , finUsuario;
        System.out.printf ( "%nBienvenid@ al generador de números aleatorios%n" );
        System.out.printf ( "Ingresa el valor mínimo = " );
        iniUsuario = obEntero ();
        System.out.printf ( "Ingresa el valor máximo = " );
        finUsuario = obEntero ();

        // control errores
        while ( iniUsuario > finUsuario ){
            System.out.printf ( "Error : El valor mínimo no puede ser mayor que el máximo." );
            System.out.printf ( "%nIngresa el valor minimo = " );
            iniUsuario = obEntero ();
            System.out.printf ( "Ingresa el valor máximo = " );
            finUsuario = obEntero ();
        }

        int aleaGenerado = aleatorio ( iniUsuario , finUsuario );
        System.out.printf ( "%nEl número aleatorio generado es %d" , aleaGenerado );

    }// fin ejecutarPrograma

    //<-- métodos secundarios -->//
    private static int aleatorio(int minimo , int maximo){
        int numAleatorio = (int) (Math.random () * (maximo - minimo) + minimo);
        return numAleatorio;
    }// fin aleatorio

    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }//fin obEntero

}// fin-class Ejercicio4
