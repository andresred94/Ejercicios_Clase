package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class CreandoArrays {

    public static void ejecutarPrograma (){
        int [] MiArray = {1,2,3,4,5};

        // MiArray.length - 1 --> porque el indice empieza en 0
        for ( int i = MiArray.length - 1 ; i >= 0 ; i-- ) {
            System.out.printf("Elemento en la posición %d : %d%n" , i , MiArray[i]);
        }

        System.out.printf("Rellenar un array utilizando Arrays.fill (int[] a , valor)%n");
        System.out.printf("Rellena con 1 con contenido del array%n");
        // rellena el array con un mismo valor para todos los indices
        Arrays.fill(MiArray, 1);
        for (int n :MiArray) {
            System.out.printf("%d " , n);
        }
        System.out.printf("%n");
        // rellenar un array en un rango del inidice
        System.out.printf("Rellenar del indice 1 al 3 con 8%n");
        System.out.printf("utilizando Arrays.fill (int[] a, int fromIndex, int toIndex, int val)%n");
        // int toIndex = este valor se excluye en el caso de enteros
        // rellenar un array del indice 1 al 4 (excluido) con 8
        Arrays.fill(MiArray , 1 , 4 , 8);

        // imprimir el contenido del array
        for (int n : MiArray) {
            System.out.printf("Contenido de MiArray es : %d%n" , n);
        }


        // ordenar un array
        int MiArrayOrdenado [] = {5,8,4,2,7,2,1,9,3,6,0};
        System.out.printf("Arrays.sort(int [] a) = ordena el contenido del array%n");
        // el método Arrays.sort ordena los valores que tiene el Array almacenado
        Arrays.sort(MiArrayOrdenado);

        for (int n : MiArrayOrdenado) {
            System.out.printf("%d " , n);
        }
        System.out.println();
        // imprimir el contenido del array
        System.out.printf("Arrays.toString(int [] a) = representa en un String el contenido%n");
        // utilizar el metodo toString para representar en un String el contenido
        System.out.println(Arrays.toString(MiArrayOrdenado));

        // Rellenar un array de 10 con numeros aleatorios
        System.out.printf("Rellena un array con 10 números aleatorios y súmalos.%n");
        int [] arrayAleatorio = new int[10];
        int suma = 0;

        for ( int i = 0 ; i < arrayAleatorio.length ; i++ ) {
            arrayAleatorio[i] = (int) (Math.random() * 100 + 1);
            suma = suma + arrayAleatorio[i];
            System.out.printf("Elemento en la posición %d : %d%n" , i , arrayAleatorio[i]);
        }
        System.out.printf("La suma de los números aleatorios es : %d " , suma);


    }// fin ejecutarPrograma

}// fin-class CreandoArrays
