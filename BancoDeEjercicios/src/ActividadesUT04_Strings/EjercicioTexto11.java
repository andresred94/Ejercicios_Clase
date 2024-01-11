package ActividadesUT04_Strings;

public class EjercicioTexto11 {
    public static void main ( String[] args ) {
        String freaseCualquiera = "La ruta nos aporto otro paaso natural.";//false
        String palindromo1 = "La ruta nos aporto otro paso natural.";//true
        String palindromo2 = "Se verlas al reves.";// true
        String palindromo3 = "Arriba la birra.";// true

        System.out.println (palindromo ( freaseCualquiera ));
        System.out.println (palindromo ( palindromo1 ));
        System.out.println (palindromo ( palindromo2 ));
        System.out.println (palindromo ( palindromo3 ));


    }// fin main

    private static boolean palindromo(String cadena){
        String pali = "";
        // primero quitamos los espacios en blanco y convertimos a minuscula e la palabra ingresada
        String palNormal = (cadena.replaceAll( "\s","" )).toLowerCase ();// quitar espacios en blanco
        palNormal = palNormal.replaceAll ( "\\.","" );// quita el punto final
        // invertimos la palabra
        for ( int i = palNormal.length () - 1 ; i >= 0 ; i-- ) {
            char c = palNormal.charAt (i);
            pali += Character.toString(c);
        }
        //System.out.println (pali);
        //System.out.println (palNormal);

        return pali.contains ( palNormal );
    }// fin palindromo

}// fin-class EjercicioTexto11
