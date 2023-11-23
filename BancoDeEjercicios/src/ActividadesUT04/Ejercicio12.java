package ActividadesUT04;

public class Ejercicio12 {

    public static void ejecutarPrograma(){

        System.out.println (obtenerMedia(new int[] {2,2,2,2}));;

    }// ejecutarPrograma

    /**
     * Función que calcula la media de la suma de todas las posiciones de un array
     * @param notas array que vamos a calcular
     * @return entero
     */
    private static int obtenerMedia(int [] notas){
        int resp = 0;
        // recorre el array y suma todas las posiciones
        for ( int i = 0 ; i < notas.length ; i++ ) {
            resp += notas[i];
        }

        Math.floor ( resp = resp / notas.length);// ToDo ¿Es necesario Math.floor?
        return resp;

    }// fin obtenerMedia


}// fin-class Ejercicio12
