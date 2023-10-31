package ActividadesUT02.VariablesyOperaciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

    // atributos
    //private static Scanner lector = new Scanner(System.in);

    //<-- Métodos principales -->//
    public static void ejecutarPrograma (){
        double precio = 85.00 , pDescuento;

        pDescuento =  (precio - (precio * 0.15));

        System.out.printf ( "%nEl precio de las deportivas es de %.2f € y tiene un descuento del 15%%" , precio );
        System.out.printf ( "%nCon el descuento aplicado es precio es de: %.2f€%n" , pDescuento);



    }// fin ejecutarPrograma



    //<-- Métodos secundarios -->//


}// fin-class Ejercicio1
