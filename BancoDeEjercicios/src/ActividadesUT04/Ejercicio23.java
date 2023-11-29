package ActividadesUT04;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio23 {

    private static Scanner lector = new Scanner(System.in);


    public static void ejecutarPrograma() {

        int[][] numPremiados = loterialNavidad();

        // haciendo trampas... para comprobar el funcionamiento
        for (int i = 0; i < numPremiados.length; i++) {
            System.out.println(Arrays.toString(numPremiados[i]));
        }

        /*//Rellenar un array de 2D con números
        System.out.printf ( "¿Cuantos décimos has comprado? = " );
        int cantDecimos = lector.nextInt ();

        int[][] decComprados = new int[cantDecimos][2];

        for ( int i = 0 ; i < cantDecimos ; i++ ) {
            System.out.printf ( "Ingresa un décimo = " );
            int nIn = lector.nextInt ();
            decComprados[i][0] = i + 1;
            decComprados[i][1] = nIn;
        }*/

        System.out.printf("¿Cuantos décimos has comprado? = ");
        int cantDecimos = lector.nextInt();
        int[] misDecimos = new int[cantDecimos];
        for (int i = 0; i < misDecimos.length; i++) {
            System.out.printf("Ingresa un décimo = ");
            int nIn = lector.nextInt();
            misDecimos[i] = nIn;
        }

        comprobarSorteoNavidad(numPremiados, misDecimos);

    }// ejecutarPrograma

    /**
     * Función que comprueba los números ingresados en en un array de 1D con los de un array de 2D
     * Dependiendo de la posiscion de la fila en la que se encuentra, genera un resultado distinto.
     *
     * @param premios Array 2D la primera columna indica el premio y la segunda el numero ganador
     * @param decimos Los números que el usuario ha escogido y que se van a comprobar
     */
    private static void comprobarSorteoNavidad(int[][] premios, int[] decimos) {

        System.out.printf("Decimos ganadores:%n");
        for (int i = 0; i < premios.length; i++) {
            System.out.println(Arrays.toString(premios[i]));
        }

        System.out.printf("Decimos comprados:%n");
        System.out.println(Arrays.toString(decimos));

        int encontrados = 0;

        // Cuenta las veces que un decimo tiene premio en un Array 2D
        /*
        for ( int i = 0 ; i < premios.length ; i++ ) {
            for ( int j = 0 ; j < decComprados.length ; j++ ) {
                if ( decComprados[j][1] == premios[i][1] ){
                    encontrados++;
                }
            }
        }*/

        // Cuenta las veces que un decimo tiene premio
        for (int i = 0; i < premios.length; i++) {
            for (int j = 0; j < decimos.length; j++) {
                if (decimos[j] == premios[i][1]) {
                    encontrados++;
                }
            }
        }

        // crea un Array de 2D con la cantidad de números premiados
        int[][] decPremiados = new int[encontrados][2];
        int fila = 0;

        // almacena cada número premiado con la posicicion que ocupa en el array de premios
        for (int i = 0; i < premios.length; i++) {
            for (int j = 0; j < decimos.length; j++) {
                if (premios[i][1] == decimos[j]) {
                    decPremiados[fila][0] = premios[i][0];
                    decPremiados[fila][1] = premios[i][1];
                    fila++;
                }
            }
        }


        System.out.printf("Decimos premiados:%n");
        // comprueba el valor de la primera columna del array decPremiados
        for (int i = 0; i < decPremiados.length; i++) {
            if (decPremiados[i][0] == 1) {
                System.out.printf("Tu decimo (%d) ha sido premiado con El Gordo con 400.000 €%n", decPremiados[i][1]);
            } else if (decPremiados[i][0] == 2) {
                System.out.printf("Tu decimo (%d) ha sido premiado con el 2do premio de 125.000 €%n", decPremiados[i][1]);
            } else if (decPremiados[i][0] == 3) {
                System.out.printf("Tu decimo (%d) ha sido premiado con el 3er premio de 50.000 €%n", decPremiados[i][1]);
            } else if (decPremiados[i][0] == 4) {
                System.out.printf("Tu decimo (%d) ha sido premiado con el 4to premio de 20.000 €%n", decPremiados[i][1]);
            } else if (decPremiados[i][0] == 5) {
                System.out.printf("Tu decimo (%d) ha sido premiado con el 5to premio de 6.000 €%n", decPremiados[i][1]);
            }
        }

        fila = 0;

        // comprueba si es en número anterior o posterior a los 3 primeros premios
        for (int i = 0; i < decimos.length; i++) {
            if ( (decimos[fila] == (premios[0][1] + 1) ) || (decimos[fila] == (premios[0][1] - 1) )) {
                System.out.printf("Tu decimo %d ha sido premiado con 2000 €.%n", decimos[fila]);
                fila++;
            } else if ( (decimos[fila] == (premios[1][1] + 1) ) || (decimos[fila] == (premios[1][1] - 1) ) ) {
                System.out.printf("Tu decimo %d ha sido premiado con 1250 €.%n", decimos[fila]);
                fila++;
            } else if ( (decimos[fila] == (premios[2][1] + 1) ) || (decimos[fila] == (premios[2][1] - 1)) ) {
                System.out.printf("Tu decimo %d ha sido premiado con 960 €.%n", decimos[fila]);
                fila++;
            }
        }

/*        for ( int i = 0 ; i < 3 ; i++ ) {
            int prem1 = premios[0][1];
            int prem2 = premios[1][1];
            int prem3 = premios[2][1];

            int cociente = premios[i][1] / 100;
            int residuo = premios[i][1] % 100;

            // Redondear hacia abajo o hacia arriba según el residuo
            int numeroRedondeado;
            if (residuo < 50) {
                numeroRedondeado = cociente * 100;
            } else {
                numeroRedondeado = (cociente + 1) * 100;
            }
            System.out.printf ( "%d %n" , numeroRedondeado );
        }*/

    }// comprobarSorteoNavidad

    /**
     * Función que genera 1807 números aleatorios del 00000 al 99999 que no se repiten
     * y devuelve en un array 2D los 5 primeros números.
     * @return int [][] array que contiene 5 filas con los números premiados
     */
    private static int[][] loterialNavidad() {
        int[] numAlea = new int[1807];

        // genera un número aleatorio que no se repite
        for (int i = 0; i < numAlea.length; i++) {
            int nRan = (int) (Math.random() * 99999 + 1);
            numAlea[i] = nRan;
            while (contieneNumero(numAlea, nRan)) {
                nRan = (int) (Math.random() * 99999 + 1);
            }
        }// fin for

        // creación del array 2D que contiene los números ganadores
        int[][] premiados = new int[5][2];
        int numPremiados = 5;

        // rellena el array 2D con los números premiados
        for (int i = 0; i < numPremiados; i++) {
            premiados[i][0] = i + 1;// prmio 1 , premio 2 ... hasta 5 filas
            premiados[i][1] = numAlea[i];
        }

        return premiados;
    }// fin-class loterialNavidad

    /**
     * Función que comprueba que un número está dentro de un array 1D
     *
     * @param array1D array donde se buscará el número
     * @param numero  número que se va a buscar
     * @return true si se encuentra el número
     */
    private static boolean contieneNumero(int[] array1D, int numero) {
        for (int i = 0; i < array1D.length; i++) {
            if (array1D[i] == numero) {
                return true;
            }
        }
        return false;
    }// fin contieneNumero

}// fin-class Ejercicio23
