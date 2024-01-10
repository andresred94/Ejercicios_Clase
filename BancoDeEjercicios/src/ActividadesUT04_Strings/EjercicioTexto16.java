package ActividadesUT04_Strings;

public class EjercicioTexto16 {

    public static void main ( String[] args ) {
        String dni = "52053342H";
        System.out.println (esValidoNIF ( dni ));

    }// fin main

    /**
     * Función que devuelve un boolean si el número de DNI es correcto
     * @param nif número de DNI que se va a nalizar
     * @return true si el número de DNI es correcto
     */
    private static boolean esValidoNIF(String nif){
        // guardamos la letra
        char letra = nif.charAt ( nif.length () - 1 );
        int indcLetra = 0;
        // String que contiene todas las letras en orden
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        // Recorremos el String y guardamos la posicion en donde se encuentra
        for( int i = 0 ; i < letrasDNI.length (); i++ ) {
            if ( letrasDNI.charAt ( i ) == letra ){
                indcLetra = i;
            }
        }
        // Convertimos el String a int para poder realizar la division
        int parteEntera = 0;
        for ( int i = 0 ; i < nif.length () - 1 ; i++ ) {
            parteEntera = parteEntera * 10 + Character.getNumericValue ( nif.charAt ( i ) ) ;
        }

        return parteEntera % 23 == indcLetra;
    }// fin esValidoNIF
}// fin-class EjercicioTexto16
