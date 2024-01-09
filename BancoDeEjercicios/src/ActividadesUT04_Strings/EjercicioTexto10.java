package ActividadesUT04_Strings;

public class EjercicioTexto10 {

    public static void main ( String[] args ) {
        int n = 1001;
        System.out.println (capicua ( n ));

    }// fin main

    /**
     * Función que devuelve true si el número es capicua y false si no es capicua
     * @param numero numero que se va a analizar
     * @return true si es capicua
     */
    private static boolean capicua(int numero){
        String num = Integer.toString ( numero );
        String ninv = "";
        int cont = 0;
        for ( int i = num.length () ; i > 0 ; i-- ) {
            ninv += num.charAt(cont);
            cont++;
        }

        return ninv.equals( num );
    }// fin capicua

}// fin-class EjercicioTexto10
