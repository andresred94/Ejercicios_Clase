package ActividadesUT04_Strings;

public class EjercicioTexto08 {
    public static void main ( String[] args ) {
        System.out.println (ordenadorAmovil ( "3321" ));

    }// fin mainç

    /**
     * Función que convierte en estandar un teclado
     * @param numero teclas presionadas en un teclado de orenador
     * @return teclas presionadas en el movil
     */
    private static String ordenadorAmovil(String numero){
        StringBuilder r =  new StringBuilder ();
        for ( int i = 0 ; i < numero.length () ; i++ ) {
            char c = numero.charAt ( i );
            switch ( c ){
                case '7':
                    r.append ( "1" );
                    break;
                case '8':
                    r.append ( "2" );
                    break;
                case '9':
                    r.append ( "3" );
                    break;
                case '4':
                    r.append ( "4" );
                    break;
                case '5':
                    r.append ( "5" );
                    break;
                case '6':
                    r.append ( "6" );
                    break;
                case '1':
                    r.append ( "7" );
                    break;
                case '2':
                    r.append ( "8" );
                    break;
                case '3':
                    r.append ( "9" );
                    break;
            }
        }
        return r.toString ();
    }// fin ordenadorAmovil


}// fin-class EjercicioTexto08
