package ActividadesUT04_Strings;

public class EjercicioTexto01 {

    public static void main ( String[] args ) {

        String cadtxt = "aabc123";
        int noDigits = contarCaracteresNoNumericos ( cadtxt );

        if ( noDigits > 0 ){
            System.out.printf ( "Hay %d caracteres no numéricos." , noDigits );
        } else {
            System.out.printf ( "La cadena no contiene caracteres numéricos." );
        }

    }// fin main

    private static int contarCaracteresNoNumericos(String cadena){
        int cont = 0;
        // Verificar si cada carácter es un dígito
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (!Character.isDigit(caracter)) {
                cont++;
            }
        }
        return cont;

    }// fin contarCaracteresNoNumericos

}// fin-class EjercicioTexto01
