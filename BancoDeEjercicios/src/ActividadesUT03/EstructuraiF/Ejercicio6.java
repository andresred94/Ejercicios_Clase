package ActividadesUT03.EstructuraiF;

import java.util.Scanner;

public class Ejercicio6 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );
    public static void ejecutarProgramara(){
        int n1 , n2 , n3;
        String resp;
        System.out.printf ( "%nOrdena los números de mayor a menor...%n" );
        System.out.printf ( "Ingresa el primer número = " );
        n1 = obEntero ();
        System.out.printf ( "Ingresa el segundo número = " );
        n2 = obEntero ();
        System.out.printf ( "Ingresa el tercer número = " );
        n3 = obEntero ();
        resp = ordenarNumeros ( n1 , n2 , n3 );
        System.out.printf ( "%s" , resp );

    }// fin ejecutarPrograma

    //<-- métodos principales -->//
    private static String ordenarNumeros (int a, int b, int c){
        int valorMayor = mayorDtres(a, b, c);// primera posicion
        int valorMedio = 0;
        int valorMenor = 0;

        // comprueba la segunda y tercera posicion
        if (a == valorMayor) {
            valorMedio = b > c ? b : c;//Math.max(b, c);
            valorMenor = b < c ? b : c;//Math.min(b, c);
        } else if (b == valorMayor) {
            valorMedio = a > c ? a : c;//Math.max(a, c);
            valorMenor = a < c ? a : c;//Math.min(a, c);
        } else {
            valorMedio = a > b ? a : b;//Math.max(a, b);
            valorMenor = a < b ? a : b;//Math.min(a, b);
        }

        String frase = "En orden descendente... " + valorMayor + " " + valorMedio + " " + valorMenor;
        return frase;
    }// fin ordenarNumeros



    //<-- métodos secundarios -->//
    private static int mayorDtres ( int n1, int n2, int n3){
        return n3 > ( n1 > n2 ? n1 : n2) ? n3 : ( n1 > n2 ? n1 : n2 );
    }// fin mayorDtres


    private static int obEntero (){
        int n = lector.nextInt ();
        return n;
    }// fin obEntero

}// fin-class Ejercicio6
