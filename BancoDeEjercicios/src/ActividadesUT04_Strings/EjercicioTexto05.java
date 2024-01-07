package ActividadesUT04_Strings;

public class EjercicioTexto05 {

    public static void main ( String[] args ) {

        System.out.println (piedraPapelTijera ( "piedra","papel" ));
        System.out.println (piedraPapelTijera ( "papel","papel" ));
        System.out.println (piedraPapelTijera ( "TIJERA","tijera" ));
        System.out.println (piedraPapelTijera ( "papel","papeles" ));
        System.out.println (piedraPapelTijera ( "tijera","papel" ));

    }// fin main

    /**
     * Funcion que comvierte dos cadenas ingresadas como parametros en minusculas que
     * simulan dos jugadores del juego de piedra papel o tijera
     * @param jugada1
     * @param jugada2
     * @return
     */
    private static String piedraPapelTijera(String jugada1, String jugada2){
        jugada1.toLowerCase ();
        jugada2.toLowerCase ();
        String a = "¡Gano el jugador 1!";
        String b = "¡Gano el jugador 2!";
        String c = "¡Empate!";
        String e = "Error -1: parámetros ingresados no válidos";

        if ( jugada1.length () > 6 || jugada2.length () > 6 ){
            return e;
        }

        // gana la piedra
        if ( jugada1.equals ( "piedra" ) && jugada2.equals ( "tijera" )){
           return a;
        } else if ( jugada2.equals ( "piedra" ) && jugada1.equals ( "tijera" ) ) {
            return b;
        }

        // gana tijera
        if ( jugada1.equals ( "tijera" ) && jugada2.equals ( "papel" ) ){
            return a;
        } else if ( jugada2.equals ( "tijera" ) && jugada1.equals ( "papel" ) ) {
            return b;
        }

        // gana papel
        if ( jugada1.equals ( "papel" ) && jugada2.equals ( "piedra" ) ){
            return a;
        } else if ( jugada2.equals ( "papel" ) && jugada1.equals ( "piedra" ) ) {
            return b;
        }

        return c;

    }// fin piedraPapelTijera

}// fin-class EjercicioTexto05
