package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class BuscarElementoArray {

    public static void main(String[] args) {
        int [] MiArray = {1,2,2,4,5};
        System.out.printf ( "Se encuentra la posición: " );
        System.out.print(comprobarPosicion(MiArray,1));
    }// fin main

    private static int comprobarPosicion(int [] numeros , int num){
        int posEncontrada=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                posEncontrada = i + 1;
            }
        }

        return posEncontrada;
    }// fin comprobarPosicion

}// fin-class BuscarElementoArray
