package ActividadesUT03.EstructuraIF;

import java.util.Scanner;

public class Ejercicio10 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );
    private enum Notas {INSUFICIENTE,SUFICIENTE,BIEN,NOTABLE,SOBRESALIENTE,ERROR};

    // <-- métodos principales --> //
    public static void ejecutarPrograma(){
        int nIngresado;
        System.out.printf("%nComprueba la calificación de tu nota...%n");
        System.out.printf("Ingresa una nota = ");
        nIngresado = obEntero010();

        // control de errores
        while ( nIngresado == -1 ){
            System.out.printf("%sVuelve a ingresar otro valor = " , obtenerNota(nIngresado));
            nIngresado = obEntero010();
        }
        System.out.printf("%s " , obtenerNota(nIngresado));
    }// fin ejecutarPrograma


    // <-- metodos secundarios --> //
    private static String obtenerNota (int nota){
        String resp;

        switch (nota){
            case 1,2,3,4:
                resp = "Tu nota es " + Notas.INSUFICIENTE;
                break;
            case 5:
                resp = "Tu nota es " + Notas.SUFICIENTE;
                break;
            case 6:
                resp = "Tu nota es " + Notas.BIEN;
                break;
            case 7,8:
                resp = "Tu nota es " + Notas.NOTABLE;
                break;
            case 9,10:
                resp = "Tu nota es " + Notas.SOBRESALIENTE;
                break;
            default:
                resp = Notas.ERROR + " : nota no válida.";
        }
        return resp;
    }// fin obtenerNota

    private static int obEntero010(){
        int n = lector.nextInt();
        // control de errores
        if ( n < 0 || n > 10 ){
            n = -1;
        }

        return n;
    }// fin obEntero

}// fin-class Ejercicio10
