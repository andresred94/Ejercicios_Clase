package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio17 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );
    private enum TipoIMC {BAJOPESO,NORMAL,SOBREPESO,OBESO,ERROR}
    public static void ejecutarPrograma(){
        System.out.printf ( "%nCalcula tu IMC...%n" );
        System.out.printf ( "Ingresa tu peso en Kg = " );
        float kgIngresado = obDecPositivo ();

        // control errores
        while ( kgIngresado == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido%n" );
            System.out.printf ( "Ingresa tu peso en Kg = " );
            kgIngresado = obDecPositivo ();
        }

        System.out.printf ( "Ingresa tu altura en metros = " );
        float mIngresados = obDecPositivo ();

        // control errores
        while ( mIngresados == -1 ){
            System.out.printf ( "Error : has ingresado un valor no válido%n" );
            System.out.printf ( "Ingresa tu altura en metros = " );
            mIngresados = obDecPositivo ();
        }
        System.out.println (calcularIMC ( kgIngresado , mIngresados ));

    }// ejecutarPrograma



    private static TipoIMC calcularIMC (float peso , float altura){
        float imc = peso / (altura * altura);
        //System.out.printf ( "Tu IMC es de %.2f%% %n" ,imc );

        if ( peso <= 0 || altura <= 0 )
            return  TipoIMC.ERROR;
        if ( imc <= 18.5 )
            return TipoIMC.BAJOPESO;
        if ( imc <= 25.0 )
            return TipoIMC.NORMAL;
        if ( imc <= 30.0 )
            return TipoIMC.SOBREPESO;
        if ( imc > 30.0 )
            return TipoIMC.OBESO;
        return null;// es como el default en el switch
    }

    private static float obDecPositivo (){
        float n = lector.nextFloat ();
        if ( n <= 0 ){
            n = -1;
        }
        return n;
    }// fin obDecPositivo

}// fin-class Ejercicio17
