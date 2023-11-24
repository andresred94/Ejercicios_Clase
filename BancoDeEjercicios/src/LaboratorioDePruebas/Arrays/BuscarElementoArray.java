package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class BuscarElementoArray {

    public static void main(String[] args) {
        int [] MiArray = {1,2,2,4,5};
        int [] posiciones = comprobarPosicion(MiArray,2);

        System.out.print(Arrays.toString(posiciones));
    }

    private static int [] comprobarPosicion(int [] numeros , int num){
        int encontrados = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                encontrados++;
            }
        }

        int [] cantEncontrados = new int[encontrados];
        int inCantEnc = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num){
                cantEncontrados[inCantEnc] = i + 1;
                inCantEnc++;
            }
        }
        return cantEncontrados;
    }

}// fin-class BuscarElementoArray
