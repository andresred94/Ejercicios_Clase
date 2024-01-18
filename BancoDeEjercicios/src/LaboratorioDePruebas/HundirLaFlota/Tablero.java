package LaboratorioDePruebas.HundirLaFlota;

import java.util.Arrays;

public class Tablero {

    // atributos
    final static int longitudTablero = 10;
    final static char agua = '-';
    final static char barco = 's';
    final static char hit = 'X';
    final static char fallo = 'O';
    static final int numBarcos = 5;

    // metodos principales
    private static char [][] tableroDeJuego = crearTableroDejuego(longitudTablero, agua, barco, numBarcos);

    private static char[][] crearTableroDejuego ( int longitudTablero , char agua , char barco , int numBarcos ) {
        char [][] tableroDeJuego = new char[longitudTablero][longitudTablero];

        // rellena el tablero con agua
        for ( int i = 0 ; i < tableroDeJuego.length ; i++ ) {
            Arrays.fill ( tableroDeJuego[i] , agua  );
        }
        return ubicacionBarcos(tableroDeJuego , numBarcos , agua , barco);
    }

    private static char[][] ubicacionBarcos ( char[][] tableroDeJuego , int numBarcos , char agua , char barco ) {
        int barcosPosicionados = 0;
        int ltablero = tableroDeJuego.length;
        while ( barcosPosicionados < numBarcos ){
            int [] localizacion = generarCoordenadasBarco(ltablero);
            char posibleColocacion = tableroDeJuego[localizacion[0]][localizacion[1]];
            if ( posibleColocacion == agua ){
                tableroDeJuego[localizacion[0]][localizacion[1]] = barco;
                barcosPosicionados++;
            }
        }
        return tableroDeJuego;
    }

    private static int[] generarCoordenadasBarco ( int ltablero ) {
        int [] coordenadas = new int [2];
        // genera una posicion aleatoria de una fila y columna
        for ( int i = 0 ; i < coordenadas.length ; i++ ) {
            coordenadas[i] = (int) (Math.random () * ltablero + 1);
        }
        return coordenadas;
    }

    // Getters y Setters
    public static char[][] getTableroDeJuego () {
        return tableroDeJuego;
    }

    public static void setTableroDeJuego ( char[][] tableroDeJuego ) {
        Tablero.tableroDeJuego = tableroDeJuego;
    }

    // Metodos constructores
    private static void Tablero (){
        //tableroDeJuego
    }
}// fin-class Tablero
