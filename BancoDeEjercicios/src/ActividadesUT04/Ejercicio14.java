package ActividadesUT04;

import java.util.Arrays;

public class Ejercicio14 {

    public static void ejecutarPrograma () {
        System.out.println (Arrays.toString ( ordenar ( new int[] {5,4,3,1,6,8} ) ));
        System.out.println (Arrays.toString ( ordenarDes ( new int[] {5,4,3,1,6,8} ) ));

    }// fin ejecutarPrograma


    private static int [] ordenar(int [] numeros){
        Arrays.sort ( numeros );
        return numeros;
    }// fin ordenar

    private static int [] ordenarDes(int [] numeros){
        int tamArray = numeros.length;
        boolean intercambiado;
        int[] arrayOrdenado = new int[tamArray];

        // Copiar los elementos del array original al array de ordenado
        for (int i = 0; i < tamArray; i++) {
            arrayOrdenado[i] = numeros[i];
        }

        do {
            intercambiado = false;

            for (int i = 0; i < tamArray - 1; i++) {
                // si el indice n es menor  que n - 1
                if (arrayOrdenado[i] < arrayOrdenado[i + 1]) {
                    // almacena en temp el menor valor
                    int temp = arrayOrdenado[i];
                    // almacena el valor mayor (n+1) en el indice n
                    arrayOrdenado[i] = arrayOrdenado[i + 1];
                    // en el segundo indice se almacena el menor número
                    arrayOrdenado[i + 1] = temp;

                    intercambiado = true;
                }
            }

            // Después de cada iteración, el elemento más grande está en su posición correcta
            // tamArray-- para que compruebe los siguientes números hasta que intercambiado sea false
            tamArray--;
        } while (intercambiado);

        return arrayOrdenado;
    }// fin ordenar

}// fin-class Ejercicio14
