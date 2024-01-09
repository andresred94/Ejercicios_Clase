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
        palabra.toLowerCase();
        int cont = 0;
        for ( int i = 0 ; i < palabra.length () ; i++ ) {
            char c = palabra.charAt ( i );

            if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                cont++;
            }

        }
        return cont;
    }// fin contarVocales

}// fin-class EjercicioTexto04
