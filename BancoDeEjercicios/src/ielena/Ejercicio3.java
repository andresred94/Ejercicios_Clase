package ielena;

public class Ejercicio3 {
    public static void main(String[] args) {
        boolean [] array1 = {true,false,false,true,true,true};
        boolean [] array2 = {false,false,true,false,true,false};
        int [] array3 = rellenar(array1,array2);
        mostrar(array3);
    }

    public static int [] rellenar(boolean[] arr1, boolean []arr2){
        int [] arrayRes = new int[arr1.length];
        for (int i = 0; i < arrayRes.length; i++) {
            if (arr1[i] == arr2[i]){
                arrayRes[i] = 1;
            } else {
                arrayRes[i] = 0;
            }

        }

        return arrayRes;
    }

    public static void mostrar(int [] arr3){
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%d ", arr3[i]);
        }
    }


}// Ejercicio3
