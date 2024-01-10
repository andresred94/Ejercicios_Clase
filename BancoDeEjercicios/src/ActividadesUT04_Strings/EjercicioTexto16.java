package ActividadesUT04_Strings;

public class EjercicioTexto16 {

    public static void main ( String[] args ) {
        String dni = "52053342H";
        System.out.println (esValidoNIF ( dni ));

    }// fin main

    private static boolean esValidoNIF(String nif){
        char letra = nif.charAt ( nif.length () - 1 );
        int indcLetra = 0;
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

        for( int i = 0 ; i < letrasDNI.length (); i++ ) {
            if ( letrasDNI.charAt ( i ) == letra ){
                indcLetra = i;
            }
        }

        int parteEntera = 0;
        for ( int i = 0 ; i < nif.length () - 1 ; i++ ) {
            parteEntera = parteEntera * 10 + Character.getNumericValue ( nif.charAt ( i ) ) ;
        }

        return parteEntera % 23 == indcLetra;
    }// fin esValidoNIF



}// fin-class EjercicioTexto16
