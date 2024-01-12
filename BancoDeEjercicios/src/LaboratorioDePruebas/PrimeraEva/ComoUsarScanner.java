package LaboratorioDePruebas.PrimeraEva;

import java.util.Scanner;

public class ComoUsarScanner {
    public static void ejecutarPrograma(){

        char charLeido;
        int a , b;
        Scanner lector = new Scanner(System.in);
        System.out.printf("%nIngresa un caracter: ");
                charLeido = lector.next().charAt(0);
        System.out.printf("%nEl char leido es %s",charLeido);
        System.out.printf("%nIngresa el primer entero: ");
                a = lector.nextInt();
        System.out.printf("%nIngresa el segundo entero: ");
                b = lector.nextInt();
                lector.close();
        System.out.printf("%nLa suma de ambos numero es %d", a + b);

    }// fin-ejecutarPrograma

}// fin-class ComoUsarScanner
