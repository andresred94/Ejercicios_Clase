package LaboratorioDePruebas;

import java.util.Scanner;

public class Examen1Eva {
    public static final int VALOR_SEGUNDOS_MINUTOS = 60;
    public static final int VALOR_MINUTOS = 3600;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Elige una opción de las siguientes:");
        System.out.println("1- Calcular Segundos");
        System.out.println("2- Calcular precio");
        System.out.println("3- Salir");
        int opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Vamos a calcular los segundos que han transcurrido hasta este momento," +
                        " para ello necesitaré que me introduzcas los siguientes datos: ");
                System.out.println("Introduce la hora");
                int hora = entrada.nextInt();

                System.out.println("Introduce los minutos");
                int minuto = entrada.nextInt();

                System.out.println("Introduce los segundos");
                int segundo = entrada.nextInt();
                int canttotalSeg = calculaSegundos ( hora , minuto , segundo );


                while ( canttotalSeg == -1 ){
                    System.out.printf ( "Has ingresado horas no válidas : ingresa otra = " );
                    hora = entrada.nextInt();
                    System.out.printf ( "Has ingresado minutos no validos : ingresa otra = " );
                    minuto = entrada.nextInt();
                    System.out.printf ( "Has ingresado segundos no validos : ingresa otra = " );
                    segundo = entrada.nextInt();
                    canttotalSeg = calculaSegundos ( hora , minuto , segundo );
                }

                System.out.printf ( "A las %d:%d:%d han transcurrido %d.%n" , hora, minuto , segundo , canttotalSeg  );

                break;
            case 2:
                System.out.println("Venta de entradas para el espectáculo de navidad");
                System.out.println("¿Cuántas entradas quieres?");
                int cantidadEntradas = entrada.nextInt();

                System.out.println("El precio total de las entradas es " + calculaPrecio(cantidadEntradas) + " euros");
                break;
            case 3:
                break;
            default:
                System.out.println("La opción elegida no es correcta. Introduzca una válida.");;

        }
    }

    private static int calculaPrecio(int numEntradas) {
        int entradaGeneral = 13, entradaMenores2 = 0, entradaMenores13 = 8, entradaMayores65 = 10;

        System.out.println("De esas " + numEntradas + " entradas ¿Cuántas son entrada general?");
        int general = entrada.nextInt();

        System.out.println("De esas " + numEntradas + " entradas ¿Cuántas son para menores de 2 años?");
        int menores2Anios = entrada.nextInt();

        System.out.println("De esas " + numEntradas + " entradas ¿Cuántas son para mayores de 2 años pero menores de 13?");
        int menores13Anios = entrada.nextInt();

        System.out.println("De esas " + numEntradas + " entradas ¿Cuántas son para mayores de 65 años?");
        int mayores65Anios = entrada.nextInt();

        int precioTotal = (entradaGeneral * general) + (entradaMenores2 * menores2Anios) + (entradaMenores13 * menores13Anios)
                + (entradaMayores65 * mayores65Anios);


        return precioTotal ;
    }

    private static int calculaSegundos(int horas, int minutos, int segundos) {

        int cantMinutos = horas * 60 + minutos;
        int cantSegundos = cantMinutos * 60 + segundos;

        if ( (horas < 0 || horas > 24) || (minutos < 0 || minutos > 60) || (segundos < 0 || segundos > 60) ){
            System.out.printf ( "Error : uno de los valores es erroneo.%n" );
            cantSegundos = -1;
        }


        return cantSegundos;

    }



}
