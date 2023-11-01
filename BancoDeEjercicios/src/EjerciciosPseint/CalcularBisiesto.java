package EjerciciosPseint;

import java.util.Scanner;

public class CalcularBisiesto {




    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma () {
        int anioIngresado , multi4 , multi100 , multi400;


        System.out.println("Ingresa un año para comprobar si es bisiesto");
        anioIngresado = pedirAnio();

        multi4 = anioIngresado % 4;
        multi100 = anioIngresado % 100;
        multi400 = anioIngresado % 400;

        if (multi4 == 4 && multi100 != 0) {
            System.out.println(anioIngresado + "es un año bisiesto");
        } else if (multi100 == 0 && multi400 == 0) {
            System.out.println("Es un año bisiesto");
        } else {
            System.out.println("No es un año bisiesto");
        }


    }// fin ejecutarPrograma

    //-- METODOS SECUNDARIOS --//

    /**
     * metodo que pide un año válido
     * @return
     */
    public static int pedirAnio () {

        int anio;
        anio = lector.nextInt();
        while ( anio < 0 ){
            System.out.println("Error: no has ingresado un año válido");
            anio = lector.nextInt();
        }

        return anio;
    }




}// final CalcularBisiesto
