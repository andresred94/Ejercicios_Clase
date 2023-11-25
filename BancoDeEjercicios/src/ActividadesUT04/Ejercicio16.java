package ActividadesUT04;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Ejercicio16 {

    public static void ejecutarPrograma(){

        System.out.println (menor ( new int[] {1,2,4,-1,6} ));

    }// fin ejecutarPrograma

    private static int menor(int [] array){
        // ToDo Buscar otras maneras de hacerlo
        Arrays.sort ( array );
        int n = array[0];
        return n;
    }// fin menor

}// fin-class Ejercicio16
