package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class ArrayConPares {

    public static void main(String[] args) {
        int [] miArray = {10,2,3,4,6,18};
        int contPar = 0;
        int numPar = 0;

        for (int i = 0; i < miArray.length; i++) {

            if (miArray[i] % 2 == 0){
                contPar++;
            }

        }// fin for

        int [] pares = new int[contPar];

        for (int j = 0; j < contPar; j++) {
            if (miArray[j] % 2 == 0){
                numPar = miArray[j];
                pares[j] = numPar;
            }

            System.out.println( Arrays.toString(pares));
        }

    }// fin main

}// fin-class ArrayConPares
