package LaboratorioDePruebas;

import java.util.Scanner;

public class DiaDeLaSemana {

    // atributos
    static Scanner lector = new Scanner(System.in);

    //<-- metodos principales -->//

    public static void ejecutarPrograma (){
        int diaS;
        String dia = "";

        System.out.println ("Ingresa un número del 1 al 7");
        diaS = pedirDia ();

        switch ( diaS ){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                System.out.println ("Error: no has ingresado un dia valido");
                break;
        }// fin switch

        System.out.printf ( "El dia equivalente es: %s" , dia );

    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//

    public static int pedirDia (){
        int n;
        n = lector.nextInt ();
       return n ;
    }// fin pedirDia

}// fin-class DiaDeLaSemana
