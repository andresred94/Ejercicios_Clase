package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class BuscarElementoArray {

    public static void main(String[] args) {
        int [] MiArray = {4,2,2,1,5,4};
        int numBuscado = 2;
        int posiciconEncontrada = comprobarPosicion(MiArray,numBuscado);
        if (posiciconEncontrada == -1){
            System.out.printf ( "El número %d no se encuentra dentro del Array.%n" , numBuscado );
        }

    }// fin main

    private static int comprobarPosicion(int [] numeros , int num){
        int posEncontrada=0;

        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                cont++;
            }
        }

        int posc = 0;
        int [] posiciones = new int[cont];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                posiciones[posc] = i + 1;
                posc++;
            }
        }

        if (estaDentro(numeros,num)){
            for (int i = 0; i < numeros.length; i++) {
                posEncontrada = i + 1;
            }
        } else {
            posEncontrada = -1;
        }

        return posEncontrada;
    }// fin comprobarPosicion

    private static boolean estaDentro(int [] numeros , int num){
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                return true;
            }
        }
        return false;
    }

}// fin-class BuscarElementoArray
