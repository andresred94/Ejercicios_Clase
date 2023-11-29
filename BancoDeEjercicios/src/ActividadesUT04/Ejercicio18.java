package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio18 {

    public static void ejecutarPrograma(){
        imprimirArraySinRepetir ( new int[]  {4,4,4,111,2,2,4,2,2,3,111,4,5} );

    }// ejecutarPrograma
/*
    *//** -- SIN UTILIZAR LA FUNCIÓN estaDentroDe();
     * Función que imprimie un array sin los números repetidos
     * @param numeros array que se va a imprimir
     *//*
    private static void imprimirArraySinRepetir(int [] numeros){
        // Otra posible solución
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                System.out.printf("%d " , numeros[i]);
            } else if (numeros[i] != numeros[i - 1]) {
                System.out.printf("%d " , numeros[i]);
            }
        }
        int cantRepe = 0;
        boolean estaRepetido = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == (numeros[i] + 1)) {
                estaRepetido = true;
            }
        }

        // cuenta los números repetidos
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == (numeros[i] + 1)) {
                cantRepe++;
            }
        }
        System.out.printf("%d " ,cantRepe);
        // crea un array del tamañado de el total menos los repetidos
        int[] nuevoArray = new int[numeros.length - cantRepe];
        int indArr = 0;

        // comprueba que numeros[i] está dentro de nuevoArray , indArr = Indice en el que busca el número
        for (int i = 0; i < numeros.length; i++) {

            if (!estaRepetido) {
                nuevoArray[indArr] = numeros[i];
                indArr++;
            }
        }
        //System.out.println (Arrays.toString ( numeros ));

    }// fin-class imprimirArraySinRepetir*/

    private static void imprimirArraySinRepetir(int [] numeros){
        // Otra posible solución
        // Arrays.sort(numeros);
        System.out.printf ( "%d " , numeros.length );
        // como ordenar el contenido de un array usando bucles for
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Comparar elementos adyacentes y intercambiar si están en el orden incorrecto
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.print (Arrays.toString ( numeros ));

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                System.out.printf("%d " , numeros[i]);
            } else if (numeros[i] != numeros[i - 1]) {
                System.out.printf("%d " , numeros[i]);
            }
        }

        int cantRepe = 0;
        // cuenta los números repetidos
        for (int i = 0; i < numeros.length; i++) {
            if (estaDentroDe(numeros, numeros[i], i)) {
                cantRepe++;
            }
        }

        // crea un array del tamañado de el total menos los repetidos
        int[] nuevoArray = new int[numeros.length - cantRepe];
        int indArr = 0;

        // comprueba que numeros[i] está dentro de nuevoArray , indArr = Indice en el que busca el número
        for (int i = 0; i < numeros.length; i++) {

            if (!estaDentroDe(nuevoArray, numeros[i] , indArr)) {
                nuevoArray[indArr] = numeros[i];
                indArr++;
            }
        }

        System.out.println (Arrays.toString ( nuevoArray ));

    }// fin-class imprimirArraySinRepetir

    /**
     * Función que comprueba que num está dentro del numeros.
     * @param numeros Array que se va a recorrer para comprobarlo
     * @param num Número entero que se va a buscar
     * @param indFin Tamaño del indice del array que se ingresa
     * @return true = si se encuentra dentro del Array
     * */

    private static boolean estaDentroDe (int[] numeros, int num, int indFin){
        for (int i = 0; i < indFin; i++) {
            if (numeros[i] == num) {
                return true;
            }
        }
        return false;
    }// fin estaDentroDe

}// fin-class Ejercicio18
