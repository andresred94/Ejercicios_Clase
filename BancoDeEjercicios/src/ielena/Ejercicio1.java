package ielena;

import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.printf("1- Calcula segundos.%n");
            System.out.printf("2- Calcula precio.%n");
            System.out.printf("3- Salir.%n");
            System.out.printf("Eliga una opción = ");
            n = lector.nextInt();
            switch (n){
                case 1:
                    System.out.printf("Ingresa las horas = ");
                    int horasIn = lector.nextInt();
                    System.out.printf("Ingresa los minutos = ");
                    int minIn = lector.nextInt();
                    System.out.printf("Ingresa los segundos = ");
                    int segIn = lector.nextInt();
                    int segTotal = calculaSegundos(horasIn,minIn,segIn);
                    System.out.printf("A las %02d:%02d:%02d, han transcurrido %d segundos.%n" , horasIn , minIn , segIn , segTotal);
                    break;
                case 2:
                    System.out.printf("Ingresa la cantidad de entradas que has comprado = ");
                    int cantEntradas = lector.nextInt();
                    int precioT = calculaPrecio(cantEntradas);
                    while ( precioT == -1 ){
                        System.out.printf ( "Error : la cantidad de personas no coincide con el número de entradas compradas.%n" );
                        precioT = calculaPrecio(cantEntradas);
                    }
                    System.out.printf("El precio total de las entradas es: %d €.%n" , precioT);
                    break;
                default:
                    System.out.printf("Fin del programa.");

            }
        } while (n == 1 || n == 2);
    }

    public static int calculaSegundos(int horas, int minutos , int segundos){

        int restMinutos = (horas * 60) + minutos;
        int restSegundos = (restMinutos * 60) - segundos;

        return restSegundos;

    }// fin calculaSegundos

    public static int calculaPrecio (int numEntradas){
        double precioGeneral = 13.0;
        double precioDoce = 8.0;
        double precioMayores = 10.0;
        int precioTotal = 0;
        int totalPersonas = 0;
        int persMayores65;
        int persMayoresDeEdad;
        int persDoce;
        if ( totalPersonas < numEntradas ){
            System.out.printf("¿Cuantas personas son mayores de 65? = ");
            persMayores65 = lector.nextInt();
            System.out.printf("¿Cuantas personas son mayores de 18? = ");
            persMayoresDeEdad = lector.nextInt();
            System.out.printf("¿Cuantas personas son menores de 12 años = ");
            persDoce = lector.nextInt();
            totalPersonas = persDoce + persMayores65 + persMayoresDeEdad;
            precioTotal = (int) ((persMayoresDeEdad * precioGeneral) + (persMayores65 * precioMayores) + (persDoce * precioDoce));
        }

        /*while ( totalPersonas > numEntradas || totalPersonas < numEntradas ){
            System.out.printf ( "Error : la cantidad de personas no coincide con el número de entradas compradas.%n" );
            System.out.printf("¿Cuantas personas son mayores de 65? = ");
            persMayores65 = lector.nextInt();
            System.out.printf("¿Cuantas personas son mayores de 18? = ");
            persMayoresDeEdad = lector.nextInt();
            System.out.printf("¿Cuantas personas son menores de 12 años = ");
            persDoce = lector.nextInt();
            totalPersonas = persDoce + persMayores65 + persMayoresDeEdad;
        }*/
        if ( totalPersonas > numEntradas || totalPersonas < numEntradas ){
            precioTotal = -1;
        }
        return precioTotal;
    }// calculaPrecio

}// Ejercicio1
