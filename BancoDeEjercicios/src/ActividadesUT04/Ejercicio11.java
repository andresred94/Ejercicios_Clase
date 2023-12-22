package ActividadesUT04;

public class Ejercicio11 {

    public static void  ejecutarPrograma(){

        System.out.println ( meQuiereNoMeQuiere ( 55 ));

    }// fin ejecutarPrograma

    /**
     * Función un entero devuelve una posición de un array que contiene.
     * npetalos % 5 = devuelve un rango de enteros {0-4}
     * Máximo número de petalos que puede ingresar para que salga una respueta distinta es 12.
     * @param npetalos numero de petalos que ingresas
     * @return el valor de uno de los indices que contiene el array
     */
    private static String meQuiereNoMeQuiere ( int npetalos) {

        String[] arr ={"Un poco...", "Mucho...",  "Apasionadamente...", "Locamente...", "Nada de nada..."};
        int n = 1;
        switch ( n ){
            case 1:
                n++;
        }

        return arr[npetalos % 5];
    }// fin meQuiereNoMeQuiere
}// fin-class Ejercicio11
