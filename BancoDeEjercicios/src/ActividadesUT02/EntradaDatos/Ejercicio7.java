package ActividadesUT02.EntradaDatos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

    // atributos
    protected static Scanner lector = new Scanner(System.in);

    public static void main ( String[] args ) {

        ejecutarPrograma ();

    }
    // <-- Metodos pricipales -->
    public static void ejecutarPrograma () {
        double km1 , km2 , pago1 , pago2 , pCombu1 , pCombu2 , totalLitros , tDistancia , tCoste;

        System.out.printf ("Calculadora del consumo medio de un automovil%n");
        System.out.printf ( "Ingresa la información sobre las tres últimas veces que repostaste%n" );
        System.out.printf ( "%nPrimera vez:%n" );
        System.out.printf ( "¿Cual era el precio del combustible/litro? = " );
        pCombu1 = obtNumero ();
        System.out.printf ( "¿Cuanto pagaste en total para llenar el depósito? = " );
        pago1 = obtNumero ();
        System.out.printf ( "¿Cuantos km marcaba el cuenta kilometros? = " );
        km1 = obtNumero ();
        System.out.printf ( "%nSegunda vez: %n" );
        System.out.printf ( "¿Cual era el precio del combustible/litro? = " );
        pCombu2 = obtNumero ();
        System.out.printf ( "¿Cuanto pagaste en total para llenar el depósito? = " );
        pago2 = obtNumero ();
        System.out.printf ( "%nTercera vez:%n" );
        System.out.printf ( "¿Cuantos km marcaba el cuenta kilometros? = " );
        km2 = obtNumero ();
        totalLitros = ((pago1 / pCombu1 ) + (pago2 / pCombu2));
        tDistancia = km2 - km1;
        tCoste = pago1 + pago2;

        System.out.printf ( "%nEl consumo medio por cada 100 km es = %.2f litros %n", (totalLitros / tDistancia) * 100 );
        System.out.printf ( "El coste por kilometro recorrido es = %.2f €", tCoste / tDistancia );

    }//fin-ejecutarPrograma

    //-- METODOS SECUNDARIOS --//
    private static double obtNumero (){

        double nIngresado;
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        nIngresado = lector.nextDouble ();

        return nIngresado;

    }// fin-obtNumero

}//fin-class Ejercicio7