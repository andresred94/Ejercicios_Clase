package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio3 {

    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma(){
        int a , b;

        System.out.printf ( "%nIngresa dos números para mostrar la suma" );
        a = obtNumero ();
        b = obtNumero ();

        lector.close ();
        System.out.printf ( "%nLa suma de ambos numeros es %d", a + b );

    }// fin-ejecutarPrograma

    // <-- Metodos secundarios -->
    public static int obtNumero (){

        int nIngresado;

        System.out.printf("%nIngresa un entero: ");
        nIngresado = lector.nextInt();
        lector.nextLine ();

        return nIngresado;

    }// fin-obtNumero

}// fin-class LeerDosNumeros
