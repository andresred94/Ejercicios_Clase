package ActividadesUT02.VariablesyOperaciones;

import java.util.Scanner;

public class Ejercicio3 {

    // atributos
    protected static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma(){
    int alto , ancho;

        System.out.printf ( "%nIngresa el alto del rectangulo = " );
        alto = lector.nextInt ();
        System.out.printf ( "%nIngresa el ancho del rectangulo = " );
        ancho = lector.nextInt ();

        System.out.printf ( "%nEl alto mide %d " , alto );
        System.out.printf ( "%nEl ancho mide %d " , ancho );
        System.out.printf ( "%nEl perimetro del rectangulo es %d" , ( 2 * ancho + 2 * alto) );
        System.out.printf ( "%nEl area del rectangulo es % d" , ancho * alto );

    }// fin ejecutarPrograma

    // <-- metodos secundarios -->//

    private static int obNumero (){
        int n;
        n = lector.nextInt ();
        return n;
    }// fin obNumero


}// fin-class Ejercicio3
