package LaboratorioDePruebas.Arrays;

import java.util.Arrays;

public class ArrayConPares {

    public static void ejecutarPrograma() {
        System.out.println(Arrays.toString(filtrarPares(new int[]{2, 3, 4, 5, 6, 7, 8})));
    }

    private static int[] filtrarPares(int[] numeros) {
        int contPar = 0;

        // Primer bucle para contar números pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPar++;
            }
        }

        int[] contPares = new int[contPar];
        int indiceContPares = 0;

        // Segundo bucle para almacenar números pares en contPares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contPares[indiceContPares] = numeros[i];
                indiceContPares++;
            }
        }

        return contPares;
    }

    // Puedes implementar aquí el método contarTarrays1D si es necesario

    public static void main(String[] args) {
        ejecutarPrograma();
    }

}// fin-class ArrayConPares
