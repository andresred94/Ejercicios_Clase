package EjerciciosPseint;

import java.util.Scanner;

public class CalcularFondo {

    //atributos
    private static Scanner lector = new Scanner(System.in);

    //metodo-principal

    public static void ejecutarPrograma (){
        int cantUser, inteUser,anios;
        int rentAnual;
        cantUser = obtCantidadBase();
        inteUser = obtInteres();
        anios = obtAnios();

        rentAnual = calcularRenta(cantUser,inteUser);

        System.out.println("La renta anual es de: " + rentAnual);

        calcularRentPorAno(anios,rentAnual,cantUser);



    }

    //metodos-secundarios

    /**
     * funcion que muestra la retabilidad cada año
     * @param anio
     */
    public static void  calcularRentPorAno (int anio , int cant , int canTini) {
        int resp;

        for (int i = 1; i <= anio; i++) {
            resp = (cant * i) + canTini;
            System.out.printf("%nPara el año %d la renta anual fue de %d",i,resp);
        }
    }

    /**
     * funcion que calcula la renta anual
     * @param cant entero (cantidad a invertir)
     * @param inte entero (intereses anuales)
     * @return
     */
    public static int calcularRenta( int cant, int inte){
        int rentAnual;
                rentAnual = (cant * inte) / 100;
        return rentAnual;
    }

    /**
     * funcion que obtiene los años a invertir
     * @return enteroo (anios)
     */
    public static int obtAnios (){
        int anios;
        System.out.println("Ingresa la cantidad de años que quieres invertir: ");
        anios = lector.nextInt();
        return anios;

    }

    /**
     * funcion que pide un interes anual
     * @return entero (interes)
     */
    public static int obtInteres(){
        int interes;
        System.out.println("Ingresa el % de interes anual que quieras: ");
        interes = lector.nextInt();
        return interes;
    }

    /**
     * funcion que pide una cantidad a invertir
     * @return entero (cantidad)
     */
    public static int obtCantidadBase(){
        int cantBase;
        System.out.println("Ingresa la cantidad a invertir: ");
        cantBase = lector.nextInt();
        return cantBase;
    }

}// final calcularFondo
