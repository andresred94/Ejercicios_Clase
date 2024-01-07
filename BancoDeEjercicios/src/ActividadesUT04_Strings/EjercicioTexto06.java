package ActividadesUT04_Strings;

public class EjercicioTexto06 {

    public static void main ( String[] args ) {
        String c = "Arriba la birra";
        System.out.println (cadenaDelReves ( c ));
    }// fin main

    /**
     * Función que recorre un String ingresado por parámetro desde el final
     * hasta el inicio. Almacena cada caacter de la cadena en una variable y
     * lo concatena a la variable resultado.
     * @param cadena String que se va a utilizar
     * @return String del revéz
     */
    private static String cadenaDelReves(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for ( int i = cadena.length () - 1 ; i >= 0 ; i-- ) {
            char c = cadena.charAt ( i );
            resultado.append ( c );
        }

        return resultado.toString ();
    }// fin cadenaDelReves

}// fin-class EjercicioTexto06
