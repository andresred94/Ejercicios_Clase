package ActividadesUT04_Strings;

public class EjercicioTexto02 {

    public static void main ( String[] args ) {

        String cadtxt = "111123";
        boolean esCierto = todosNumericos ( cadtxt );
        if ( esCierto ){
            System.out.printf ( "Todos los caracteres de la cadena son numericos." );
        } else {
            System.out.printf ( "La cadena contiene caracteres NO numericos." );
        }

    }

    private static boolean todosNumericos(String cadena){

        for ( int i = 0 ; i < cadena.length () ; i++ ) {
            char caracter = cadena.charAt ( i );
            if ( !Character.isDigit( caracter ) ){
                return false;
            }

        }
        return true;
    }// fin todosNumericos

}// fin-class EjercicioTexto02
