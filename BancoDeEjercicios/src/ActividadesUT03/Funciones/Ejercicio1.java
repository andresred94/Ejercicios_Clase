package ActividadesUT03.Funciones;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );


    //<-- métodos principales -->//
    public static void ejecutarPrograma(){
        System.out.printf("%nIngresa el dividendo = ");
        int a = pedirEntero();
        // conttrol errores
        while (a == -1){
            System.out.printf("Error : valor no válido");
            System.out.printf("%nIngresa el dividendo = ");
            a = pedirEntero();
        }
        System.out.printf("Ingresa el divisor = ");
        int b = pedirEntero();
        int resultDiv = divisionEntera(a,b);
        System.out.printf("%nEl resultado de la división entera es: %d" , resultDiv);

    }// fin ejecutarPrograma

    private static int divisionEntera (int dividendo , int divisor){
        int respuesta;
        if (divisor == 0){
            System.out.printf("%nEl divisor es 0");
            respuesta = 0;
        }else {
            respuesta =  dividendo / divisor;
        }
        return respuesta;
    }// fin divisionEntera

    //<-- métodos secundarios -->//
    private static int pedirEntero (){
        int n = lector.nextInt ();
        if (n < 0){
            n = -1;
        }
        return  n;
    }// fin pedirEntero

}// fin-class Ejercicio1
