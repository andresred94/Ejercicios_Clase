package ActividadesUT04;

public class Ejercicio15 {

    public static void ejecutarPrograma(){

        int [] nums = {1,2,3,1,1,4,6,7,8};
        int buscarN = 2;
        // ToDo implementar mensaje en plural y singular
        System.out.printf ( "El número %d se encuentra %d veces." , buscarN , aparicionesNumero ( nums , buscarN ) );


    }// fin ejecutarPrograma

    private static int aparicionesNumero(int [] numeros, int numero){
        int cantVeces = 0;
        for ( int i = 0 ; i < numeros.length ; i++ ) {
            if ( numeros[i] == numero ){
                cantVeces++;
            }
        }// fin for
        return cantVeces;
    }

}// fin-class Ejercicio15
