package ActividadesUT03.OperadorCondicional;

import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    protected static final Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf("%nComprueba si la fecha ingresada es un año bisiesto%n");
        System.out.printf("Ingresa el dia = ");
        int dIn = obtenerEnteroPos();
        // control de errores
        System.out.printf("Ingresa el mes = ");
        int mIn = obtenerEnteroPos();
        System.out.printf("Ingrea el año = ");
        int aIn = obtenerEnteroPos();

        System.out.printf("%b", esBisiesto(dIn,mIn,aIn));

    }// fin ejecutarPrograma

    private static boolean esBisiesto ( int dia , int mes , int anio ) {
        int multi4, multi100, multi400;
        boolean esBisiesto;

        multi4 = anio % 4;
        multi100 = anio % 100;
        multi400 = anio % 400;

        //esBisiesto = multi4 == 4 && multi100 != 0 ? true : false;
        //esBisiesto = multi100 == 0 && multi400 == 0 ? true : false;

        if ( multi4 == 4 && multi100 != 0 && (dia == 29 && mes == 2)) {
            esBisiesto = true;
        } else if ( multi100 == 0 && multi400 == 0 && (dia == 29 && mes == 2) ) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }

        return esBisiesto;

    }// fin comprobarBisiesto

    private static int obtenerEnteroPos(){
        int n = lector.nextInt();
        while ( n < 0){
            n = -1;
        }
        return n;
    }// fin obtenerEnteropos



}// fin-class Ejercicio5