package ActividadesUT04_Strings;

import java.util.Scanner;

public class EjercicioTexto13 {
    private static Scanner lector = new Scanner ( System.in );
    public static void main ( String[] args ) {
        System.out.printf ( "Bienvenido a la App para gestionar tareas%n" );
        menu ();

    }// fin main

    private static void menu (){
        String [] listaDetareas = new String[10];
        for (int i = 0; i < listaDetareas.length; i++) {
            listaDetareas[i] = " ";
        }
        int cont = 0;
        int opEscg = 1;
        // control de errores
        while ( opEscg == -1 ){
            System.out.printf ( "Error : opción no válida. Vuelve a ingresar una opción = " );
            opEscg = obtenerRango1_5 ();
        }

        do {

            System.out.printf ( "Menú:%n" );
            System.out.printf ( "1.-Introducir tarea.%n" );
            System.out.printf ( "2.-Listar tareas.%n" );
            System.out.printf ( "3.-Eliminar tarea.%n" );
            System.out.printf ( "4.-Eliminar todas las tareas.%n" );
            System.out.printf ( "5.-Salir.%n" );
            System.out.printf ( "Escoge una de las opciones = " );
            opEscg = obtenerRango1_5 ();
            lector.nextLine();

            if (opEscg == 1){
                System.out.printf ( "Introduce el nombre de la tarea = " );
                String tags = lector.nextLine ();
                introducirTarea ( listaDetareas, tags , cont);
                ++cont;
            }

            if (opEscg == 2){
                listarTareas ( listaDetareas );
            }

            if (opEscg == 3 ){
                System.out.printf ( "Introduce la tarea que quieres eliminar = " );
                int n = lector.nextInt ();
                eliminarTarea ( listaDetareas , n );
            }

            if (opEscg == 4){
                eliminarTodas ( listaDetareas );
            }

        }while ( opEscg!= 5 );

    }// fin menu

    private static void eliminarTodas (String [] list){
        for ( int i = 0 ; i < list.length ; i++ ) {
            list[i] = "";
        }
    }// fin eliminarTodas

    private static void eliminarTarea (String [] list , int indc){
        list[indc - 1] = " ";
    }// fin elimitarTarea

    private static void listarTareas (String [] list){
        for ( int i = 0 ; i < list.length ; i++ ) {
            System.out.printf ( "tarea nº%d: %s%n" , i + 1 , list[i] );
        }
    }// fin listarTareas

    private static void introducirTarea (String [] list , String tar, int indc){
        list[indc] = tar;
    }// fin introducirTarea

    private static int obtenerRango1_5 (){
        int n = lector.nextInt ();
        if ( n > 6 || n < 1 ){
            n = -1;
        }
        return n;
    }// fin obEntPos

}// fin-class EjercicioTexto13
