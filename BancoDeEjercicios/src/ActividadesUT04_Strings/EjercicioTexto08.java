package ActividadesUT04_Strings;

public class EjercicioTexto08 {
    public static void main ( String[] args ) {
        System.out.println (ordenadorAmovil ( "789" ));

    }// fin mainç

    /**
     * Función que convierte en estandar un teclado
     * @param numero teclas presionadas en un teclado de orenador
     * @return teclas presionadas en el movil
     */
    private static String ordenadorAmovil(String numero){
        String r = "";
        for ( int i = 0 ; i < numero.length () ; i++ ) {
            char c = numero.charAt ( i );

            switch ( c ){
                case '7':
                    r.replaceAll("7","1");
                    break;
                case '8':
                    r.replaceAll("[8]","[2]");
                    break;
                case '9':
                    r.replaceAll("[9]","[3]");
                    break;
                case '1':
                    r.replaceAll("[1]","[7]");
                    break;
                case '2':
                    r.replaceAll("[2]","[8]");;
                    break;
                case '3':
                    r.replaceAll("[3]","[9]");;
                    break;
                default:
                    r.replaceAll("[456]","[456]");
                    break;
            }
        }
        return r;
    }// fin ordenadorAmovil

}// fin-class EjercicioTexto08
