package ActividadesUT04_Strings;

import java.sql.Array;
import java.util.Arrays;

public class EjercicioTexto14 {
    public static void main(String[] args) {
        String palabara1 = "hola";
        String palabara2 = "adios";
        System.out.println(unirCadena(palabara1,palabara2));

    }

    private static String unirCadena(String cad1, String cad2){

        char [] entrelazadas = new char[cad1.length() + cad2.length()];

        for (int i = 0; i < cad1.length(); i++) {
            char p1 = cad1.charAt(i);
            for (int j = 0; j < cad2.length(); j++) {
                char p2 = cad2.charAt(j);
                for (int k = 0; k < entrelazadas.length - 1; k++) {
                    entrelazadas[i] = p1;
                    entrelazadas[i + 1] = p2;
                }
            }
        }

        String rsp = Arrays.toString(entrelazadas);
        return rsp;
    }// fin unirCadena


}// fin-class EjercicioTexto14
