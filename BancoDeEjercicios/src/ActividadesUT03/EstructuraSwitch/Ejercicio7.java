package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio7 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        System.out.printf ( "%nBienvenido a la calculadora%n" );
        System.out.printf ( "Ingresa el primer operador = " );
        double op1In = obtenerDecimalpos ();
        // control de errores
        System.out.printf ( "Selecciona la operación a realizar = " );
        System.out.printf ( "+ , - , * , / o %% = ");
        char opIng = obtenerCaracter ();
        System.out.printf ( "Ingresa el segundo operador = " );
        double op2In = obtenerDecimalpos ();
        double resultOperacion = calculadora ( op1In , opIng , op2In );
        System.out.printf ( "El resultado de %.1f %c %.1f es igual a %.1f",op1In,opIng,op2In,resultOperacion );



    }// ejecutarPrograma

    private static double calculadora ( double op1 ,char operacion , double op2 ){
        double result;

        switch ( operacion ){
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = Math.abs ( op1 - op2 );
                break;
            case '*':
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = op1 * op2;
                }
                break;
            case '/':
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = (Math.max ( op1 , op2 )) / Math.min ( op1 , op2 );
                }
                break;
            case '%':
                if ( op1 == 0 || op2 == 0 ){
                    result = 0;
                } else {
                    result = (Math.max ( op1 , op2 )) % Math.min ( op1 , op2 );
                }
                break;
            default:
                result = -1;
            return result;
        }// fin switch (operacion)

        return result;
    }// fin calculadora

    private static char obtenerCaracter (){
        char n = lector.next().charAt(0);
        return n;
    }// fin obtenerCaracter

    private static double obtenerDecimalpos(){
        double n = lector.nextDouble ();
        while ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerDecimalPos

}// fin-class Ejercicio7
