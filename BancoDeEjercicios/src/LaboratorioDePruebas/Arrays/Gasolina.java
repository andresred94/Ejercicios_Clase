package LaboratorioDePruebas.Arrays;

import java.util.Scanner;

public class Gasolina {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        /*Escribe un programa par calcular el consumo medio de un automóvil. Para ello el programa debe solicitar información
        sobre las tres últimas veces que se repostó combustible:
        1. De la primera debe solicitar el precio del litro de combustible, el total pagado en llenar el depósito y el
        número de kms que marcaba el cuentakilómetros.
        2. De la segunda vez sólo solicitará el precio del litro de combustible y el total pagado en llenar el depósito.
        3. De la tercera vez solicitará el valor que indicaba el cuentakilómetros.

        Con estos datos debe calcular el consumo por cada 100 kms y el coste por km.

        Para calcular el consumo medio hay que tener en cuenta cuántos kms se han hecho con el coche y cuántos litros
        de combustible se han consumido. El total de litros de gasolina consumida es la suma de litros de los dos
        repostajes realizados, ya que de lo que reposte en el último no se puede conocer cuántos kms se van a hacer hasta
        que se consuma el combustible que se ha echado. A partir del precio por litro y el total pagado se puede obtener
        el número de litros que se han echado en el depósito. El consumo por cada 100 kms se calcula como el consumo total
        dividido por el número de kms multiplicado por 100. El coste por km se calcula como lo que se ha pagado en los
        repostajes dividido por el total de kms realizados.*/

        calcularConsumo();

    }

    private static void calcularConsumo() {
        int n = 1;
        System.out.printf ( "%02d" , n );

        // 1er repostaje
        System.out.println("1ª Vez que repostaste");

        float precioLitro1 = obtenerEntradaFloat("Escribe el precio del litro");
        float totalPagado1 = obtenerEntradaFloat("Escribe el total pagado");
        float litros1 = totalPagado1 / precioLitro1;
        float km1 = obtenerEntradaFloat("Escribe el número de kms que marcaba el cuentakilómetros");

        // 2do repostaje
        System.out.println("2ª Vez que repostaste");

        float precioLitro2 = obtenerEntradaFloat("Escribe el precio del litro");
        float totalPagado2 = obtenerEntradaFloat("Escribe el total pagado");
        float litros2 = totalPagado2 / precioLitro2;

        // 3er repostaje
        System.out.println("3ª Vez que repostaste");

        float km2 = obtenerEntradaFloat("Escribe el número de kms que marcaba el cuentakilómetros");

        // Calculos
        float litrosConsumidos = litros1 + litros2;
        float totalKmRealizados = km1 + (km2 - km1);
        float consumoPorKm = (totalKmRealizados != 0) ? (litrosConsumidos / totalKmRealizados) * 100 : 0;
        float costeKm = (totalKmRealizados != 0) ? (totalPagado1 + totalPagado2) / totalKmRealizados : 0;

        mostrarResultados(litrosConsumidos, totalKmRealizados, consumoPorKm, costeKm);
    }

    private static float obtenerEntradaFloat(String mensaje) {
        System.out.println(mensaje);
        return entrada.nextFloat();
    }

    private static void mostrarResultados(float litrosConsumidos, float totalKmRealizados, float consumoPorKm, float costeKm) {
        System.out.println("Has consumido " + litrosConsumidos + " litros.");
        System.out.println("Has realizado " + totalKmRealizados + " kilómetros.");
        System.out.println("El consumo por km es " + consumoPorKm);
        System.out.println("El coste por km es " + costeKm);
    }
}