package ActividadesUT03.EstructuraSwitch;

import java.util.Scanner;

public class Ejercicio5 {
    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma (){

        System.out.printf ( "%nDevuelve el numero del nombre de un mes%n" );
        System.out.printf ( "Ingresa un mes p.ej. enero = " );
        String fraseIng = obtenerFrasemin ();

        while ( numeroMes ( fraseIng ) == "error" ){
            System.out.printf ( "Error : no has ingresado un valor válido.%n" );
            System.out.printf ( "Ingresa un mes p.ej. enero = " );
            fraseIng = obtenerFrasemin ();
        }

        System.out.printf ( "El numero del es = %s" , numeroMes ( fraseIng ));

    }// fin ejecutarPrograma

    private static String numeroMes (String mes){
        String resp;
        switch ( mes ){
            case "enero":
                resp = "1";
                break;
            case "febrero":
                resp = "2";
                break;
            case "marzo":
                resp = "3";
                break;
            case "abril":
                resp = "4";
                break;
            case "mayo":
                resp = "5";
                break;
            case "junio":
                resp = "6";
                break;
            case "julio":
                resp = "7";
                break;
            case "agosto":
                resp = "8";
                break;
            case "septiembre":
                resp = "9";
                break;
            case "octubre":
                resp = "10";
                break;
            case "noviembre":
                resp = "11";
                break;
            case "diciembre":
                resp = "12";
                break;
            default:
                resp = "error";
                break;
        }
        return resp;
    }// fin numeroMes

    private static String obtenerFrasemin (){
        String frase = (lector.nextLine ()).toLowerCase ();
        return frase;
    }// fin obtenerFrasemin

}// fin-class Ejercicio5
