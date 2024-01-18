package ActividadesUT04_Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

public class EjercicioTexto17 {

    public static void main ( String[] args ) {
        String parrf = "recibe un string con un párrafo y retorna otro con la misma frase en la que la primera letra de todas sus palabras está en mayúscula.";
        System.out.println (parrafoMayusculas ( parrf ));

    }// fin main

    /**
     * Función que recibe un string con un párrafo y retorna otro con la misma frase
     * en la que la primera letra de todas sus palabras está en mayúscula.
     * @param parrafo String que se va a analizar
     * @return un nuevo String con el formato adecuado
     */
    private static String parrafoMayusculas(String parrafo){
        /*
        String [] palDiv = parrafo.split(" ");
        String [] rsp = new String[palDiv.length];
        for (int i = 0; i < palDiv.length; i++) {
            String p = palDiv[i];
            char c = p.charAt(0);
            c = Character.toUpperCase(c);
            rsp[i] = c + p.substring(1);

        }
        String rp = "";
        for (int i = 0; i < rsp.length; i++) {
            rp +=  rsp[i] + " ";
        }
        */
        // la primera letra siempre será en mayusculas
        String rsp = (String.valueOf ( parrafo.charAt ( 0 ) )).toUpperCase ();

        // empezamos a recorrerlo desde la 2da letra
        for (int i = 1; i < parrafo.length(); i++) {
            if (parrafo.charAt(i - 1) == ' ') {
                rsp += Character.toString(parrafo.charAt(i)).toUpperCase();
            } else {
                rsp += parrafo.charAt(i);
            }
        }
        return rsp;
    }// fin main parrafoMayusculas

}// fin-class EjercicioTexto17
