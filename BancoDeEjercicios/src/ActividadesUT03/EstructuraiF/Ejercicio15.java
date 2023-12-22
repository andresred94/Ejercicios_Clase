package ActividadesUT03.EstructuraIF;

import java.util.EventListener;
import java.util.Scanner;

public class Ejercicio15 {

    // atributos
    protected static Scanner lector = new Scanner ( System.in );

    public static void ejecutarPrograma(){
        int dIn , mIn , aIn;

        System.out.printf ( "%nComprueba si eres mayor de edad a dia de hoy%n" );
        System.out.printf ( "Ingresa tu día de nacimiento = " );
        dIn = obEntero ();
        System.out.printf ( "Ingreesa tu mes de nacimiento = " );
        mIn = obEntero ();
        System.out.printf ( "Ingresa tu año de nacimiento = " );
        aIn = obEntero ();

        if ( esMayorEdad ( dIn , mIn , aIn ) ){
            System.out.printf ( "Eres mayor de edad" );
        } else {
            System.out.printf ( "No eres mayor de edad" );
        }
    }// fin ejecutarPrograma


    private static boolean esMayorEdad (int dia , int mes , int anio){
        // Obtener la fecha actual en Java
        java.util.Date date = new java.util.Date();
        java.time.LocalDate localDate = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        int anioActual  = localDate.getYear();
        int mesActual = localDate.getMonthValue();
        int diaActual   = localDate.getDayOfMonth();
        boolean esCierto;

        int restoAnios = anioActual - anio;
        int restoMeses = mesActual - mes;
        int restoDias = diaActual - dia ;

        // Verificar si la persona ha cumplido 18 años o está a punto de cumplirlos
        if (restoAnios > 18 || (restoAnios == 18 && (mesActual > mes || (mesActual == mes && diaActual >= dia)))) {
            esCierto = true;
        } else {
            System.out.printf ( "Te quedan  %d dia(s), %d mese(s) y %d año(s) para ser mayor de edad" , restoDias , restoMeses , restoAnios);
            esCierto = false;
        }
        return esCierto;
    }// fin esMayorEdad

    // <-- metodos secundarios --> //
    private static int obEntero () {
        int n = lector.nextInt ();
        if ( n < 0 ) {
            System.out.println ( "Error: no has ingresado un dato válido" );
            n = -1;
        }
        return n;
    }// fin obEntero

}// fin-class Ejercicio15
