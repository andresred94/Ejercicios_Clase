package ActividadesUT04_Strings;

import java.util.Arrays;

public class EjercicioTexto12 {

    public static void main ( String[] args ) {

        String [] palabras = {"un","doh","treh","nueve","cuatro"};
        System.out.println (palabraMasLarga ( palabras ));

    }// fin main

    private static String palabraMasLarga(String [] palabras){
        int tamArray = palabras.length;
        boolean intercambiado;

        Arrays.sort(palabras);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        /*do {// antes de entrar al loop se establece a false porque damos por hecho
            // que los indices están desordenados
            intercambiado = false;

            // Recorre todos los indices del array y termina en el penúltimo
            for (int i = 0; i < tamArray - 1; i++) {
                // si la cantidad de letras de i es menor  que i + 1 (la siguiente)
                if (palabras[i].length () < palabras[i + 1].length ()) {
                    // almacena en temps la palabra más pequeña
                    String temps = palabras[i];
                    // almacena la palabra más larga en el indice i
                    palabras[i] = palabras[i + 1];
                    // en el siguiente indice se almacena el menor número
                    palabras[i + 1] = temps;
                    // si no están intercambiadas TODAS de mayor a menor no sale del bucle while
                    intercambiado = true;
                }
            }// Después de cada iteración, el elemento más grande estará en su posición correcta

            // tamArray-- para que compruebe los siguientes números hasta que intercambiado sea false
            tamArray--;
        } while (intercambiado);*/

        return palabras[(palabras.length)-1];
    }//fin palabraMasLarga

}// fin-class EjercicioTexto12
