package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class Array1DSuma {

    public static void main(String[] args) {
        int [] Array1 =  {1,2,3,4,5};
        int [] Array2 =  {1,2,3,4,5};
        sumaArrays(Array1,Array2);
    }

    public static void sumaArrays (int [] array1 , int [] array2){

        int [] sumaArrays = new int [array1.length];
        for (int i = 0; i < sumaArrays.length; i++) {
            sumaArrays[i] = array1[i] + array2[i];
        }

        System.out.println(Arrays.toString(sumaArrays));
        for (int i = 0; i < sumaArrays.length; i++) {
            System.out.printf("%d + %d = %d%n", array1[i] , array2[i] , sumaArrays[i] );
        }

        /*
        for (int i = 0; i < sumaArrays.length; i++) {
            System.out.printf("Valor posicion array1[%d] = %d%n", i + 1, array1[i]);
            System.out.printf("Valor posicion array2[%d] = %d%n", i + 1, array2[i]);
            System.out.printf("Valor posicion sumaArrays[%d] %d%n", i + 1 , sumaArrays[i]);
        }*/


    }// fin SumaArrays

}// Array1DSuma
