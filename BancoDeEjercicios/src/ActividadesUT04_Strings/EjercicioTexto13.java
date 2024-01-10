package ActividadesUT04_Strings;

import java.util.Scanner;

public class EjercicioTexto13 {
    private final static Scanner lector = new Scanner ( System.in );
    public static void main ( String[] args ) {
        System.out.printf ( "Bienvenido a la App para gestionar tareas%n" );
        menu ();
        lector.close();
    }// fin main

    private static void menu (){
        String [] listaDetareas = new String[10];
        for (int i = 0; i < listaDetareas.length; i++) {
            listaDetareas[i] = " ";
        }
        int cont = 0;
        int opEscg;
        do {
            System.out.printf ( "Menú:%n" );
            System.out.printf ( "1.-Introducir tarea.%n" );
            System.out.printf ( "2.-Listar tareas.%n" );
            System.out.printf ( "3.-Eliminar tarea.%n" );
            System.out.printf ( "4.-Eliminar todas las tareas.%n" );
            System.out.printf ( "5.-Salir.%n" );
            System.out.printf ( "Escoge una de las opciones = " );
            opEscg = lector.nextInt ();// solo lee los entero pero no lee la tecla "enter"
            lector.nextLine();// cosume el caracter "enter"
            // control de errores
            while ( opEscg < 1 ){
                System.out.printf ( "Error : opción no válida. Vuelve a ingresar una opción = " );
                opEscg = lector.nextInt ();
            }

            switch ( opEscg ){
                case 1:
                    System.out.printf ( "Introduce el nombre de la tarea = " );
                    String tags = lector.nextLine ();
                    introducirTarea ( listaDetareas, tags , cont);
                    ++cont;
                    break;
                case 2:
                    listarTareas ( listaDetareas );
                    break;
                case 3:
                    System.out.printf ( "Introduce la tarea que quieres eliminar = " );
                    int n = lector.nextInt ();
                    eliminarTarea ( listaDetareas , n );
                    break;
                case 4:
                    eliminarTodas ( listaDetareas );
                    break;
            }// fin switch

        }while ( opEscg!= 5 );

    }// fin menu

    private static void eliminarTodas (String [] list){
        for ( int i = 0 ; i < list.length ; i++ ) {
            list[i] = " ";
        }
    }// fin eliminarTodas

    private static void eliminarTarea (String [] list , int indc){
        list[indc - 1] = " ";
    }// fin elimitarTarea

    private static void listarTareas (String [] list){
        System.out.printf ("Listado de tareas:%n");
        boolean esCierto = false;
        for ( int i = 0 ; i < list.length ; i++ ) {
            if ( !(list[i] == " ") ){
                System.out.printf ( "tarea nº%d: %s%n" , i + 1 , list[i] );
            }
            for ( int j = 0 ; j < list.length ; j++ ) {
                if ( list[0].length () == 1 && list[j].length () == 1){
                    esCierto = true;
                }
            }
        }

        if ( esCierto ){
            System.out.printf ( "No hay tareas que mostrar.%n" );
        }

    }// fin listarTareas

    private static void introducirTarea (String [] list , String tar, int indc){

        for (int i = 0; i < list.length; i++) {
            if (tar.equals(list[i])) {
                System.out.println("La tarea está repetida");
                return; // Salir del método si la tarea ya existe
            }
        }
        list[indc] = tar;
    }// fin introducirTarea

}// fin-class EjercicioTexto13
