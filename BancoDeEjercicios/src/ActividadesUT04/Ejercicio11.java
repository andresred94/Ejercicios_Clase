package ActividadesUT04;

public class Ejercicio11 {

    public static void  ejecutarPrograma(){

        System.out.println ( meQuiereNoMeQuiere ( 12 ));

    }// fin ejecutarPrograma

    private static String meQuiereNoMeQuiere ( int npetalos) {

        String[] arr ={"Un poco...", "Mucho...",  "Apasionadamente...", "Locamente...", "Nada de nada..."};

        return arr[npetalos % 5];
    }
}// fin-class Ejercicio11
