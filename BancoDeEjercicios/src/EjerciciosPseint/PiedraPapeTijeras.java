package EjerciciosPseint;

import java.util.Scanner;

public class PiedraPapeTijeras {

    //atributos
    static Scanner lector = new Scanner ( System.in );

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma () {
        // atributos
        String resp;
        int jugador = 3, opMaquina, cantPartida, contPartida = 0, puntosUser = 0, puntosPC = 0, contador = 0, jugadorGana = 0, pcGana = 0;

        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERAS = 2;


        // inicio del programa
        System.out.println ( "¿Jugamos a piedra papel o tijeras?" );
        cantPartida = obCantPartidas ();

        // Mientras que el contador de las partidas sea menor que la cantidad de partidas jugadas...
        while ( contPartida < cantPartida ) {

            opMaquina = (int) (Math.random () * 2 + 1);// jugada aleatoria del pc 0 al 2
            resp = jugadaJugador ();// cadena de caracteres que puedes ser "piedra" "papel" "tijeras"

            switch ( resp ) {
                // establece la variable jugador a 0 en caso de que resp sea igual a "piedra"
                case "piedra":
                    jugador = 0;
                    break;
                // establece la variable jugador a 1 en caso de que resp sea igual a "papel"
                case "papel":
                    jugador = 1;
                    break;
                // establece la variable jugador a 2 en caso de que resp sea igual a "tijeras"
                case "tijeras":
                    jugador = 2;
                    break;
            }

            // imprime por pantalla la jugada aleatoria del PC
            switch ( opMaquina ) {
                case 0:
                    System.out.println ( "La maquina ha escogido PIEDRA" );
                    break;
                case 1:
                    System.out.println ( "La maquina ha escogido PAPEL" );
                    break;
                case 2:
                    System.out.println ( "La maquina ha escogido TIJERAS" );
                    break;
            }

            // casos en los que el jugador gana
            if ( jugador == PIEDRA && opMaquina == TIJERAS ) {
                System.out.println ( "¡Has Ganado! :D" );
                jugadorGana = jugadorGana + 1;
            } else if ( jugador == TIJERAS && opMaquina == PAPEL ) {
                System.out.println ( "¡Has Ganado! :D" );
                jugadorGana = jugadorGana + 1;
            } else if ( jugador == PAPEL && opMaquina == PIEDRA ) {
                System.out.println ( "¡Has Ganado! :D" );
                jugadorGana = jugadorGana + 1;
            } else if ( jugador == opMaquina ) {
                System.out.println ( "¡Ha sido empate! :/" );
                contador = contador - 1;
            } else {
                System.out.println ( "¡Has perdido!" );
                pcGana = pcGana + 1;
            }

            // imprime cada vez que gana un encuentro
            System.out.println ( "tu puntos: " + jugadorGana );
            System.out.println ( "puntos pc: " + pcGana );

            contador = contador + 1;

            /*-- mensajes de salida después de cada 3 partidas ganadas-- */
            if ( pcGana == 3 ) {
                puntosPC = puntosPC + 1;
                System.out.println ( "puntos de partida para el PC: " + puntosPC );
                pcGana = 0;
                jugadorGana = 0;
                contPartida = contPartida + 1;
            } else if ( jugadorGana == 3 ) {
                puntosUser = puntosUser + 1;
                System.out.println ( "puntos de partida el jugador: " + puntosUser );
                pcGana = 0;
                jugadorGana = 0;
                contPartida = contPartida + 1;
            }

            /*-- mensajes de salida una vez que se han jugado todas las partidas --*/
            if ( contPartida == cantPartida ) {
                System.out.printf ( "%nTotal de partidas jugadas: %d" , cantPartida );
                System.out.printf ( "%ntotal de partidas ganadas por el PC: %d" , puntosPC );
                System.out.printf ( "%ntotal de partidas ganadas por el jugador: %d%n " , puntosUser );

                if ( puntosPC > puntosUser ) {
                    System.out.println ( "¡Te ha ganado el ordenador!" );
                } else {
                    System.out.println ( "¡Enhorabuena has ganado!" );
                }
            }
        }// fin-while

    }// fin ejecutarPrograma


    //<-- METODOS SECUNDARIOS -->//

    /**
     * pide al usuario que ingrese por telado una cadena de caracteres
     * @return opIngresada String
     */
    public static String jugadaJugador () {
        String opIngresada;

        System.out.print ( "Ingresa una de las tres opciones = " );
        opIngresada = lector.nextLine ();
        opIngresada = opIngresada.toLowerCase ();

        // control de errores
        while ( !(opIngresada.equals ( "piedra" )) && !(opIngresada.equals ( "papel" )) && !(opIngresada.equals ( "tijeras" )) ) {
            System.out.print ( "Error: opcíon no válida, vuelve a ingresar una opción = " );
            opIngresada = lector.nextLine ();
            opIngresada = opIngresada.toLowerCase ();
        }

        return opIngresada;
    }// fin jugadaJugador

    /**
     * funcion que pide un numero por teclado
     * @return cant int
     */
    public static int obCantPartidas () {

        int cant;
        System.out.println ( "¿Cuantas partidas quieres jugar? " );
        cant = lector.nextInt ();
        lector.nextLine ();

        // control de errores
        //todo control de error en caso de ingresar enter o un caracter
        while ( cant <= 0 ) {
            System.out.println ( "Error: has ingresado una opción no válida, ingresa otro número: " );
            cant = lector.nextInt ();
            lector.nextLine ();
        }

        return cant;
    }// fin obCantPartidas

}// fin-class PiedraPapelTijeras