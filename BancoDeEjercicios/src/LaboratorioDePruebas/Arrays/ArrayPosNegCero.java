package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class ArrayPosNegCero {

    public static void main(String[] args) {

        int [] numeros = {-1,-2,-1,-5,0,0,0,2,1,2};
        int [] respuesta =  comprobarNumero(numeros);
        System.out.println(Arrays.toString(respuesta));

    }// fin main

    /**
     * Función que comprueba cuando el número de un array es postivo negativo o cero
     * @param num Array que vamos a comprobar
     * @return Array con la cantidad de positivos , negativos y ceros
     */
    private static int [] comprobarNumero( int [] num){

        int nPos = 0 , nNeg = 0, nCero = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0){
                nCero++;
            } else if (num[i] > 0){
                nPos++;
            } else {
                nNeg++;
            }
        }

        int [] salida = new int [3];

        salida[0] = nPos;
        salida[1] = nNeg;
        salida[2] = nCero;

        return salida;
    }// comprobarNumero

}// fin-class ArrayPosNegCero
