package ActividadesUT04_Strings;

public class EjercicioTexto11 {
    public static void main ( String[] args ) {
        String freaseCualquiera = "La ruta nos aporto otro paaso natural.";//false
        String palindromo1 = "La ruta nos aporto otro paso natural.";//true
        String palindromo2 = "Dabale arroz a la zorra el abad.";// true
        System.out.println (palindromo ( freaseCualquiera ));
        System.out.println (palindromo ( palindromo1 ));
        System.out.println (palindromo ( palindromo2 ));
    }// fin main

    private static boolean palindromo(String cadena){
        StringBuilder pali = new StringBuilder ();
        // primero quitamos los espacios en blanco y convertimos a minuscula e la palabra ingresada
        String palNormal = (cadena.replaceAll( "\\s","" )).toLowerCase ();
        palNormal = palNormal.replaceAll ( "\\.","" );// quita el punto final
        // invertimos la palabra
        for ( int i = palNormal.length () - 1 ; i >= 0 ; i-- ) {
            char c = palNormal.charAt (i);
            pali.append ( c );
        }
        // convertimos el StrinBuilder a String
        String palabraInvertida = pali.toString ();

        //System.out.println (palInvertida);
        //System.out.println (palNormal);
        // contentEquals() - El resultado es verdadero si y sólo si este String representa la misma
        // secuencia de caracteres que el StringBuffer especificado
        return palabraInvertida.contentEquals ( palNormal );
    }// fin palindromo

}// fin-class EjercicioTexto11
