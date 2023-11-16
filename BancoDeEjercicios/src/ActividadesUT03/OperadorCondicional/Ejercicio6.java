package ActividadesUT03.OperadorCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    // atributos
    private static final Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){

        System.out.printf("%nComprueba si estás suspenso o aprobado%n");
        System.out.printf("Ingresa tu nota = ");
        float nIng = obtenerDecimal1_10();
        // control de errores
        while (nIng == -1){
            System.out.printf("Error : has ingreado un valor no válido.");
            System.out.printf("Vuelve a ingresar tu nota = ");
            nIng = obtenerDecimal1_10();
        }

        estaAprobado(nIng);

    }// fin ejecutarPrograma

    private static boolean estaAprobado (float nota){
        boolean esCierto = nota >= 5 ? true : false;
        String resp = null;
        System.out.printf("%s" , ( resp = esCierto ? "aprobado " : "suspenso"));
        return esCierto;

    }// fin estaAprobado

    private static float obtenerDecimal1_10(){
        lector.useLocale( Locale.ENGLISH);// permite leer un double con punto
        float n = lector.nextFloat();
        while (n < 0 || n > 10){
            n = -1;
        }
        return n;
    }// fin obtenerEnetero1_10

}// fin-class Ejercicio6

