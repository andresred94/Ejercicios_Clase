package ActividadesUT02.VariablesyOperaciones;

public class Ejercicio2 {

    //<-- Métodos principales -->//
    public static void ejecutarPrograma (){

        // atributos
        int cantDepo = 2000;
        double pFijo = 0.0275 , benef;

        benef = cantDepo + (cantDepo * pFijo);

        System.out.printf ( "%nPara la cantidad de %d€%n",cantDepo );
        System.out.printf ( "con un interes a plazo fijo de 2.75%% anual%n" , pFijo );
        System.out.printf ( "el beneficio obtenido será de %.0f€ al año%n" , benef);

        benef = benef - (benef * 0.018);

        System.out.printf ( "Con el descuento del 18%% del gobierno es de %.0f%n" , benef );

    }// fin ejecutarPrograma

}// fin-class Ejercicio2
