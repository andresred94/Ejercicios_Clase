package ActividadesUT04_Strings;

public class EjercicioTexto03 {

    public static void main ( String[] args ) {
        String cadtxt = "murcielago";
        System.out.println (eliminarVocales ( cadtxt ));
    }// fin main

    /**
     * Función que elimina las vocales de un String
     * @param cadena que se va a analizar
     * @return la cadena sin valores
     */
    private static String eliminarVocales(String cadena){
        // StringBuilder es un String que se puede modificar
        String resp = "";
        for ( int i = 0 ; i < cadena.length () ; i++ ) {
            char c = cadena.charAt ( i );
            if ( !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') ){
                resp += cadena.charAt(i);
            }
        }
        return resp;

        //return cadena.replaceAll("[aeiouAEIOU]", "");// otra solución

    }// fin eliminarVocales

}// fin-class EjercicioTexto03
