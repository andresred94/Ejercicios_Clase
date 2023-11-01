package ActividadesUT02.EntradaDatos;

import java.util.Scanner;

public class Ejercicio6 {
    // atributos
    static Scanner lector = new Scanner(System.in);

    // <-- Metodos pricipales -->
    public static void ejecutarPrograma () {
        double ejeX, ejeY, resp;
        int x1 , x2 , y1 , y2;
        // lectura de datos
        System.out.println("Calculadora de distancia");
        System.out.println("ingresa las coordenadas de X del punto A: ");
        x1 = lector.nextInt();
        System.out.println("ingresa las coordenadas de Y del punto A: ");
        y1 = lector.nextInt();

        System.out.println("ingresa las coordenadas de X del punto B: ");
        x2 = lector.nextInt();
        System.out.println("ingresa las coordenadas de Y del punto B: ");
        y2 = lector.nextInt();

        // resta entre ambos puntos
        ejeX = coorEjeX(x1,x2);
        ejeY = coorEjeX(y1,y2);

        // calcular la distacia con el teorema de pitagoras
        resp = Math.sqrt((ejeX * ejeX) + (ejeY * ejeY));

        System.out.println("La ditancia entre el punto A y el punto B es: " + resp);

    }

    //-- METODOS SECUNDARIOS --//

    /**
     * funcion que lee dos coordenadas en el eje X
     * y devuelve la resta entre ambos
     * @param x1 entero
     * @param x2 entero
     * @return result entero
     */
    public static int coorEjeX ( int x1 , int  x2) {
        int result = x2 - x1;
        return result;
    }// fin coordEjeX

    /**
     * funcion que lee dos coordenadas en el eje Y
     * y devuelve la resta entre ambos
     * @param y1 entero
     * @param y2 entero
     * @return result entero
     */
    public static int coordEjeY(int y1, int y2){
        int result  = y2 - y1;
        return result;
    }// fin coordEjeY

}// fin-class Ejercicio6
