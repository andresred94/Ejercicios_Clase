package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio8 {
    // atributos
    protected static Scanner lector = new Scanner(System.in);

    // <-- metodos principales --> //
    public static void ejecutarPrograma(){

        System.out.printf("%nIngresa el número que quieres invertir = ");
        int nIngresado = obEntero();
        int resp = invertirCifras(nIngresado);
        System.out.printf("El número %d invertido es = %d", nIngresado , resp );


    }// fin ejecutarPrograma

    // <-- metodos secundarios --> //
    private static int invertirCifras (int numero){
        int cifra , nNumero = 0;
        while (numero != 0){
            cifra = numero % 10 ;
            numero = numero / 10;
             nNumero = nNumero * 10 + cifra;
        }

        return nNumero;
    }// fin invertirCifras

    private static int obEntero(){
        int n = lector.nextInt();
        return n;
    }// fin  obEntero

}// fin-class Ejercicio8
