package EjerciciosPseint;

import java.io.BufferedReader;
import java.util.Scanner;

public class PiedraPapeTijeras {

    //atributos
    static Scanner lector = new Scanner(System.in);

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma() {
        String resp;
        int jugador = 3, opMaquina;

        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERAS = 2;

        opMaquina = (int) (Math.random() * 2 + 1);

        System.out.println("¿Juegas piedra papel o tijeras?");
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
            default:
                System.out.println("error: no has ingresado una opcion válida");
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
        } else if (jugador == TIJERAS && opMaquina == PAPEL) {
            System.out.println("¡Has Ganado! :D");
        } else if (jugador == PAPEL && opMaquina == PIEDRA) {
            System.out.println("¡Has Ganado! :D");
        } else if (jugador == opMaquina) {
            System.out.println("¡Ha sido empate! :/");
        } else {
            System.out.println("¡Has perdido!");
        }


    }// fin ejecutarPrograma


    //-- METODOS SECUNDARIOS --//
    public static String jugadaJugador() {
        String opIngresada;

        System.out.println("ingresa una de las tres opciones");
        opIngresada = lector.nextLine();
        opIngresada = opIngresada.toLowerCase();

        return opIngresada;
    }// fin jugadaJugador


}
