package ActividadesUT04_Strings;

public class EjercicioTexto05 {

    public static void main ( String[] args ) {

        System.out.println (piedraPapelTijera ( "piedra","papel" ));
        System.out.println (piedraPapelTijera ( "papel","papel" ));
        System.out.println (piedraPapelTijera ( "mesa","tijera" ));
        System.out.println (piedraPapelTijera ( "papel","papel " ));
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
        jugada1.replaceAll(" ", "");
        jugada2.replaceAll(" ", "");
        System.out.println(jugada2);
        String a = "¡Gano el jugador 1!";
        String b = "¡Gano el jugador 2!";
        String c = "¡Empate!";
        String e = "Error -1: parámetros ingresados no válidos";

        if ( !((jugada1.equals("piedra") || (jugada1.equals("papel")) || (jugada1.equals("tijera")))) ||
        !(jugada2.equals("piedra") || (jugada2.equals("papel")) || (jugada2.equals("tijera")) )) {
            return e;
        }

        if (jugada1.equals(jugada2)){
            return c;
        } else if ((jugada1.equals("piedra") && jugada2.equals("tijera")) ||
                (jugada1.equals("tijera") && jugada2.equals("papel")) ||
                (jugada1.equals("papel") && jugada2.equals("piedra"))) {
            return a;
        } else {
            return b;
        }

    }// fin piedraPapelTijera

}// fin-class EjercicioTexto05
