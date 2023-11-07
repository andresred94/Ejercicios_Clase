package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        System.out.printf("%nIngresa el importe positivo en euros = ");
        double imp = pedirDecimal();
        System.out.printf("Ingresa el IVA (entre 0.00 y 1.00) = ");
        double iva = pedirDecimal();
        double resp = imp + (imp * iva);
        System.out.printf("El importe ingresado con el IVA indicado añadido es = %.2f€%n" , resp);

    }// fin ejecutarPrograma

    //<-- métodos secundarios -->//
    private static double calcularIva(double importe , double iva){
        double resp = importe * iva;
        return resp;
    }// fin calcularIva

    private static double pedirDecimal(){
        double resp = lector.nextDouble();
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        return  resp;
    }// fin pedirDecimal

}// fin-class Ejercicio2
