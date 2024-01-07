package ActividadesUT04_Strings;

public class EjercicioTexto04 {

    public static void main ( String[] args ) {

        String p = "abracadabra";
        System.out.println (contarVocales ( p ));

    }// fin main

    /**
     * Función que cuenta las vocales de un String
     * @param palabra Cadena que se va a analizar
     * @return cantidad de vocales encontradas
     */
    private static int contarVocales(String palabra){
        int cont = 0;
        for ( int i = 0 ; i < palabra.length () ; i++ ) {
            char c = palabra.charAt ( i );

            if ( esVocal ( c ) ){
                cont++;
            }

        }
        return cont;
    }// fin contarVocales

    /**
     * Funcion que comprueba si el caracter ingresado por parametro es vocal
     * @param c caracter que se va a analizar
     * @return true si es vocal
     */
    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }// fin esVocal

}// fin-class EjercicioTexto04
