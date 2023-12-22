package ActividadesUT04;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio18 {

    public static void ejecutarPrograma(){
        imprimirArraySinRepetir ( new int[]  {4,4,4,111,2,2,4,2,2,3,111,4,5} );
        //imprimirArraySinRepetirv2 ( new int[]  {4,4,4,111,2,2,4,2,2,3,111,4,5} );
        //System.out.println (ThreadLocalRandom.current ().nextInt (1,10));

    }// ejecutarPrograma

    /*private static void imprimirArraySinRepetirv2(int [] numeros) {
        boolean repetido=false;
        for (int i=0;i<numeros.length;i++) {
            for (int j=0;j<i;j++) {
                if (numeros[i]==numeros[j]) {
                    repetido=true;
                }
            }
            if (!repetido) {
                System.out.print(numeros[i]+"  ");
            }
            repetido=false;
        }
    }*/

    private static void imprimirArraySinRepetir(int [] numeros){

        // Otra posible solución
        // Arrays.sort(numeros);
        // como ordenar el contenido de un array usando bucles for
        /*for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // Comparar elementos adyacentes y intercambiar si están en el orden incorrecto
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }*/

        //System.out.print (Arrays.toString ( numeros ));

        // imprime solo los números que nose repiten
        /*for (int i = 0; i < numeros.length; i++) {
            if (i == 0){
                System.out.printf("%d " , numeros[i]);
            } else if (numeros[i] != numeros[i - 1]) {
                System.out.printf("%d " , numeros[i]);
            }
        }*/

        // cuenta los números que están repetidos
        int cantSinRepe = 0;
        for (int i = 0; i < numeros.length; i++) {
            // Verificar si el número ya está en el nuevo array
            boolean repetido = false;
            // comprueba si numeros i == numeros i - 1
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }
            }

            // Cuenta cada vez que no está repetido. Si está repetido lo cuenta solo 1 vez.
            if (!repetido) {
                cantSinRepe++;
            }
        }// fin-fori

        // crea un array con los números sin repetirse
        int[] nuevoArray = new int[cantSinRepe];

        int indArr = 0;

        // Recorre las 13 posiciones de numeros.
        for (int i = 0; i < numeros.length; i++) {
            // Verificar nuevamente si el número ya está en el nuevo array
            boolean repetido = false;
            // Recorre nuevoArray y comprueba si ya está dentro de nuevoArray[j] el número numeros[i]
            for (int j = 0; j < indArr; j++) {
                // Si ya estaba dentro estonces está repetido
                if (numeros[i] == nuevoArray[j]) {
                    repetido = true;
                }
            }

            // Si no está repetido, agregarlo al nuevo array
            if (!repetido) {
                nuevoArray[indArr] = numeros[i];
                indArr++;
            }
        }

        /*for (int i = 0; i < numeros.length; i++) {

            if (!estaDentroDe(nuevoArray, numeros[i] , indArr)) {
                nuevoArray[indArr] = numeros[i];
                indArr++;
            }
        }*/

        System.out.println (Arrays.toString ( nuevoArray ));

    }// fin imprimirArraySinRepetir

    /**
     * Función que comprueba que num está dentro del numeros.
     * @param numeros Array que se va a recorrer para comprobarlo
     * @param num Número entero que se va a buscar
     * @param indFin Tamaño del indice del array que se ingresa
     * @return true = si se encuentra dentro del Array
     * */
/*
    private static boolean estaDentroDe (int[] numeros, int num, int indFin){
        for (int i = 0; i < indFin; i++) {
            if (numeros[i] == num) {
                return true;
            }
        }
        return false;
    }// fin estaDentroDe*/

}// fin-class Ejercicio18
