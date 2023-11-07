package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        System.out.printf("%nIngresa el importe positivo en euros = ");
        double impIngresado = pedirDecimal();

        // control de errores
        while ( impIngresado < 0 ){
            System.out.printf ( "%nError : no has ingresado un importe válido. Vuelve a ingresar un importe = " );
            impIngresado = pedirDecimal ();
        }

        System.out.printf("Ingresa el IVA (entre 0.00 y 1.00) = ");
        double ivaIngresado = pedirDecimal();

        // control de errores
        while ( ivaIngresado < 0 || ivaIngresado > 1 ){
            System.out.printf ( "%nErrore : IVA no válido. Vuelve a ingresar otro = " );
            ivaIngresado = pedirDecimal ();
        }
        double resp = calcularIva ( impIngresado , ivaIngresado );
        System.out.printf("El importe ingresado con el %.0f%% IVA indicado añadido es = %.2f€%n", (ivaIngresado * 100) , resp);

    }// fin ejecutarPrograma

    //<-- métodos secundarios -->//
    private static double calcularIva(double importe , double iva){
        double resp = importe + (importe * iva);
        return resp;
    }// fin calcularIva

    private static double pedirDecimal(){
        //todo ¿Es mejor implementar el control de errores en las pequeñas funciones o en la ejecucion de todas
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        double resp = lector.nextDouble();
        return  resp;
    }// fin pedirDecimal

}// fin-class Ejercicio2
