package ActividadesUT03.BucleFor;

import java.util.Scanner;

public class Ejercicio5 {
    //atributos
    private static final Scanner lector = new Scanner(System.in);

    public static void ejecutarPrograma(){
        System.out.printf ( "%nCalcula la nota media%n" );
        float resultado = media(8.5f, 7.0f, 9.2f, 6.8f);
        System.out.println("La media de las notas es: " + resultado);

    }// fin ejecutarPrograma

    private static float media (float... notas){
        // Calcular la suma de las notas
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }

        // Calcular la media
        float media = suma / notas.length;

        return media;
    }

    private static float obtenerDecimalPos(){
        float n = lector.nextFloat();
        if ( n < 0 ){
            n = -1;
        }
        return n;
    }// fin obtenerDecimalPos

}// fin-class Ejercicio5
