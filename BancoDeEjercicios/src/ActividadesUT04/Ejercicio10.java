package ActividadesUT04;

public class Ejercicio10 {

    public static void ejecutarPrograma(){

        boolean [] arrayOvejas = {true,  true,  true,  false, true,
                true,  true,  true , true,  false, true,  false, true,
                false, false, true , true,  true,  true,  true , false,
                false, true,  true};
        System.out.printf ( "El número de ovejas en el establo es %d", contarOveja ( arrayOvejas ) );

    }// fin ejecutarPrograma

    /**
     * Cuenta cuantos "true" hay en un array 1D
     * @param matrizOvejas array que va a recorrer
     * @return cantidad de veces repetidas true
     */
    private static int contarOveja(boolean [] matrizOvejas){
        int contOvj = 0;
        for ( int i = 0 ; i < matrizOvejas.length ; i++ ) {
            boolean esCierto = matrizOvejas[i];
            if ( esCierto ){
                contOvj++;
            }
        }
        return contOvj;
    }// fin contarOveja

}// fin-class Ejercicio10
