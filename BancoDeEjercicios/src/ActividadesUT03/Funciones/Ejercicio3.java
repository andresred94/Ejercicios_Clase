package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    //<-- métodos principales -->//
    public static void ejecutarPrograma (){
        // atributos
        double resp;

        // inicio
        System.out.printf ( "%nBienvenid@ a la calculadora de salario semanal..." );
        System.out.printf ( "%nIngresa la cantidad de horas que has trabajado = " );
        double hIngresadas = pedirDecimal ();

        // control errores
        while ( hIngresadas < 0 || hIngresadas > 144 ){
            System.out.printf ( "Error : no has ingresado horas válidas. Vuelve a ingresar otro valor = " );
            hIngresadas = pedirDecimal ();
        }

        System.out.printf ( "Ingresa el precio en euros por cada hora = " );
        double pIngresado = pedirDecimal ();

        // control errores
        while ( pIngresado < 0 ){
            System.out.printf ( "Error : no has ingresado un precio válido. Vuelve a ingresar otro valor = " );
            pIngresado = pedirDecimal ();
        }

        // calcula las horas convencionales y extras
        if ( hIngresadas > 40 ) {
            resp = salario ( 40 , pIngresado );
            System.out.printf ( "%nTu salario esa semana sin contar las horas extras es de %.0f€" , resp);
            resp = resp + (salario ( Math.abs(40 - hIngresadas)  , (pIngresado  * 1.5) ));
            System.out.printf ( "%nTu salario esa semana con el 50%% más por cada hora extra adicional es de %.0f€" , resp );

        } else {
            resp = salario ( hIngresadas , pIngresado );
            System.out.printf ( "%nTu salario esa semana es de %.0f€" , resp );
        }



    }// fin ejecutarPrograma


    //<-- métodos secundarios -->//
    private static double salario (double horas , double pHora){
        double resp = horas * pHora;
        return  resp;
    }
    private static double pedirDecimal(){
        //todo ¿Es mejor implementar el control de errores en las pequeñas funciones o en la ejecucion de todas
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        double resp = lector.nextDouble();
        return  resp;
    }// fin pedirDecimal

}// fin-class Ejercicio3
