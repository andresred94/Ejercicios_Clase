package EjerciciosPseint;

import java.util.Scanner;

public class AdivinarNumero {

    //atributos
    static Scanner lector = new Scanner(System.in);



    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma () {
        int numAleatori, n;
        System.out.println("Intenta adivinar un número del 1 al 100");
        n = pedirNumero();

        numAleatori = (int) (Math.random() * 100 + 1);

        while ( numAleatori != n ) {
            if ( n > numAleatori ) {
                System.out.println("ingresa un número menor");
                n = pedirNumero();
            } else {
                System.out.println("ingresa un número mayor");
                n = pedirNumero();
            }
        }

        System.out.println("¡Enhorabuena has adivinado el número");

    }// fin ejecutarPrograma






    //-- METODOS SECUNDARIOS --//

    public static int pedirNumero (){
        int numIngresado;
        numIngresado = lector.nextInt();
        while ( numIngresado < 0 & numIngresado > 100 ){
            System.out.println("error: vuelve a ingresar un número. ");
            numIngresado = lector.nextInt();
        }
        return numIngresado;
    }// fin pedirNumero

}// fin AdivininarNumero
