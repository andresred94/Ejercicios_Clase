package EjerciciosPseint;

import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PiedraPapeTijeras {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma() {
        String resp;
        int jugador = 3, opMaquina, cantPartida, contPartida = 0, puntos = 0, contador = 0, jugadorGana = 0, pcGana = 0;

        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERAS = 2;



        System.out.println("¿Jugamos a piedra papel o tijeras?");
        System.out.println("¿Cuantas partidas quieres jugar? ");
        cantPartida = lector.nextInt();
        lector.nextLine();


        while (contPartida < cantPartida) {

            opMaquina = (int) (Math.random() * 2 + 1);
            resp = jugadaJugador();

            switch (resp) {
                case "piedra":
                    jugador = 0;
                    break;
                case "papel":
                    jugador = 1;
                    break;
                case "tijeras":
                    jugador = 2;
                    break;
            }
            switch (opMaquina) {
                case 0:
                    System.out.println("La maquina ha escogido PIEDRA");
                    break;
                case 1:
                    System.out.println("La maquina ha escogido PAPEL");
                    break;
                case 2:
                    System.out.println("La maquina ha escogido TIJERAS");
                    break;
            }

            if (jugador == PIEDRA && opMaquina == TIJERAS) {
                System.out.println("¡Has Ganado! :D");
                jugadorGana = jugadorGana + 1;
            } else if (jugador == TIJERAS && opMaquina == PAPEL) {
                System.out.println("¡Has Ganado! :D");
                jugadorGana = jugadorGana + 1;
            } else if (jugador == PAPEL && opMaquina == PIEDRA) {
                System.out.println("¡Has Ganado! :D");
                jugadorGana = jugadorGana + 1;
            } else if (jugador == opMaquina) {
                System.out.println("¡Ha sido empate! :/");
                contador = contador - 1;
            } else {
                System.out.println("¡Has perdido!");
                pcGana = pcGana + 1;
            }

            System.out.println("tu puntos: " + jugadorGana);
            System.out.println("puntos pc: " + pcGana);

            contador = contador + 1;

            if (pcGana == 3) {
                puntos = puntos + 1;
                System.out.println("Puntos de partida del PC: " + puntos);
                pcGana = 0;
                jugadorGana = 0;
                contPartida = contPartida + 1;
            } else if (jugadorGana == 3) {
                puntos = puntos + 1;
                System.out.println("Puntos de partida del jugador: " + puntos);
                pcGana = 0;
                jugadorGana = 0;
                contPartida = contPartida + 1;
            }

        }// fin-while

    }// fin ejecutarPrograma


    //-- METODOS SECUNDARIOS --//

    /**
     * pide al usuario que ingrese por telado una cadena de caracteres
     * @return opIngresada String
     */
    public static String jugadaJugador() {
        String opIngresada;


        System.out.print("Ingresa una de las tres opciones = ");
        opIngresada = lector.nextLine();
        opIngresada = opIngresada.toLowerCase();

        // control de errores
        while (!(opIngresada.equals("piedra")) && !(opIngresada.equals("papel")) && !(opIngresada.equals("tijeras"))) {
            System.out.print("Error: opcíon no válida, vuelve a ingresar una opción = ");
            opIngresada = lector.nextLine();
            opIngresada = opIngresada.toLowerCase();
        }

        return opIngresada;
    }// fin jugadaJugador


}// fin-class PiedraPapelTijeras
