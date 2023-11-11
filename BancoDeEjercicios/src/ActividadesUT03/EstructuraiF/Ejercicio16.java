package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio16 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf("%nIngrese la cantidad en euros =  ");
        double eurosIngresados = obDecimal ();
        System.out.printf ( "%nDebes devolver :" );

        cambioEnMonedas ( eurosIngresados );

        lector.close ();
    }// fin ejecutarPrograma

    private static void cambioEnMonedas (double cantE){

        int cantCent = (int) (cantE * 100); // Convertimos euros a centavos

        int m2e = cantCent / 200;
        cantCent %= 200;// equivale a cantCent = cantCent % 200

        int m1e = cantCent / 100;
        cantCent %= 100;

        int m50c = cantCent / 50;
        cantCent %= 50;

        int m20c = cantCent / 20;
        cantCent %= 20;

        int m10c = cantCent / 10;
        cantCent %= 10;

        int m5c = cantCent / 5;
        cantCent %= 5;

        int m2c = cantCent / 2;
        int m1c = cantCent % 2;

        if ( m2e > 0 ){
            System.out.printf ( "%n%d monedas de 2 euros" , m2e);
        }

        if ( m1e > 0 ){
            System.out.printf ( "%n%d monedas de 1 euro"  , m1e);
        }

        if ( m50c > 0 ){
            System.out.printf ( "%n%d monedas de 50 centimos" , m50c );
        }

        if ( m20c > 0 ){
            System.out.printf ( "%n%d monedas de 20 centimos" , m20c );
        }

        if ( m10c > 0 ){
            System.out.printf ( "%n%d monedas de 10 centimos"  , m10c);
        }

        if ( m5c > 0  ){
            System.out.printf ( "%n%d monedas de 5 centimos" , m5c );
        }

        if ( m2c > 0 ){
            System.out.printf ( "%n%d monedas de 2 centimos" , m2c );
        }

        if ( m1c > 0 ){
            System.out.printf ( "%n%d monedas de 1 centimo" , m1c );
        }

    }// fin cambioEnMonedas

    private static double obDecimal (){
        double n = lector.nextDouble ();
        if ( n < 0 )
            n = -1;
        return n;

    }// fin obDecimal


}// fin-class Ejercicio16
