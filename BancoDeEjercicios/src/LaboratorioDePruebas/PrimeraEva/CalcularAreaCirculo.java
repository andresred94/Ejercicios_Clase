package LaboratorioDePruebas.PrimeraEva;

import java.util.Locale;
import java.util.Scanner;

public class CalcularAreaCirculo {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//
    public static void ejecutarPrograma (){
        double r , area , longitud ;

        System.out.println("Calculadora del area de un circulo");
        System.out.println("Ingresa el radio del circulo");

        r = obtNumero();

        area = Math.PI * (Math.pow(r,2));

        longitud = 2 * Math.PI * r;

        System.out.printf( "El area del circulo sería %.2f%n" , area );
        System.out.printf( "La longitud del circulo es %.2f" , longitud );

    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
    public static double obtNumero (){

        double nIngresado;
        lector.useLocale(Locale.ENGLISH);// permite leer un double con punto
        nIngresado = lector.nextDouble ();
        return nIngresado;

    }// fin-obtNumero


}// fin-class CalcularAreaCirculo
