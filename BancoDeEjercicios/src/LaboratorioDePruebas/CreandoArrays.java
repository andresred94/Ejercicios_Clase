package LaboratorioDePruebas;

import java.util.Arrays;

public class CreandoArrays {

    public static void ejecutarPrograma (){
        int [] MiArray = {1,2,3,4,5};

        // MiArray.length - 1 --> porque el indice empieza en 0
        for ( int i = MiArray.length - 1 ; i >= 0 ; i-- ) {
            System.out.printf("Elemento en la posición %d : %d%n" , i , MiArray[i]);
        }

        System.out.printf("Rellenando el array usando el método Arrays.fill%n");
        System.out.printf("utilizando Arrays.fill (int[] a , valor)%n");
        // rellena el array con 1
        Arrays.fill(MiArray, 1);

        System.out.printf("Rellenar del indice 1 al 3 con 8%n");
        // int toIndex = este valor se excluye en el caso de enteros
        System.out.printf("utilizando Arrays.fill (int[] a, int fromIndex, int toIndex, int val)%n");

        // rellenar un array del indice 1 al 4 (excluido) con 8
        Arrays.fill(MiArray , 1 , 4 , 8);

        // imprimir el contenido del array
        for (int n : MiArray) {
            System.out.printf("Contenido de MiArray es : %d%n" , n);
        }

        // ordenar un array
        int MiArrayOrdenado [] = {5,8,4,2,7,2,1,9,3,6,0};

        // el método Arrays.sort ordena los valores que tiene el Array almacenado
        Arrays.sort(MiArrayOrdenado);

        // imprimir el contenido del array
        for (int n : MiArrayOrdenado) {
            System.out.printf("%d " , n);
        }


    }// fin ejecutarPrograma

}// fin-class CreandoArrays
