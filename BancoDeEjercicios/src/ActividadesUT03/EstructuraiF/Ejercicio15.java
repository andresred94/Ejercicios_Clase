package ActividadesUT03.EstructuraIF;

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
            System.out.printf ( "%nEres mayor de edad" );
        } else {
            System.out.printf ( "%nNo eres mayor de edad" );
        }




    }// fin ejecutarPrograma


    private static boolean esMayorEdad (int dia , int mes , int anio){
        // Obtener la fecha actual en Java
        java.util.Date date = new java.util.Date();
        java.time.LocalDate localDate = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        int anioActual  = localDate.getYear();
        int mesActual = localDate.getMonthValue();
        int diaActual   = localDate.getDayOfMonth();
        boolean esCierto = false;

        int restoAnios = anioActual - anio;
        int restoMeses = Math.abs ( mesActual - mes );
        int restoDias = Math.abs ( diaActual - dia );

        System.out.printf ( "dia %d mes %d año %d" , restoDias , restoMeses , restoAnios);

        if ( restoAnios >= 18 ){
            esCierto = true;
        } else if ( restoAnios <= 18 && restoMeses <= 12  && restoDias <= 31 ){
            esCierto = false;
        }

        return esCierto;
    }

    // <-- metodos secundarios --> //
    private static boolean esFechaCorrecta ( int dia , int mes , int anio ) {
        boolean esCierto = false;
        if ( dia >= 1 && dia <= 31 ) {
            if ( mes >= 1 && mes <= 12 ) {
                if ( anio >= 1 ) {
                    esCierto = true;
                }
            }
        }
        return esCierto;
    } // fin esFechaCorrecta

    private static int obEntero () {
        int n = lector.nextInt ();
        if ( n < 0 ) {
            System.out.println ( "Error: no has ingresado un dato válido" );
            n = -1;
        }
        return n;
    }// fin obEntero

}// fin-class Ejercicio15
