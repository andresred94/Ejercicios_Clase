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
        StringBuilder resultado = new StringBuilder();
        for ( int i = 0 ; i < cadena.length () ; i++ ) {
            char c = cadena.charAt ( i );
            if ( !esVocal ( c ) ){
                resultado.append ( c );
            }
        }
        return resultado.toString ();

        //return cadena.replaceAll("[aeiouAEIOU]", "");// otra solución

    }// fin eliminarVocales

    /**
     * Funcion que comprueba si el caracter ingresado por parametro es vocal
     * @param c caracter que se va a analizar
     * @return true si es vocal
     */
    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }// fin esVocal

}// fin-class EjercicioTexto03
